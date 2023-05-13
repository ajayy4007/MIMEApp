package com.nt.servlet;
import java.io.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import javax.servlet.*;

public class HtmlServlet extends HttpServlet {
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		res.setHeader("refresh","10");
		pw.println("<table border='i';text-align='center'>");
		pw.println("<tr><th>Player Name</th><th>Medal</th><th>Category</th></tr>");
		pw.println("<tr><td>Neeraj Chopra</td><td>Gold</td><td>Javlin Throw</tr>");
		pw.println("<tr><td>Meera bai Chanu</td><td>Silver</td><td>WightLifiting</td></tr>");
		pw.println("<tr><td>Ravi kumar Dhaiya</td><td>Silver</td><td>Wresling</td></tr>");
		pw.println("<tr><td>Lovlina</td><td>Bronze</td><td>Boxing</td></tr>");
		pw.println("<tr><td>Hokey</td><td>Bronze</td><td>MensHockey</td></tr>");
		pw.println("<tr><td>Bajarang Puniya</td><td>Bronze</td><td>Wresling</td></tr>");
		pw.println("</table>");
		pw.println("<br><h1 style='color:red';text-align='center'>Date and Time is::"+new java.util.Date()+"</h1>");
		pw.println("<br>req object class name::"+req.getClass());
		pw.println("<br>req object class name::"+req.getClass());
		pw.close();
	}
}
