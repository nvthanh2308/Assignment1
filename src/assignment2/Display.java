package assignment2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class Display
 */
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Display() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        out.println("<html><body>");
       try {
    	   	String userName = "root";
    	   	String password = "1234";
    	   	String url = "jdbc:mysql://localhost:3306/demo";   	  
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =(Connection) DriverManager.getConnection(url,userName, password);
        
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from demo.new_table");
            out.println("<table border=1 width=10% height=10%>");
            out.println("<tr><th>Table_ID</th><th>Table_name</th><th>Table_status</th><tr>");
            while (rs.next()) {
           	 
           	 	int tid	  = rs.getInt("Table_ID");
                String tn = rs.getString("Table_name");
                String ts = rs.getString("Table_status"); 
                
                out.println("<tr><td>" + tid + "</td><td>" + tn + "</td><td>" + ts + "</td></tr>"); 
            }
            out.println("</table>");
            out.println("</html></body>");
            con.close();
           }
            catch (Exception e) {
            out.println("error");
        }
    }
}
