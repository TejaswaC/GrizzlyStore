package com.cts.grizzlystore.service;

import com.cts.grizzlystore.bean.*;

public interface LoginService {
	public User authenticate(String userName, String password);
	
	
	
}
