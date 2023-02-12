package JDBC;
import java.sql.*;
import java.util.*;
public class Demo3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try
		{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Profound","root","Pratiksha@123");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=sc.next();
	PreparedStatement ps=con.prepareStatement("select * from student where name=?");
	ps.setString(1, name);
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
	}
	else
	
		System.out.println("Record not found");
		rs.close();
		con.close();
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}

