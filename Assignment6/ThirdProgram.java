package Assignment6;

import java.util.Scanner;

/*Create an abstract class shape with abstract method 
void area();
create 4 more classes circle, cylinder, square and rectangle
shape
circle square
cylinder rectangle
Override the area() in all the classes
Create an array of references of type shape in TestShape class and print the area 
of different types of shapes.*/
abstract class Shape
{
	
abstract void area();
}

class Circle extends Shape
{
	void area()
	{
		
		float pi=3.14f,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radious:-");
		int r=sc.nextInt();
		area=pi*r*r;
		System.out.println("area of circle is:-"+area);
		
	}
}
class Cylinder extends Shape
{
	void area()
	{
		float pi=3.14f,area;
		int r,h;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radious and height");
		r=sc.nextInt();
		h=sc.nextInt();
		area=(2*pi*r*h)+(2*h*r*r);
		System.out.println("area of cylinder is="+area);
	}
}
class Square extends Shape
{
	void area()
	{
		int s,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sides");
		s=sc.nextInt();
		
		area=s*s;
		System.out.println("area of square is="+area);
		
	}
}
class Rectangle extends Shape
{
	void area()
	{
		int l,b,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and bridth");
		l=sc.nextInt();
		b=sc.nextInt();
		area=l*b;
		System.out.println("area of rectanglt is="+area);
	}
}

public class ThirdProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st way
		int i;
		Shape s1[]=new Shape[4];
		
		s1[0]=new Circle();
		s1[1]=new Cylinder();
		s1[2]=new Rectangle();
		s1[3]=new Square();
		/*a1[4]=new Flute();
		a1[5]=new Guitar();
		a1[6]=new Piano();
		a1[7]=new Flute();
		a1[8]=new Guitar();
		a1[9]=new Piano();*/
		
		for(i=0;i<s1.length;i++) 
		{
			if(s1[i] instanceof Circle)
			{
				
				s1[i].area();
			}
			if(s1[i] instanceof Cylinder)
			{
				
				s1[i].area();
			}
			if(s1[i] instanceof Rectangle)
			{
				
				s1[i].area();
			}
			if(s1[i] instanceof Square)
			{
				
				s1[i].area();
			}
		}
		
		//2nd wat
	}

}
