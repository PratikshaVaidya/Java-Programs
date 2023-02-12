package JDBC;
import java.util.*;
import java.sql.*;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Profound","root","Pratiksha@123");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the roll no:-");
			int rollno=sc.nextInt();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from student where rollno="+rollno);
			if(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			else
			{
			System.out.println("Record not found!!");
			rs.close();
			con.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
