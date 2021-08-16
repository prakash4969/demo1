package BookStore;


	import java.io.FileInputStream;
	import java.io.InputStream;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	public class jdbc {
	   public static void main(String args[]) throws Exception{
	      //Registering the Driver
		   Class.forName("com.mysql.cj.jdbc.Driver"); 
	      //Getting the connection
	      String mysqlUrl = "jdbc:mysql://localhost:3306/login";
	      Connection con = DriverManager.getConnection(mysqlUrl, "root", "4969");
	      System.out.println("Connection established......");
	      PreparedStatement pstmt = con.prepareStatement("INSERT INTO books VALUES(?,?,?,?,?)");
	      pstmt.setInt(1, 2);
	      pstmt.setString(2, "artificial");
	      
	     
	      //Inserting Blob type
	      pstmt.setString(3, "artificial.jpg");
	      pstmt.setFloat(4, (float) 45.00);
	      pstmt.setString(5,"computer");
	      //Executing the statement
	      pstmt.execute();
	      System.out.println("Record inserted......");
	   }
	}
	


