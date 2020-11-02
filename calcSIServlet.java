package pack_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcinterest")
public class calcSIServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		float f1=Float.parseFloat((req.getParameter("pa")));
		float f2=Float.parseFloat((req.getParameter("yr")));
		float f3=Float.parseFloat((req.getParameter("rate")));
		out.println("Simple Interest equals : " + f1*f2*f3/100);
		
	}
}
