package com.nick.ecommerce.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nick.ecommerce.model.Product;
import com.nick.ecommerce.model.User;
import com.nick.ecommerce.service.ProductService;
import com.nick.ecommerce.service.UserService;

@Controller
@ControllerAdvice
public class CartController {
	@Autowired
	ProductService productService;

	@Autowired
	UserService userService;

	@ModelAttribute("loggedInUser")
	public User loggedInUser() {
		return userService.getLoggedInUser();
	}

	@ModelAttribute("cart")
	public Map<Product, Integer> cart() {
		User user = loggedInUser();
		if (user == null)
			return null;
		
		Map<Product, Integer> userCart = new HashMap<Product, Integer>(user.getCart());
		return userCart;
	}

	@ModelAttribute("list")
	public List<Double> list() {
		return new ArrayList<>();
	}
//////////////
	@GetMapping("/cart")
	public String showCart() {
		return "cart";
	}

	@PostMapping("/cart")
	public String addToCart(@RequestParam long id) {
		System.out.println(id);
		Product p = productService.findById(id);
		Map<Product, Integer> cart = cart();
		System.out.println("Posting to cart" + cart);
		setQuantity(p, cart.getOrDefault(p, 0) + 1);
		return "redirect:/cart";
	}

	@PostMapping("/cart/update")
	public String updateQuantities(@RequestParam long[] id, @RequestParam int[] quantity) {
		for (int i = 0; i < id.length; i++) {
			Product p = productService.findById(id[i]);
			setQuantity(p, quantity[i]);
		}
		return "redirect:/cart";
	}

	@PostMapping("/cart/delete")
	public String removeFromCart(@RequestParam long id) {
		Product p = productService.findById(id);
		setQuantity(p, 0);
		return "redirect:/cart";
	}

	private void setQuantity(Product p, int quantity) {
		Map<Product, Integer> userMap = userService.getLoggedInUser().getCart();
		if (quantity > 0)
			userMap.put(p, quantity);
		else
			userMap.remove(p);

		userService.updateCart(userMap);
	}

}