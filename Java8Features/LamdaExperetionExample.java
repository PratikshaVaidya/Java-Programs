package Java8Features;

interface Drawable
{
	public void draw();
}
public class LamdaExperetionExample {

	public static void main(String[] args) {
		int width=10;
		Drawable d=()->
		{
			System.out.println("Drawing="+width);
		};
		d.draw();

	}

}
