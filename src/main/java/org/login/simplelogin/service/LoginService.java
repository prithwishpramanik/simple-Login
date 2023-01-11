package org.login.simplelogin.service;

public class LoginService {
  public boolean auth(String userid,String password) {
	  if (password == null || password.trim() == "") {
		  return false;
	  }
	  return true;
  }
}
