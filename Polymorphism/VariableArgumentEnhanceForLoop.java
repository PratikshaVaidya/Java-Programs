package Polymorphism;
class Vdemo
{
	void show(int...x)
	{
		for(int i:x)
		{
			System.out.println(i);
		}
	}
}
public class VariableArgumentEnhanceForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vdemo v1=new Vdemo();
		v1.show();
		v1.show(1,2,3);
		v1.show(10,20,30,40,50,60,70,80,90,100);
		v1.show(11,22,33,44,55);
	}

}
