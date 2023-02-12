package StaticKeyword;
class StaticBlock
{
	StaticBlock()
	{
		System.out.println("This is the default Block:-");
	}
	{
		System.out.println("This is the non-static  Block:-");
	}
	static
	{
		System.out.println("This is the static  Block:-");
	}
}
public class StaticBlockUsingStaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock db1=new StaticBlock();
		StaticBlock db2=new StaticBlock();
		
	}

}
