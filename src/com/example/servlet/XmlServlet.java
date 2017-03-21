package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		String userName = req.getParameter("name");
		writer.println("Hello from the GET method " + userName);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		String userName = req.getParameter("name");
		String fullName = req.getParameter("fullName");
		String profession = req.getParameter("profession");
		String[] gender = req.getParameterValues("gender");
		writer.println("Hello from the post method , " + userName + " and Full Name is "+ fullName+" and the profession is "+ profession);
		writer.println("The size of the array is "+ gender.length);
		for(int i=0 ; i<gender.length;i++)
		{
			writer.println("Genders can be "+ gender[i]);
			
		}
	}

	
	
}
