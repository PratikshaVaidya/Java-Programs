/*3. Create SalesPerson class extending WageEmployee with attributes as sales(int)
and commission (int). Overide the ComputeSalary()
in Salesperson class and print the salary and details of SalesPerson*/

package Assignment5;

import java.util.Scanner;

class WageEmployee11
{
	int id;
	String name;
	public WageEmployee11()
	{
		super();
		id = 101;
		name = "sweety";
	}
	void ComputeSalary()
	{
		System.out.println("this is wageEmployee class");
	}
	
}
class Salesperson extends WageEmployee11
{
	int id;
	String name;
	float b_sal;
	float sal;
	int  sales;
	int commisstion;
	Salesperson()
	{
		id=1001;
		name="Pratiksha";
		b_sal=34567.55f;
	}
	void ComputeSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sales and commition:-  ");
		sales=sc.nextInt();
		commisstion=sc.nextInt();
		sal=b_sal+(commisstion*sales);
		System.out.println("salary is:-"+sal);
		
	}
	@Override
	public String toString() {
		return "Salesperson [id=" + id + ", name=" + name + ", b_sal=" + b_sal + ", sal=" + sal + ", sales=" + sales
				+ ", commisstion=" + commisstion + "]";
	}
	
	
	
}
public class AssignmentFiveQuestionThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Salesperson sp=new Salesperson();
    sp.ComputeSalary();
    System.out.println(sp);
	}

}
