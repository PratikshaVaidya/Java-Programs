package Generics;
import java.util.*;
public class MapWithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>m=new HashMap<Integer,String>();
		m.put(10, "ABC");
		m.put(20, "sweety");
		m.put(50, "CDE");
		m.put(6, "XYZ");
		System.out.println(m);
		
		Set<Integer>s=m.keySet();
		Iterator<Integer>i=s.iterator();
		
		while(i.hasNext())
		{
			int k=i.next();
			String v=m.get(k);
			System.out.println(k+"="+v);
		}

	}

}
