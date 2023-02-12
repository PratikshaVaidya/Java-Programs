//WAP to accept rollno and marks and update the marks of that student.

package JDBC;

import java.sql.*;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Profound","root","Pratiksha@123");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the rollno and marks:-");
			int rollno=sc.nextInt();
			int marks=sc.nextInt();
			PreparedStatement ps=con.prepareStatement("update student set marks=? where rollno=?");
			ps.setInt(1, marks);
			ps.setInt(2, rollno);
			ps.executeUpdate();
			System.out.println("Record updated successfully!!!");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	}


