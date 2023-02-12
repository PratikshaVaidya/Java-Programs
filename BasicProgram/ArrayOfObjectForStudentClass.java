package BasicProgram;
import java.util.Scanner;
import java.io.*;
class students
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

public class ArrayOfObjectForStudentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students s1[]=new students[5];
		for(int i=0;i<5;i++)
		{
			s1[i]=new students();
			s1[i].get();
		}
		for(int i=0;i<5;i++)
		{
			//s1[i]=new student();
			s1[i].put();
		}
	}

}
