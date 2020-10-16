package firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNumbersServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		int a = Integer.parseInt(req.getParameter("first"));
		int b = Integer.parseInt(req.getParameter("second"));
		int c = a + b;
		
		out.print("<html>");
		out.print("<body><h1> The Addition is" +c+ "</h1></body>");
		out.print("</html>");
	}
}
