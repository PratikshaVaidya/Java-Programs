package BasicProgram;
import java.util.*; 
public class ArrayElementFromUserAndDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements:-");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array  elements are:-");
		
			for(int i=0;i<5;i++)
			{
				System.out.println(arr[i]);
			}
		
		

	}

}
