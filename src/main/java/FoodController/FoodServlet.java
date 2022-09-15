package FoodController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Food.Usersignup;
import FoodDao.UserDao;

/**
 * Servlet implementation class FoodServlet
 */
@WebServlet("/register")
public class FoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private UserDao userDao  = new UserDao();
     
    	 

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/Signup.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String contact = request.getParameter("contact");
        String Email = request.getParameter("Email");
        String password = request.getParameter("password");
        
        Usersignup usersignup = new Usersignup();
        usersignup.setFirstName(firstName);
        usersignup.setLastName(lastName);
        usersignup.setContact(contact);
        usersignup.setEmail(Email);
        usersignup.setPassword(password);
        
        try {
            userDao.registerUsersignup(usersignup);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/Signupsuccess.jsp");
            dispatcher.forward(request, response);

	}
}


















