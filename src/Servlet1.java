

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	final PrototypeClass1 person = new PrototypeClass1();
	final static PrototypeClass1 human = new PrototypeClass1();
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
   	private void createPrototypePrivClass(HttpServletRequest request, HttpServletResponse response) {
		human.setMonth(request.getParameter("month"));
		human.setGenre(request.getParameter("genre"));

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		createPrototypePrivClass(request, response);
		out.println("Movie: "+"<br><br>");
		out.println("<html>");
		out.println("<title>Potatoflick");
		out.println("</title>");
		out.println("<body>");
		
		
		

			
		out.println("Your chosen genre is " + human.getGenre() +"<br><br>");
		out.println("Your chosen month is " + human.getMonth() + human.parseString(human.getGenre())+"<br><br>");
		
		doGet(request, response);
	}

}
