package WrapperClassAndStringFunction;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Profound");
		String s2=new String("Profound");
		String s3=new String("Edutech");
		
		System.out.println("Length="+(s1.length()));
		System.out.println("sub string="+(s1.substring(3)));
		System.out.println("sub string ="+(s1.substring(0, 3)));
		System.out.println("equals="+(s1.equals(s2)));
		System.out.println("concatination="+(s1.concat(s3)));
		System.out.println("char at position ="+(s1.charAt(5)));
		
		String s4=new String("java is developed by james gosling");
		System.out.println(s4);
		String s[]=s4.split(" ");
		for(String i:s)
		{
			System.out.println(i);
		}
	}

}
