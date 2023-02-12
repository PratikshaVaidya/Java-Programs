/*4. Create Manager class extending Employee class with attributes as 
fixedsalary(int) and incentives(int) and method computeSalary() to calculate the 
salary of Manager .Print the salary and details of Manager*/

package Assignment5;

import java.util.Scanner;

class Employee123
{
	int id;
	String name;
	int sal;
	Employee123()
	{
		id=121;
		name="sweets";
		sal=32144;
	}
	void ComputeSalary()
	{
		System.out.println("This is Employee class in the compute salary method");
	}
}
class Manager extends Employee123
{
	int id;
	String name;
	int sal;
	int fixedsalary;
	int incentive;
	int total_sal;
	
	Manager()
	{
	id=123;
	name="radha";
	sal=55464;
	}
	void ComputeSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fixed salary and incentive:-");
		fixedsalary=sc.nextInt();
		incentive=sc.nextInt();
		total_sal=fixedsalary+incentive;
		System.out.println("total salary="+total_sal);
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", sal=" + sal + ", fixedsalary=" + fixedsalary + ", incentive="
				+ incentive + ", total_sal=" + total_sal + "]";
	}
	
	
}
public class AssignmentFiveQuestionFourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1=new Manager();
		m1.ComputeSalary();
		System.out.println(m1);

	}

}
