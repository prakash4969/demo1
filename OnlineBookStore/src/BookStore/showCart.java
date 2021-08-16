package BookStore;

import java.io.IOException;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class showCart
 */
@WebServlet("/showCart")
public class showCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showCart() {
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
	           Statement stmt = con.createStatement(); 
	        	  String  query ="select * from addtocart";
	        	  ResultSet rs = stmt.executeQuery(query);  
	        	   String nme = null;
	               String prc=null;
	               while (rs.next()) 
		           {  
	            	   nme = rs.getString("bookName");  
	            	   prc = rs.getString("price");
	            	   
	            	   request.setAttribute("name", nme);
			 			 request.setAttribute("price", prc);
			 			 
			 			  RequestDispatcher rsp = request.getRequestDispatcher("cart.jsp"); //the page you want to send your value
			 			  rsp.forward(request,response);
			 			  
			 			  con.close();
	}
	       }
	           catch (Exception e) 
	          {  
	        	   System.out.println("error");  
	       }  
	}

}
