package FoodDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Food.Usersignup;

public class UserDao {
	public int registerUsersignup(Usersignup usersignup) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO Usersignup" +
            "  (id, first_name, last_name, contact, Email, password) VALUES " +
            " (?, ?, ?, ?, ?,?,?,?,?);";



       int result = 0;



       Class.forName("com.mysql.jdbc.Driver");



       try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "groot");



           // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, usersignup.getFirstName());
            preparedStatement.setString(3, usersignup.getLastName());
            preparedStatement.setString(4, usersignup.getContact());
            preparedStatement.setString(5, usersignup.getEmail());
            preparedStatement.setString(6, usersignup.getPassword());



           System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();



       } catch (SQLException e) {
            // process sql exception
            e.printStackTrace();
        }
        return result;
    }
}

	
