package BookStore;

import java.sql.*;



public class registerDAO {
	
private String url = "jdbc:mysql://localhost:3306/login";
private String uname ="root";
private String pass ="4969";
private String dbdriver = "com.mysql.cj.jdbc.Driver";

public Connection getConnection() {
	
	Connection conn = null;
	try {
		conn = DriverManager.getConnection(url,uname,pass);
		
	}catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return conn;
	
}

public void loadDriver(String dbdriver) throws ClassNotFoundException {
	
	 Class.forName(dbdriver); 
}

public String insert(Member member) throws SQLException, ClassNotFoundException {
	
	loadDriver(dbdriver);
	Connection conn = getConnection();
	String result ="inserted data successfully";
	String sql = "insert into login values(?,?,?,?)";
	PreparedStatement ps = conn.prepareStatement(sql);
	ps.setString(1,member.getFname());
	ps.setString(2,member.getLname());
	ps.setString(3,member.getUid());
	ps.setString(4,member.getPassword());
	ps.executeUpdate();
	
	return result;
	
}

public boolean validate(Member member) throws SQLException, ClassNotFoundException  {
	boolean status = false;
	loadDriver(dbdriver);
	Connection conn = getConnection();
	PreparedStatement ps = conn.prepareStatement("select * from login where userName = ? and password = ? ");
	ps.setString(1, member.getUid());
	ps.setString(2, member.getPassword());
	
	System.out.println(ps);
	ResultSet rs = ps.executeQuery();
	status = rs.next();
	return status;
	
}

}
