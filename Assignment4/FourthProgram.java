/*4. practice StringBuffer methods such as length(),capacity(),append(),insert(),delete() etc*/
package Assignment4;

public class FourthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("this is core java program");
		System.out.println("length="+(sb.length()));
		System.out.println("capacity:-"+(sb.capacity()));
		System.out.println("append:-"+(sb.append("  it's easy......")));
		System.out.println("insert="+(sb.insert(0, "new one ")));
		System.out.println("delete="+(sb.delete(0, 7)));
		

	}

}
