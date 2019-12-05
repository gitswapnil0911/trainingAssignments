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

import beans.Personal;
import beans.Profile;

/**
 * Servlet implementation class PersonalServlet
 */
@WebServlet("/personal")
public class PersonalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		Personal personalDetails = new Personal(firstName, lastName, email);
		Profile myProfile = new Profile();
		myProfile.setPersonalInfo(personalDetails);
		
		HttpSession session = request.getSession();
		System.out.println("Session Created: "+session.isNew());
		session.setAttribute("currentProfile", myProfile);
		
		RequestDispatcher rd = request.getRequestDispatcher("educational.html");
		out.println("<h2> Personal Details Added Successfully</h2>");
		rd.include(request, response);
	}

}
