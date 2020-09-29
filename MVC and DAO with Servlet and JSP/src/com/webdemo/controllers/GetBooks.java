package com.webdemo.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webdemo.dao.BookImplementation;
import com.webdemo.dao.IBook;

@WebServlet("/getBooks")
public class GetBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String subject = request.getParameter("subject");
		String author = request.getParameter("author");
		
		PrintWriter out = response.getWriter();
		
		IBook book = new BookImplementation();
		
		request.setAttribute("booksByAuthor",book.getBooksByAuthor(author));
		request.setAttribute("booksBySubject",book.getBooksBySubject(subject));
		
		RequestDispatcher rd = request.getRequestDispatcher("viewBooks.jsp");
		rd.forward(request, response);
	}

}
