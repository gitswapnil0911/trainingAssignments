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
import beans.Personal;
import beans.Profile;

/**
 * Servlet implementation class EducationalServlet
 */
@WebServlet("/educational")
public class EducationalServlet extends HttpServlet {
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String qualification = request.getParameter("qualification");
		String university = request.getParameter("university");
				
		Educational educationalInfo = new Educational(qualification, university);
		HttpSession session = request.getSession();
		System.out.println("Session Created: "+session.isNew());
		
		Profile myProfile = (Profile) session.getAttribute("currentProfile");
		myProfile.setEducationalInfo(educationalInfo);
		session.setAttribute("currentProfile", myProfile);
		
		RequestDispatcher rd = request.getRequestDispatcher("result.html");
		out.println("<h2> Educational Details Added Successfully</h2>");
		rd.include(request, response);
	}

}
