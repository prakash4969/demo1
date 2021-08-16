package BookStore;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Category
 */
@WebServlet("/Category")
public class Category extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Category() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try 
	       {  
			 String name = request.getParameter("name");
			 System.out.println(name);
	      	 Class.forName("com.mysql.cj.jdbc.Driver"); 
	           //Getting the connection
	           String mysqlUrl = "jdbc:mysql://localhost:3306/login";
	           Connection con = DriverManager.getConnection(mysqlUrl, "root", "4969");
	           System.out.println("Connection established......"); 
	           Statement stmt = con.createStatement();  
	           String button = request.getParameter("button");
	           String query = "";
	           if(button.equals("Computer")) {
	        	    query ="select * from books where Category = 'Computer'";
	           }else if(button.equals("BigData")) {
	        	    query ="select * from books where Category = 'BigData'";
	           }else if(button.equals("Math")) {
	        	    query ="select * from books where Category = 'Math'";
	           }else if(button.equals("AddToCart")) {
					  PreparedStatement pstmt =
					  con.prepareStatement("INSERT INTO addtocart VALUES(?,?,?,?,?)");
					  pstmt.setInt(1, 5); pstmt.setString(2, "theCleanCoder");
					  
					  
					  //Inserting Blob type pstmt.setString(3, "Books/Computer/theCleanCoder.jpg");
					  pstmt.setFloat(4, (float) 28.99); pstmt.setString(5,"Computer"); //Executing
					  pstmt.execute();
					 
	        	      response.sendRedirect("Category.jsp");
	           }
	           ResultSet rs = stmt.executeQuery(query);     
	           int ra = 1110 ;
               request.setAttribute("na", ra);
               int n = 0;
               String nm = null;
               String nmm=null;
               float nmmm = 0;
	           while (rs.next()) 
	           {  
	                n = rs.getInt("id");  
	                nm = rs.getString("bookName");  
				    nmm = rs.getString("image"); 
	                nmmm = rs.getFloat("price"); 
	               
	               request.setAttribute("name", n);
		 			 request.setAttribute("name1", nm);
		 			 request.setAttribute("name2", nmm);
		 			request.setAttribute("name3", nmmm);//set it to the request
		 			  RequestDispatcher rsp = request.getRequestDispatcher("Computer.jsp"); //the page you want to send your value
		 			  rsp.forward(request,response);
	                  
	               System.out.println( n + "  " + nm + "   " + nmm + "   "+nmmm);  
	              
	           }  
		         
	 			  
	     
	           con.close();  
	          }  
	           catch (Exception e) 
	          {  
	        	   System.out.println("error");  
	       }  
	}

}
