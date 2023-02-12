package Constructor;
class Employee
{
	int id;
	String name;
	float salary;
	Employee()
	{
		id=11;
		name="ram";
		salary=12345f;
	}
	//parameterized constructor with parameter and same sequence
	Employee(int id1,String nam,float sal)
		{
			id=id1;
			name=nam;
			salary=sal;
		}
		//parameterized constructor with different sequence
	Employee(int i1,float sal1,String n1)
		{
			id=i1;
			salary=sal1;
			name=n1;
		}
	Employee(int id2)
		{
			id=id2;
			name="teena";
			salary=50000f;
		}
	Employee(String name,float salary,int id)
		{
			
			this.name=name;
			this.salary=salary;
			this.id=id;
		}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class ConstructorProgramEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		System.out.println(e1);
		Employee e2=new Employee(12,"pratiksha",88000f);
		System.out.println(e2);
		Employee e3=new Employee(13,65000f,"diya");
		System.out.println(e3);
		Employee e4=new Employee(14);
		System.out.println(e4);
		Employee e5=new Employee("neha",77000f,15);
		System.out.println(e5);

	}
	
}
