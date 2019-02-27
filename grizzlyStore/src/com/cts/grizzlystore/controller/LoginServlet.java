package com.cts.grizzlystore.controller;

import java.io.IOException; 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.cts.grizzlystore.bean.User;
import com.cts.grizzlystore.service.LoginService;
import com.cts.grizzlystore.service.LoginServiceImpl;



/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 123L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String userName = request.getParameter("userId");
		String password = request.getParameter("password");
		System.out.println(userName+" "+password);
		LoginService loginService = LoginServiceImpl.getInstance();
		if(loginService.authenticate(userName, password)!=null)
		{
			User u1 = loginService.authenticate(userName, password);
	        HttpSession session=request.getSession(); 
			session.setAttribute("userName",u1.getName());
			session.setAttribute("userId",u1.getId());
			session.setAttribute("designation",u1.getDesignation());
			session.setAttribute("address",u1.getAddress());



			RequestDispatcher rd = request.getRequestDispatcher("Admin-ListProducts.jsp");
			rd.forward(request, response);
		}

	}

}
