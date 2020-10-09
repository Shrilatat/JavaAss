package com.trg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookStoreServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String category = req.getParameter("category");
		BookStoreDao dao = new BookStoreDao();
		String[] books = dao.getBooks(category);
		out.print("<html><head><style>\\r\\n\" + \r\n" + 
				"	    		\"table, th, td {\\r\\n\" + \r\n" + 
				"	    		\"  border: 1px solid black;\\r\\n\" + \r\n" + 
				"	    		\"  border-collapse: collapse;\\r\\n\" + \r\n" + 
				"	    		\"}\\r\\n\" + \r\n" + 
				"	    		\"</style></head>");
		out.print("<body><table width = \\\"100%\\\">");
		for(String book : books)
		{
			out.print("<tr><td>" + book + "</td><td>" + category + "</td></tr>");
		}
		out.print("</table></body>");
		out.print("</html>");
	}
	
	

}
