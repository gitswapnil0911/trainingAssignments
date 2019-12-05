package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UserCredentials;
import beans.UserValidationBean;

/**
 * Servlet implementation class UserValidationServlet
 */
@WebServlet("/validate")
public class UserValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserValidationServlet() {
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
		String password = request.getParameter("pwd");
		
		UserCredentials currentCredentials = new UserCredentials(userName, password);
		boolean success = UserValidationBean.isValid(currentCredentials);
		if(success) {
			RequestDispatcher rd = request.getRequestDispatcher("userDetails");
			request.setAttribute("greetingMessage", "Welcome");
			request.setAttribute("credentials", currentCredentials);
			rd.forward(request, response);
		}
		else {
			out.println("<h2>Invalid username or password. Try Again</h2>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		
	}

}
