package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Reviews;

/**
 * Servlet implementation class PostReviewsServlet
 */
@WebServlet(name = "GetReviews", urlPatterns = { "/getReviews" })
public class GetReviewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext ctx = getServletContext();
		Object obj = ctx.getAttribute("reviews");
		Reviews reviews = (Reviews)obj;
		List<String> listOfReviews = reviews.getReviewList();
		out.println("<h2>Show all the reviews:</h2>");
		
		for(String review : listOfReviews) {
			out.println("<h3>"+review+"</h3>");	
		}
		}

}
