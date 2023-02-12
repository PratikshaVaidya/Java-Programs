package Reflection;
import java.lang.reflect.*;
import java.util.*;
class RDemo
{
	public int x;
	public static float y;
	
	public RDemo()
	{
		
	}
	
	public RDemo(int x)
	{
		
	}
	
	public void show()
	{
		
	}
	
	public void display(int y)
	{
		System.out.println("In display()"+y);
	}
	}
public class Reflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException 
	{
		RDemo r=new RDemo();
		Class c=r.getClass();
		System.out.println("Class Name="+c.getName());
		
		Method m[]=c.getMethods();
		for(Method i:m)
		{
			System.out.println(i);
		}
		
		Constructor con[]=c.getConstructors();
		for(Constructor i:con)
		{
			System.out.println(i);
		}
		
		Method m1=c.getDeclaredMethod("Display ",int.class);
		m1.invoke(r,52);

	}

}
