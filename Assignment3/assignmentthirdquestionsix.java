package Assignment3;

import java.util.Scanner;

class employee1
{
	private
	int employeeId ;
	String employeName ;
	double basicSalary ;
	
	double  hra;
	double medical;
	double  pf;
	double pt;
	double  netSalary;
	double grossSalary;

	
	
	employee1()
	{
		employeeId = 1;
		employeName = "sweety";
		basicSalary = 12000;
		medical=1345.67f;
		
	
	}

	

	@Override
	public String toString() {
		return "employee1 [employeeId=" + employeeId + ", employeName=" + employeName + ", basicSalary=" + basicSalary
				+ ", medical=" + medical + "]";
	}



	public employee1(int employeeId, String employeName,double basicSalary,double medical) {
		super();
		this.employeeId = employeeId;
		this.employeName = employeName;
		this.basicSalary = basicSalary;
		this.medical=medical;
	}
	
	public employee1(int Id,double ml,double bscSalary,String Name) 
	{
	
		employeeId = Id;
		medical=ml;
		basicSalary = bscSalary;
		employeName = Name;
	}
	
	void display()
	{
		hra=(basicSalary*50)/100;
		pf=(basicSalary*12)/100;
		pt=200;
		grossSalary=(basicSalary+hra+medical);
		netSalary=grossSalary-(pt+pf);
		//System.out.println("HRA is:-"+hra);
	//	System.out.println("PF is:-"+pf);
		System.out.println(" GrossSalary is:-"+grossSalary);
		System.out.println("NetSalary is:-"+netSalary);
		
		
	}
	
}
public class assignmentthirdquestionsix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee1 e1=new employee1();
		System.out.println(e1);
		e1.display();
		employee1 e2=new employee1(2,"rana",34567.0f,12345.8);
		System.out.println(e2);
		e2.display();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id ,name basic salary and medical:-");
	 int Id=sc.nextInt();
	 String Name=sc.next();
	 double bscSalary=sc.nextDouble();
	 double ml=sc.nextDouble();
	 employee1 e3=new employee1(Id, Name,bscSalary, ml);
	 System.out.println(e3);
	 e3.display();
		
		
		
	}

}
