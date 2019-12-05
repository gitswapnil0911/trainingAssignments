package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Educational;
import beans.Profile;

/**
 * Servlet implementation class ShowProfileServlet
 */
@WebServlet("/showProfile")
public class ShowProfileServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		System.out.println("Session Created: "+session.isNew());
		Profile myProfile = (Profile) session.getAttribute("currentProfile");
		out.println("<h2> Showing Complete Profile</h2>");
		out.println("<h3> First Name : " + myProfile.getPersonalInfo().getFirstName()+"</h3>");
		out.println("<h3> Last Name : " + myProfile.getPersonalInfo().getLastName()+"</h3>");
		out.println("<h3> Email Address : " + myProfile.getPersonalInfo().getEmailAddress()+"</h3>");
		out.println("<h3> Qualification : " + myProfile.getEducationalInfo().getQualification()+"</h3>");
		out.println("<h3> University : " + myProfile.getEducationalInfo().getUniversity()+"</h3>");
		
	}

}
