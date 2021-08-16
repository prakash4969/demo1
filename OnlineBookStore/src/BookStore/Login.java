package BookStore;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private registerDAO regDAO;

	public void init() {
		regDAO  = new registerDAO() ;
	}
    /**
     * Default constructor. 
     */
    public Login() {
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
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		Member member = new Member();
		member.setUid(uname);
		member.setPassword(password);
		
		try {
			if(regDAO.validate(member)) {
				response.sendRedirect("Category.jsp");
			}else {
				response.sendRedirect("Login.jsp");	
			}
				
			
		} catch(ClassNotFoundException e) {
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}


