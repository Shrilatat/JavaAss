package firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		// HttpSession session = req.getSession();
		// session.setAttribute("username", "Kshitij");
	
		
		out.print("<html>");
		out.print("<body><h1>Hello World Welcome to Servlets</h1></body>");
		out.print("</html>");
		
		RequestDispatcher reqDis = new RequestDispatcher("displayServlet");
		reqDis(req,resp);
		// forward = Permanently transfer control from one servlet to other (Like goto statement)
		// include = Go to that servlet, But come back after processing that servlet
	}
}
