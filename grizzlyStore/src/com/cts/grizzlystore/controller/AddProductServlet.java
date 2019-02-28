package com.cts.grizzlystore.controller;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.grizzlystore.service.AddProductService;
import com.cts.grizzlystore.service.AddProductServiceImpl;



/**
 * Servlet implementation class AddProductServlet
 */
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String prodId = request.getParameter("productId");
		String category = request.getParameter("category");
		String name = request.getParameter("productName");
		String description = request.getParameter("productDescription");
		Float price = Float.parseFloat(request.getParameter("productPrice"));
		String brand = request.getParameter("brand");
		String offer = request.getParameter("offer");
		String rating = request.getParameter("rating");



		System.out.println(prodId +"  "+ category +"  "+ name + "  "+description + "  "+price + brand+"  "+offer+"  "+rating);
		
		
		AddProductService addproductService = AddProductServiceImpl.getInstance();
		addproductService.insert(prodId,category,name,description,price,brand,offer,rating);	
		}

}
