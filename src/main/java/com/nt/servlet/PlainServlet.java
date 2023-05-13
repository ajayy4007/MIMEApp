package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PlainServlet extends HttpServlet {
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/plain");
		PrintWriter pw=res.getWriter();
		pw.println("<table border='i';text-align='center'>");
		pw.println("<tr><th>Player Name</th><th>Medal</th><th>Category</th></tr>");
		pw.println("<tr><td>Neeraj Chopra</td><td>Gold</td><td>Javlin Throw</tr>");
		pw.println("<tr><td>Meera bai Chanu</td><td>Silver</td><td>WightLifiting</td></tr>");
		pw.println("<tr><td>Ravi kumar Dhaiya</td><td>Silver</td><td>Wresling</td></tr>");
		pw.println("<tr><td>Lovlina</td><td>Bronze</td><td>Boxing</td></tr>");
		pw.println("<tr><td>Hokey</td><td>Bronze</td><td>MensHockey</td></tr>");
		pw.println("<tr><td>Bajarang Puniya</td><td>Bronze</td><td>Wresling</td></tr>");
		pw.println("</table>");
		pw.close();
}
}
