package JDBC;
import java.sql.*;
public class Demo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Profound","root","Pratiksha@123");
		System.out.println("connection establish");
		con.close();
		

	}

}
