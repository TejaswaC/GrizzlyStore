package com.cts.grizzlystore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import com.cts.grizzlystore.bean.User;
import com.cts.grizzlystore.util.DBUtils;

public class LoginDAOImpl implements LoginDAO {

	public static LoginDAOImpl loginDAOImpl;
	
	public static LoginDAOImpl getInstance()
	{
		if(loginDAOImpl == null)
			
		{
			loginDAOImpl = new LoginDAOImpl();
			return loginDAOImpl;	
		}
		else
		{
			return loginDAOImpl;
		}
		
		
	}
	private LoginDAOImpl()
	{
		
	}
	@Override
	public User authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		String query = "select * from login where userId=? and password=?";
		Connection connection=null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		connection = DBUtils.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,userName);
			preparedStatement.setString(2,password);
			
			

			resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{

				String userN = resultSet.getString(1);
				
				String pass = resultSet.getString(2);

				String userType = resultSet.getString(3);

				String userStatus = resultSet.getString(4);

		
				String contactNo = resultSet.getString(5);

				String address = resultSet.getString(6);

				String name = resultSet.getString(7);

				String designation = resultSet.getString(8);
				
				String id = resultSet.getString(9);
				
				User u1 = new User(userN,userType,userStatus,contactNo,address,name,designation,id);

				return u1;
			}
		}
		catch(SQLException e)
		{e.printStackTrace();}
		return null;	}

}
