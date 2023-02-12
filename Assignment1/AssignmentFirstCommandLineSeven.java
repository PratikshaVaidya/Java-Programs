package Assignment1;

public class AssignmentFirstCommandLineSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,n,sum=0;
		int arr[]=new int[5];
		for(i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
			System.out.println(arr[i]);
		}
		for(i=0;i<5;i++)
		{
			n=Integer.parseInt(args[i]);
			sum=sum+n;
			
		}
		System.out.println("Sum is:-"+sum);
	}

}
