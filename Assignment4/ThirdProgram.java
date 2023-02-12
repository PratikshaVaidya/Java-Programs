/*3. Use the String Class Methods like length, hashCode,equals, replace, trim, 
subString, concatinate , compare , charAt, subString etc.. for a given String(s)*/


package Assignment4;

public class ThirdProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("Profound");
		String s1=new String("Profound");
		String s2=new String("Eduteck");
		System.out.println("length="+(s.length()));
		System.out.println("hashcode="+(s.hashCode()));
		System.out.println("equals method:-"+(s.equals(s1)));
		System.out.println("trim method="+(s.trim()));
		System.out.println("sub string="+(s.substring(5)));
		System.out.println("concatination="+(s1.concat(s2)));
		System.out.println("compare="+(s.compareTo(s1)));
		System.out.println("index char at position="+(s.charAt(0)));
		

	}

}
