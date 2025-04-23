package com.KoreaIT.java.AM_jsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/print/Dan")
public class HomeMainServelt2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {	
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append("==8단==<br>");
		response.getWriter().append(String.format("%d *%d = %d<br>",8,2,16));
	}			
}
