/*5. Create a userdefined Exception classes IncorrectAgeException & 
IncorrectNationalityException
Write a class Voter with constructors and methods toString(), check(String 
name, int age)
The check (…) should check for Nationality and age for voting and throw 
appropriate Exception
Accept the Name, Nationality & age from use*/
package Assignment8;
//import java.lang.*;
import java.util.*;
class IncorrectAgeException extends Exception
{
	IncorrectAgeException(String msg)
	{
		super(msg);
	}
}
class IncorrectNationalityException extends Exception
{
	IncorrectNationalityException(String msg)
	{
		super(msg);
	}
}
class Voter
{
	String name;
	int age;
	String nationality;
	public Voter(String name, int age, String nationality) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}
	void display() 
	{
		try
		{
		if(age<18)
		
			throw new IncorrectAgeException("your not eligible for voting because your age is not 18+ !!");
		
		 if(nationality!="Indian")
			throw new IncorrectNationalityException("You are not eligible for voting because you are not indian");
		 else 
		 System.out.println("you are eligible for voting!!!");
		}
		catch(IncorrectAgeException iae)
		{
			System.out.println(iae);
		}
		catch(IncorrectNationalityException ine)
		{
			System.out.println(ine);
		}
		
	}
	
	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + ", Nationality=" + nationality + "]";
	}
	
	
	
}
public class ProgramFifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name age and nationality:-");
		String name=sc.next();
		int age=sc.nextInt();
		String nationality=sc.next();
		Voter v1=new Voter(name,age,nationality);
		v1.display();

	}

}
