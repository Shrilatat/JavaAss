package firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DisplayServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		// resp.setHeader("refresh", "1");
		
		// Date d = new Date();
		HttpSession session = req.getSession();
		String name = (String)session.getAttribute("username");
		
		out.print("<html>");
		// out.print("<body><h1>The Date is "+d.toString() +"</h1></body>");
		// out.print("<body><h1>Hello "+name+" </h1></body>");
		out.print("")
		out.print("</html>");
	}
}
