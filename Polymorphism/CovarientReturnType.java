package Polymorphism;

class FirstOne
{
	FirstOne draw()
	{
	System.out.println("This is draw method of shape class:-");
	return new FirstOne();
	}
}
class Circlee extends FirstOne
{
	Circlee draw()
	{
	System.out.println("This is draw method of circle class:-");
	return new Circlee();

	}
}

public class CovarientReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstOne c1=new Circlee();
		c1.draw();
	}

}
