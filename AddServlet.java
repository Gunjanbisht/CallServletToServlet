package com.gunjan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k= i+j;
		

	request.setAttribute("name",k );

	RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
rd.forward(request, response);
	
	}

}
 
	
	


