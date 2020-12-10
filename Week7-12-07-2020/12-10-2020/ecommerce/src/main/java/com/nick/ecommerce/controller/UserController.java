package com.nick.ecommerce.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.nick.ecommerce.model.User;
import com.nick.ecommerce.service.UserService;

@Controller
public class UserController {
    
    @Autowired
    private UserService userService;
    

    
    @GetMapping(value = "/users/{username}")
    public String getUser(@PathVariable(value = "username") String username, Model model) {
        User loggedInUser = userService.getLoggedInUser();
        User user = userService.findByUsername(username);
        boolean isFollowing = false;

        boolean isSelfPage = loggedInUser.getUsername().equals(username);
        model.addAttribute("isSelfPage", isSelfPage);
        model.addAttribute("following", isFollowing);
        model.addAttribute("user", user);
        return "user";
    }
    
    @GetMapping(value = "/users")
	public String getUsers(@RequestParam(value = "filter", required = false) String filter, Model model) {
		List<User> users = new ArrayList<User>();

		User loggedInUser = userService.getLoggedInUser();


		if (filter == null) {
			filter = "all";
		}
		model.addAttribute("users", users);


		return "users";
	}
    

    
    

}
