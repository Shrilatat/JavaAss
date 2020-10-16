package firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInputFormServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String usernameP = "Username";
		String passwordP = "Password";
		String genderP = "Gender";
		String languagesP = "Languages";
		String instructions = "Instructions";
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String []languages = req.getParameterValues("languages");
		out.print("");
		
		out.print("<html>");
		out.print("<body><table><tr><td>"+usernameP+"</td></tr><tr><td>"+username+"</td></tr><tr><td>"+passwordP+"</td></tr><tr><td>"+password+"</td></tr></table></body>");
		out.print("</html>");
	}
}
