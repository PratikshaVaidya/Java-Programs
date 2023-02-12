//WAP to insert values into the student table

package JDBC;
import java.sql.*;
import java.util.Scanner;
public class Demo4 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Profound","root","Pratiksha@123");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the rollno ,name and marks:-");
			int rollno=sc.nextInt();
			String name=sc.next();
			int marks=sc.nextInt();
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, rollno);
			ps.setString(2, name);
			ps.setInt(3, marks);
			ps.executeUpdate();
			System.out.println("Record inserted successfully!!!");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
