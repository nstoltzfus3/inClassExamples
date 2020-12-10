package com.nick.ecommerce.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.nick.ecommerce.model.Product;
import com.nick.ecommerce.model.Role;
import com.nick.ecommerce.model.User;
import com.nick.ecommerce.repository.RoleRepository;
import com.nick.ecommerce.repository.UserRepository;

@Service
public class UserService implements UserDetailsService{

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, 
                       RoleRepository roleRepository,
                       BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
    
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
        
    
    public void save(User user) {
        userRepository.save(user);
    }
    
    public void saveExisting(User user) {
        userRepository.save(user);
    }
    
    public User saveNewUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        return userRepository.save(user);
    }
    
    public User getLoggedInUser() {
        String loggedInUsername = SecurityContextHolder.
          getContext().getAuthentication().getName();
        
        return findByUsername(loggedInUsername);
    }
    
    public void updateCart(Map<Product, Integer> cart) {
        User user = getLoggedInUser();
        System.out.println(cart);
        user.setCart(cart);
        saveExisting(user);
    }

	
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = findByUsername(username);
        if(user == null) throw new UsernameNotFoundException("Username not found.");
        return (UserDetails)user;
    }
}