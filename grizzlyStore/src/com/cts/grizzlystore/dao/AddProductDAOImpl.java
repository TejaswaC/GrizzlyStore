package com.cts.grizzlystore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.grizzlystore.util.DBUtils;


public class AddProductDAOImpl implements AddProductDAO {
	
	
	private static AddProductDAOImpl add_prodDAOImpl;	
	public static AddProductDAOImpl getInstance()
	{
		if(add_prodDAOImpl==null)
		{
			add_prodDAOImpl = new AddProductDAOImpl();
			return add_prodDAOImpl;
		}
		else
		{
			return add_prodDAOImpl;
		}
	}
	private AddProductDAOImpl()
	{	
		
	}
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public String insert(String id, String cat, String name, String des, float price, String brand, String offer, 
			String rating) {
		String query ="INSERT INTO product VALUES (?,?,?,?,?,?,?,?)";	
		Connection connection=null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet =null;
		connection = DBUtils.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,id);
			preparedStatement.setString(2,cat);
			preparedStatement.setString(3,name);
			preparedStatement.setString(4,des);
			preparedStatement.setFloat(5,price);
			preparedStatement.setString(6,brand);
			preparedStatement.setString(7,offer);
			preparedStatement.setString(8,rating);


			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{
				System.out.println("TUPPLE INSERTED");
				return "TUPPLE INSERTED";
			}
		}
		catch(SQLException e)
		{e.printStackTrace();}
		return null;
	}

}
