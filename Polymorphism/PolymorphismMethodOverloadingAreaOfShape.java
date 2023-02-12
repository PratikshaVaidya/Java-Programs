package Polymorphism;
class AreaOfShape
{
	void area() 
	{
		
	int r=10;
	System.out.println("Area of Circle:-"+(3.14*r*r));
	}
	void area(int s) 
	{
	System.out.println("Area of square:-"+(s*s));
	}
	int area(int l,int b) 
	{
	return l*b;
	}
	float area(float b,int h) 
	{
	return (0.5f*b*h);
	}
}
public class PolymorphismMethodOverloadingAreaOfShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfShape as=new AreaOfShape();
		as.area();
		as.area(10);
		System.out.println("Area of Rectangle="+as.area(5, 6));
		System.out.println("Area of Triangle="+as.area(2.3f, 5));
		
	}

}
