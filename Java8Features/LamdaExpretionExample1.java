package Java8Features;
interface Addable
{
	public void add(int x,int y);
}
public class LamdaExpretionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable a=(x,y)->
		{
			System.out.println("Addition is="+(x+y));
		};
		a.add(50, 50);

	}

}
