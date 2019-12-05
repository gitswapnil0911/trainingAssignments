package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdderServlet
 */
@WebServlet("/adder")
public class AdderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String s1 = request.getParameter("n1");
		String s2 = request.getParameter("n2");
		String button = request.getParameter("btn");
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		System.out.println(button);
		if(button.equals("ADD")) {
		
		int sum = n1 + n2;
		out.println("<h2>SUM = "+ sum + "</h2>");
		
		ServletContext ctx = getServletContext();
		ctx.setAttribute("resultMessage", "Showing Additional Result");
		
		HttpSession session= request.getSession();
		session.setAttribute("addResult", sum);
		
		RequestDispatcher rd = request.getRequestDispatcher("showAddResult.jsp");
		rd.forward(request, response);
		
		}
		else {
		int sub = n1-n2;
		out.println("<h2>SUBTRCTION = "+ sub + "</h2>");
		}
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String s1 = request.getParameter("n1");
		String s2 = request.getParameter("n2");
		String button = request.getParameter("btn");
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		System.out.println(button);
		if(button.equals("ADD")) {
		
		int sum = n1 + n2;
		out.println("<h2>SUM = "+ sum + "</h2>");
		}
		else {
		int sub = n1-n2;
		out.println("<h2>SUBTRCTION = "+ sub + "</h2>");
		}
	}


}
