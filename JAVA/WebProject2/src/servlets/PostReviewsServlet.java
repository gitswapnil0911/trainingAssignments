package servlets;

import java.io.IOException;
import java.io.PrintWriter;

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
@WebServlet(name = "PostReviews", urlPatterns = { "/postReviews" })
public class PostReviewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Reviews currentReviews = new Reviews();
		currentReviews.addReview("Very Good");
		currentReviews.addReview("Good");
		currentReviews.addReview("Excellent");
		currentReviews.addReview("Bakwas");
		currentReviews.addReview("Faltu");
		
		ServletContext ctx = getServletContext();
		ctx.setAttribute("reviews", currentReviews);
		out.println("<h2>Reviews posted successfully</h2>");
		}

}
