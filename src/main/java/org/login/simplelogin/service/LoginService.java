package org.login.simplelogin.service;

import java.util.HashMap;

import org.login.simplelogin.dto.User;

public class LoginService {
	HashMap<String, String> users = new HashMap<String, String>();

	public LoginService() {
		users.put("mantu", "mantu pramanik");
		users.put("prithwish", "prithwish pramanik");
		users.put("p pramanik", "p pramanik");

	}

	public boolean auth(String userid, String password) {
		if (password == null || password.trim() == "") {
			return false;
		}
		return true;
	}

	public User getUserdetails(String userid) {
		     User user =new User();
		     user.setUserName(users.get(userid));
		     user.setUserId(userid);
             return user;
	}
}
