/*5. Write a java program to split string by “blank space” and “-” patterns*/

package Assignment4;

public class FifthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("This is core java program!!!");
		System.out.println(s);
		String sc[]=s.split(" ");
		for(String i:sc)
		{
			System.out.println(i);
		}
		
		String sj=new String("my-name-is-vaidya-prtaiksha-anil !!!");
		System.out.println(sj);
		String scc[]=sj.split("-");
		for(String i:scc)
		{
			System.out.println(i);
		}
	}

}
