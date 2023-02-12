package Polymorphism;
class Bdate
{
	int d,m,y;

	public Bdate(int d, int m, int y)
	{
		super();
		this.d = d;
		this.m = m;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Bdate [d=" + d + ", m=" + m + ", y=" + y + "]";
	}
	
}
class Student
{
	int rno;
	String name;
	float res;
	Bdate b;
	public Student(int rno, String name, float res, Bdate b)
	{
		super();
		this.rno = rno;
		this.name = name;
		this.res = res;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", res=" + res + ", b=" + b + "]";
	}
	
	
}
public class AssociationOrHasAOrContainment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bdate b1=new Bdate(22,8,2000);
		Student s1=new Student(123,"sweety",82.50f,b1);
		System.out.println(s1);

	}

}
