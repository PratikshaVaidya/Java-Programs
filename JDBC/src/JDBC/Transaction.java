package JDBC;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Transaction {

	public static void main(String[] args)
	{
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/profound","root","Pratiksha@123");
			Scanner sc=new Scanner(System.in);
			con.setAutoCommit(false);
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.println("Enter roll no:-");
				int rollno=sc.nextInt();
				System.out.println("Enter the name:-");
				String name=sc.next();
				System.out.println("Enter the marks:-");
				int marks=sc.nextInt();
				ps.setInt(1, rollno);
				ps.setString(2, name);
				ps.setInt(3, marks);
				
				System.out.println("Commit/rollback");
				String answer=br.readLine();
				if(answer.equals("Commit"))
				{
					con.commit();
				}
				if(answer.equals("Rollback"))
				{
					con.rollback();
				}
				System.out.println("Do you want to save the changes:-");
				String ch=sc.next();
				if(ch.equals("n"))
				{
					break;
				}
				
			}
			con.commit();
			System.out.println("Record Successfully save");
			con.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
