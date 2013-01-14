package nvthanh;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet implementation class HelloWorld
*/
public class HelloWorld extends HttpServlet {
private static final long serialVersionUID = 1L;

/**
* Default constructor.
*/
public HelloWorld() {
// TODO Auto-generated constructor stub
}

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	pw.println("<title>Hello world servlet</title>");
	pw.println("<h1>Hello World</h1>");
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
}

}