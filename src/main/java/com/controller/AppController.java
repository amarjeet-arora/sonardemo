package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Login;
import com.model.User;
import com.service.AppService;

@RestController
@RequestMapping("/mainapp")
public class AppController {

	@Autowired
	private AppService appService;

	@PostMapping("/login")
	public String loginValid(@RequestParam String uname, @RequestParam String pwd) {
		Login login= new Login(uname,pwd);
		if (appService.loginValidate(login)) {
			return "login success";
		}
		return "login failure";
	}

	@PostMapping("/register")
	public String registerUser(@RequestParam String uname, @RequestParam String pass, @RequestParam String email,
			@RequestParam String city) {

		appService.addUser(new User(uname, pass, email, city));

		return "user registered";
	}
	@GetMapping("/loadusers")
	public List<User> loadUsers() {
		return appService.loadUsers();
	}
	@GetMapping("/finduser/{name}")
	public String findUser(@PathVariable String name) {
		if(appService.findUser(name)) {
			return "user found" + name;
		}
		return " user not found";
	}
	

}
