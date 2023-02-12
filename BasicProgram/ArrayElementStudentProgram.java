package BasicProgram;
import java.util.Scanner;
import java.io.*;
class Student
{
	int rn;
	String name;
	float res;
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Rollno,name and result:-");
		rn=sc.nextInt();
		name=sc.next();
		res=sc.nextFloat();
	}
	void put()
	{
		System.out.println("rollno="+rn+" "+"name="+name+" "+"result="+res);
	}
}
public class ArrayElementStudentProgram {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.get();
		s1.put();

	}

}
