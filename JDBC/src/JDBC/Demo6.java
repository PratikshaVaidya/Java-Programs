//WAP to accept rollno and delete the record of that student

package JDBC;
import java.sql.*;
import java.util.*;
public class Demo6 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Profound","root","Pratiksha@123");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the rollno:-");
			int rollno=sc.nextInt();
			PreparedStatement ps=con.prepareStatement("Delete from student where rollno=?");
			ps.setInt(1, rollno);
			ps.executeUpdate();
			System.out.println("Record deleted successfully");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
