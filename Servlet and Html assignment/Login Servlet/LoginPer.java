import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginp")
public class LoginPer extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("username");
		String pass = req.getParameter("password");

		if (name.equals("kira") && pass.equals("late"))

			out.println("<h1>Login Successful</h1>");

		else

			out.println("<h1>Failure</h1>");

	}

}
