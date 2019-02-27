package com.cts.grizzlystore.service;

import com.cts.grizzlystore.bean.User;
import com.cts.grizzlystore.dao.LoginDAO;
import com.cts.grizzlystore.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {
	private static LoginServiceImpl loginServiceImpl;
	private LoginDAO dao = LoginDAOImpl.getInstance();
	public static LoginServiceImpl getInstance()
	{
		if(loginServiceImpl==null)
		{
			loginServiceImpl = new LoginServiceImpl();
			return loginServiceImpl;
		}
		else
		{
			return loginServiceImpl;

		}
	}
	@Override
	public User authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		return dao.authenticate(userName, password);
	}

}
