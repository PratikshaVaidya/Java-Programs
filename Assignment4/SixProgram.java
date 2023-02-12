/*6. Create string by using below ways and compare using “==” and equals() method:
a. String s1=”abc”;//literal way
b. String s2=”abc”;
c. String s3=new String(“abc”); //using new keyword 
d. String s4=new String(“abc”);*/

package Assignment4;

public class SixProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1="abc";
		 String s2="abc";
		 String s3=new String("abc"); 
		 String s4=new String("abc");
		 System.out.println("== operator for literal="+(s1==s2));
		 System.out.println("== operator for new keyword="+(s4==s3));
		 System.out.println("equals operator for literal="+(s1.equals(s2)));
		 System.out.println("equals operator for new keyword="+(s4.equals(s3)));
	}

}
