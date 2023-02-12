package JDBC;
import java.sql.*;
import java.util.Scanner;
public class Demo7 
{

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/profound","root","Pratiksha@123");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the rollno,name and marks:-");
			int rollno=sc.nextInt();
			String name=sc.next();
			int marks=sc.nextInt();
			CallableStatement cs=con.prepareCall("call procstud(?,?,?)");
			cs.setInt(1,rollno);
			cs.setString(2, name);
			cs.setInt(3, marks);
			cs.execute();
			System.out.println("Stored procedure execute ");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
