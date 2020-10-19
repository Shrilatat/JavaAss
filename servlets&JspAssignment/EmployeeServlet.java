package com.hsbc.trg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * 
 * @author Fareeya Khan
 * 
 * 
 * */

public class EmployeeServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String employeeid=req.getParameter("employeeid");
		System.out.println("Employeeid="+employeeid);
		if(employeeid!=null)
		{
			int empid=Integer.parseInt(employeeid);
			EmpDao e1= new EmpDao();
			String[]str=e1.display(empid);
			req.setAttribute("strarr", str);
			/*
			 * HttpSession session = req.getSession(); session.setAttribute("strarr", str);
			 *  key-value pair
			 */
			RequestDispatcher rd= req.getRequestDispatcher("Employee.jsp");
			 rd.include(req, resp);
			 
			/*for(String s: str)
			{
				System.out.println(s);
			}
			if(str.length>0)
			{
				out.print("<html>");
				out.println("<table border=1>");
				out.println("<tr><td>EmployeeID</td><td>EmployeeName</td><td>Salary</td></tr>");
				out.println("<tr><td>"+str[0]+"</td><td>"+str[1]+"</td><td>"+str[2]+"</td></tr>");
				out.print("</table>");
				out.print("</html>");
			}
		
		*/
		}
		
		
	}

}
