package com.hsbc.trg;
import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hsbc.trg.AddNewEmployeeDao;
import com.hsbc.bean.EmployeeRegisterationbeans;
public class AddNewEmployeeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		AddNewEmployeeDao newemp= new AddNewEmployeeDao();
		
		newemp.addEmployee(new EmployeeRegisterationbeans());
		
		out.println("Employee Added");
		
	

	}
	

}
