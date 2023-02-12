package Java8Features;
interface MyInterface
{
	void show();
}
public class MethodRefferenceExa  
{
	public void display()
	{
		System.out.println("In instance Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodRefferenceExa mr=new MethodRefferenceExa();
		
		MyInterface sh=mr::display;
		sh.show();
	}

}
