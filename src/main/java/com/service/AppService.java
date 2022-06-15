package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Login;
import com.model.User;

@Service
public class AppService {
	
	List<User> list= new ArrayList<User>();
	
	public boolean loginValidate(Login login) {
		if(login.getUname().equals("admin") && login.getPass().equals("pass@123")) {
			return true;
		}
		return false;
	}
	public void addUser(User user) {
		 list.add(user);
	}
	
	public List<User> loadUsers(){
		return list;
	}
	
	public boolean findUser(String name) {
		for(User user :list) {
			if(user.getUname().equals(name)) {
				System.out.println("user found" + user.getUname());
				return true;
			}
		}
		return false;
	}

}
