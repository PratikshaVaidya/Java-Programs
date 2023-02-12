/*Create an interface relational
interface relational
{
void greaterThan();
void lessThan();
void greaterThaneq();
void lessThaneq();
}
Write an implementing class implRel which implements realational
class implRel implements relational
{
 int a, b;
 implRel(int a,int b)
{
 this.a=a;
 this.b=b;
 }
- - - 
 }
 Create a class relationdemo .In main create an object of implRel (implementing 
 class) and invoke all the methods …*/

package Assignment7;
abstract interface Relational
{
	public abstract void greaterThan();
	public abstract void lessThan();
	public abstract void greaterThaneq();
	public abstract void lessThaneq();
}
class implRel implements Relational
{
	int a,b;
	implRel(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

	@Override
	public void greaterThan()
	{
		// TODO Auto-generated method stub
		if(a>b)
		{
			System.out.println("A is greter then B");
		}
		
	}

	@Override
	public void lessThan() 
	{
		// TODO Auto-generated method stub
		if(a<b)
		{
			System.out.println("A is less then B");
		}
		
	}

	@Override
	public void greaterThaneq()
	{
		// TODO Auto-generated method stub
		if(a>=b)
		{
			System.out.println("A is greter then equal  B");
		}
		
	}

	@Override
	public void lessThaneq() 
	{
		// TODO Auto-generated method stub
		if(a<=b)
		{
			System.out.println("A is less then equal  B");
		}
		
	}
	
}
public class ProgramFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		implRel ir=new implRel(20,10);
	
		ir.greaterThan();
		ir.lessThan();
		ir.greaterThaneq();
		ir.lessThaneq();
		

	}

}
