package Assignment5;
import java.util.*;
class Dob
{
	int d,m,y;
	Dob()
	{
		d=22;
		m=8;
		y=2000;
	}
	
	public Dob(int d, int m, int y) {
		super();
		this.d = d;
		this.m = m;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Dob [d=" + d + ", m=" + m + ", y=" + y + "]";
	}
	
}
class Employee
{
	
	int id;
	String name,addr;
	
	
	Dob d1;
	//Scanner sc=new Scanner(System.in);
	//System.out.println("Enter the hr and rate:");
	
	

	public Employee() {
		super();
		id=1001;
		name="radhika";
		addr="pune";
		
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(int id, String name, String addr, Dob d1) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.d1 = d1;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + ", d1=" + d1 + "]";
	}
}
class WageEmployee extends Employee
{
	int hr,rate;
	float comsal;
	public WageEmployee() 
	{
		super();
		// TODO Auto-generated constructor stub
		hr=5;
		rate=5;
	}
	
	public WageEmployee(int hr, int rate) {
		super();
		this.hr = hr;
		this.rate = rate;
		//this.comsal = comsal;
	}
	void computeSalary()
	{
		comsal=hr*rate;
		System.out.println("id="+id+" "+"name="+name+" "+"hr="+hr+" "+"rate="+rate+" "+"comsal="+comsal);
	}

	@Override
	public String toString() {
		return "WageEmployee [hr=" + hr + ", rate=" + rate + ", comsal=" + comsal + "]";
	}
	
	
	
}
public class AssignmentFiveQuestionSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dob d1=new Dob();
		//System.out.println(d1);
		Dob d2=new Dob(2,6,2001);
		System.out.println(d2);
		//Employee e1=new Employee();
		//System.out.println(e1);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id name and addressand hr and rate ");
		int id=sc.nextInt();
		String name=sc.next();
		String addr=sc.next();
		int hr=sc.nextInt();
		int rate=sc.nextInt();
				
		
		
		Employee e2=new Employee(id,name,addr,d2);
		//System.out.println(e2);
		//WageEmployee w1=new WageEmployee();
		//System.out.println(w1);
		WageEmployee w2=new WageEmployee(hr,rate);
		System.out.println(w2);
		//w1.computeSalary();
		w2.computeSalary();

	}

}
