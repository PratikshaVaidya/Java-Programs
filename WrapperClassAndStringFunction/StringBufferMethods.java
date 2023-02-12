package WrapperClassAndStringFunction;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("profound");
		System.out.println("append="+(sb.append("It")));
		System.out.println("append="+(sb.insert(0,"Edu")));
		System.out.println("delete="+(sb.delete(0, 3)));
		System.out.println("reverse="+(sb.reverse()));
		System.out.println("replace="+(sb.replace(0, 3, "sweety")));

	}

}
