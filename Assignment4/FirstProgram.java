package Assignment4;
class DOB
{
	int d,m,y;
	
	public DOB()
	{
		super();
		// TODO Auto-generated constructor stub
		d=20;
		m=8;
		y=2000;
		
	}

	public DOB(int d, int m, int y) 
	{
		super();
		this.d = d;
		this.m = m;
		this.y = y;
	}

	@Override
	public String toString() {
		return "DOB [d=" + d + ", m=" + m + ", y=" + y + "]";
	}
}
class Employee
{
	int id;
	String name;
	DOB b;
	DOB b2;
	
	public Employee()
	{
		super();
		// TODO Auto-generated constructor stub
		id=2;
		name="rana";
		
		
		
	}
	public Employee(int id, String name, DOB b)
	{
		super();
		this.id = id;
		this.name = name;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", b=" + b + "]";
	}
	
	
}
public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOB b0=new DOB();
		DOB b1=new DOB(22,8,2000);
		Employee e1=new Employee(1,"sweety",b1);
		//Employee e1=new Employee(b1);
		
		System.out.println(e1);
		
	}

}
