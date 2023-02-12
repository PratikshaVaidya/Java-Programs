package StaticKeyword;

class StaticDemoExample
{
	int x=10;
	static int y=10;
	void show()
	{
		x++;
		y++;
		System.out.println("x= "+x+" "+"y="+y);
	}
}

public class StaticDataMembersUsingStaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemoExample d1=new StaticDemoExample();
		StaticDemoExample d2=new StaticDemoExample();
		StaticDemoExample d3=new StaticDemoExample();
		d1.show();
		d2.show();
		d3.show();

	}

}
