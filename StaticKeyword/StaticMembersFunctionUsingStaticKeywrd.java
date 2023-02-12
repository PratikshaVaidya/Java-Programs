package StaticKeyword;
class StaticMembersFunction
{
	static int x=10;
	static int y=10;
	static void show()
	{
		x++;
		y++;
		System.out.println("x="+x+" "+"y="+y);
	}
}
public class StaticMembersFunctionUsingStaticKeywrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMembersFunction.show();
		StaticMembersFunction.show();
		StaticMembersFunction.show();
		
	}

}
