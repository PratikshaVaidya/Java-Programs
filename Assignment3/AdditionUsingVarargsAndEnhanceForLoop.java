package Assignment3;
class Addmition2
{ 
	int sum=0;
	float sum1=0;
	double sum2=0;
	void add(int...x)
	{
	for(int n:x)	
	{
		sum=sum+n;
	}
	System.out.println("Addition is:-"+sum);
	}
	void add(float...x)
	{
	for(float n:x)	
	{
		sum1=sum1+n;
	}
	System.out.println("Addition is:-"+sum1);
	}
	void add(double...x)
	{
	for(double n:x)	
	{
		sum2=sum2+n;
	}
	System.out.println("Addition is:-"+sum2);
	}
}
public class AdditionUsingVarargsAndEnhanceForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addmition2 a1=new Addmition2();
		a1.add(1,2,3,4,5);
		a1.add(2.2,2.3,3.3);
		a1.add(22.22,33.33,44.44,55.55);
		
		
		
	}

}
