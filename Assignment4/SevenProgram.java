/*7. Write a Java program to return the sum of the digits present in the given string. If 
there is no digits the sum return is 0. 
a. String s=”14abc9kj”;
b. O/p: 1+4+9=14*/
package Assignment4;

public class SevenProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="14abc9kj";
		int sumcount=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
			sumcount+=(s.charAt(i)-'0');
			}
		}
		System.out.println("sum of the digits:-"+sumcount);

	}

}
