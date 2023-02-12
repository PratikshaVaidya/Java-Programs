package Assignment1;

public class AssignmentFirstCommandSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		int sum=0,rem;
		while(n>0)
		{
		rem=n%10;
		sum=sum+rem;
		n=n/10;
		}
			System.out.println("sum is="+sum);
		
	}

}