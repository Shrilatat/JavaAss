package firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleInterestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		int p = Integer.parseInt(req.getParameter("principal"));
		int n = Integer.parseInt(req.getParameter("years"));
		int r = Integer.parseInt(req.getParameter("rate"));
		int interest = p * n * r;
		
		out.print("<html>");
		out.print("<body><h1> The SImple Interest is" +interest+ "</h1></body>");
		out.print("</html>");
	}
}