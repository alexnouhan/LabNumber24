package com.coffee.CoffeeShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {

	@Autowired
	UserJDBCDao dao;
	
	private User freshGround;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping("/register")
	public ModelAndView RegistrationPage() {
		return new ModelAndView("register");
	}

	@RequestMapping("/signin")
	public ModelAndView SignInPage() {
		return new ModelAndView("signin");
	}

	@RequestMapping("newUser")
	public ModelAndView userRegistration(User user) {
		dao.addUser(user.getusername(), user.getPassword(), user.getFirstname(), user.getLastname(), user.getEmail(), user.getGender(), user.getBday());
		ModelAndView mv = new ModelAndView("welcome", "hiya", "Hello, " + user.getFirstname());
		return mv;
	}

	@RequestMapping("enter")
	public ModelAndView accessSite() {
		return new ModelAndView("coffee");
	}
	

}
