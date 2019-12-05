package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.User;
import beans.UserCredentials;
import repository.UserRepository;

/**
 * Servlet implementation class UserDetailsServlet
 */
@WebServlet("/userDetails")
public class UserDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("userId");
		String grMsg = (String) request.getAttribute("greetingMessage");
		UserCredentials credentials = (UserCredentials) request.getAttribute("credentials");
		User userInfo = UserRepository.getUserByCredentials(credentials);
		
		out.println("<h2>"+grMsg+"</h2>");
		out.println("<h2>Hello "+ userName + ", showing your details: </h2>");
		
		String firstName = userInfo.getFirstName();
		String lastName = userInfo.getLastName();
		String email = userInfo.getEmailAddress();
		
		out.println("<h3> First Name: "+firstName+"</h3>");
		out.println("<h3> Last Name: "+lastName+"</h3>");
		out.println("<h3> Email: "+email+"</h3>");
		
		
	}

}
