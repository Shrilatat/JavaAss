package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/si")
public class si extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		float pa = Float.parseFloat(req.getParameter("pa"));
		float roi = Float.parseFloat(req.getParameter("roi"));
		float time = Float.parseFloat(req.getParameter("time"));
		
		float si = (pa*roi*time)/100F;
		float amount = si+pa;
		
		out.println("Simple Interest: "+String.format("%.2f", si));
		out.println("<br />");
		out.println("Total Amount: "+String.format("%.2f", amount));
		
	}

}
