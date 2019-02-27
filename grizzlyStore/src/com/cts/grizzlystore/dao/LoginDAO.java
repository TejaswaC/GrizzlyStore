package com.cts.grizzlystore.dao;

import com.cts.grizzlystore.bean.User;

public interface LoginDAO {

	public User authenticate(String user,String pass);
	
}
