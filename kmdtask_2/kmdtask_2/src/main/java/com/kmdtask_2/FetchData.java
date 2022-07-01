package com.kmdtask_2;

import java.io.IOException;
import java.io.PrintWriter;
import mysqlLog4j.Demo;
//import kmb_task2.LogicClass;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FetchData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FetchData() {
        super();    
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		int empId = Integer.parseInt(request.getParameter("empId"));
		//LogicClass.EmployeeData(empId);
		//Demo.method1(empId);
		Demo obj=new Demo();
		obj.method1(empId);	
		out.println();
	}
}
