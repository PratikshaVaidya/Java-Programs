package Generics;
import java.util.*;
class Employee
{
	int eid;
	String ename;
	float sal;
	public Employee(int eid, String ename, float sal)
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
}
public class ExampleOfEmployeeAndIteratorListOfEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
