package Assignment1;

public class AssignmentFirstCommandLineFifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=0;
		for(i=0;i<5;i++)
		{
			n=Integer.parseInt(args[i]);
			System.out.println(n);
		}
		for(i=0;i<5;i++)
		{
			n=Integer.parseInt(args[i]);
			sum=sum+n;
			
		}
		System.out.println("sum is="+sum);
	}

}
