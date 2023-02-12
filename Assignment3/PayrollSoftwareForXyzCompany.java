package Assignment3;
import java.util.*;
class employee
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
	
	/*
	 Please use following expressions for calculations.
a. hra=50% of basic salary
b. pf=12% of basic salary
c. pt=Rs.200


gross salary=basic salary+hra+medical
 net salary=gross salary-(pt+pf)


	 */
	
	
	employee()
	{
		employeeId = 1;
		employeName = "sweety";
		basicSalary = 12000;
		medical=1345.67f;
		
	
	}

	

	@Override
	public String toString() {
		return "employee [employeeId=" + employeeId + ", employeName=" + employeName + ", basicSalary=" + basicSalary
				+ ", medical=" + medical + "]";
	}



	public employee(int employeeId, String employeName,double basicSalary,double medical) {
		super();
		this.employeeId = employeeId;
		this.employeName = employeName;
		this.basicSalary = basicSalary;
		this.medical=medical;
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
public class PayrollSoftwareForXyzCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1=new employee();
		System.out.println(e1);
		employee e2=new employee(2,"rana",34567.0f,12345.8);
		System.out.println(e2);
		e1.display();
		e2.display();
				

	}

}
