package BookStore;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addToCart
 */
@WebServlet("/addToCart")
public class addToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addToCart() {
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
		 try 
	       {  
	      	 Class.forName("com.mysql.cj.jdbc.Driver"); 
	           //Getting the connection
	           String mysqlUrl = "jdbc:mysql://localhost:3306/login";
	           Connection con = DriverManager.getConnection(mysqlUrl, "root", "4969");
	           System.out.println("Connection established......"); 
	           System.out.println("came inside");
	           System.out.println(request.getSession().getAttribute("name"));
	           System.out.println(request.getSession().getAttribute("price"));
				  PreparedStatement pstmt =
				  con.prepareStatement("INSERT INTO addtocart VALUES(?,?)");
				  String abc = (String) request.getSession().getAttribute("name");
				  float  def = (float) request.getSession().getAttribute("price");
				  pstmt.setString(1,abc);
				  pstmt.setFloat(2,def);
				  System.out.println("got values");
				  pstmt.execute();
				 System.out.println("values inserted");
   	      response.sendRedirect("Category.jsp");
	       }   catch (Exception e) 
        {  
      	   System.out.println("error");  
     }  

	}

}
