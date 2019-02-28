package com.cts.grizzlystore.service;

import com.cts.grizzlystore.dao.AddProductDAO;
import com.cts.grizzlystore.dao.AddProductDAOImpl;

public class AddProductServiceImpl implements AddProductService {
	private static AddProductServiceImpl add_prodImpl;	
	private AddProductDAO a_dao = AddProductDAOImpl.getInstance();

	public static AddProductServiceImpl getInstance()
	{
		if(add_prodImpl==null)
		{
			add_prodImpl = new AddProductServiceImpl();
			return add_prodImpl;
		}
		else
		{
			return add_prodImpl;
		}
	}
	
	public String insert(String id, String cat, String name, String des, float price, String brand, String offer,
			String rating) {
		// TODO Auto-generated method stub
		return a_dao.insert(id,cat,name,des,price,brand,offer,rating);
	}}
