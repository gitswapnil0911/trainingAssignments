package example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String msg = getInitParameter("greetingMessage");
		String nm = getInitParameter("name");
		out.println("<h2>"+msg+" "+nm+"</h2>");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Inside init");
		super.init(config);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy");
		super.destroy();
	}
	
	

}
