package Constructor;

class studentt
{
	int rno;
	String name;
	float res;
	//default constructor
	studentt()
	{
		rno=1;
		name="sweety";
		res=80.0f;
	}
	//parameterized constructor with parameter and same sequence
	studentt(int rolln,String nam,float result)
	{
		rno=rolln;
		name=nam;
		res=result;
	}
	//parameterized constructor with different sequence
	studentt(int r1,float res1,String n1)
	{
		rno=r1;
		res=res1;
		name=n1;
	}
	studentt(int rollno)
	{
		rno=rollno;
		name="teena";
		res=50f;
	}
	studentt(String name,float res,int rno)
	{
		
		this.name=name;
		this.res=res;
		this.rno=rno;
	}
	
	@Override
	public String toString() {
		return "student [rno=" + rno + ", name=" + name + ", res=" + res + "]";
	}
	
}
public class ConstructorProgramStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentt s1=new studentt();
		System.out.println(s1);
		studentt s2=new studentt(2,"pratiksha",88f);
		System.out.println(s2);
		studentt s3=new studentt(3,65f,"diya");
		System.out.println(s3);
		studentt s4=new studentt(4);
		System.out.println(s4);
		studentt s5=new studentt("neha",77f,5);
		System.out.println(s5);

	}

}
