package WrapperClassAndStringFunction;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Autoboxing By using Constructor
		int x=25;
		Integer i1=new Integer(x);
		Float f1=new Float(2.5f);
		Double d1=new Double(55.66);
		System.out.println("     Autoboxing By using Constructor    ");
		System.out.println("Integer="+i1+" "+"float="+f1+" "+"double="+d1);
		
		//Autoboxing by using Method
		Integer i2=Integer.valueOf(11);
		Float f2=Float.valueOf(11.5f);
		Double d2=Double.valueOf(11.55);
		System.out.println("     Autoboxing by using Method    ");
		System.out.println("Integer="+i2+" "+"float="+f2+" "+"double="+d2);
		
		//Unboxing by using method
		int a=i1.intValue();
		float b=f1.floatValue();
		double d=d1.doubleValue();
		System.out.println("     Unboxing by using method    ");
		System.out.println("Integer="+a+" "+"float="+b+" "+"double="+d);
		
		//convering string object into wrapper class
		Integer i3=new Integer("999");
		Float f3=new Float("22.52f");
		Double d3=new Double("88.44");
		System.out.println("     convering string object into wrapper class    ");
		System.out.println("Integer="+i3+" "+"float="+f3+" "+"double="+d3);
		
		//converting string object into the 
		Integer i4=Integer.valueOf("100");
		Float f4=Float.valueOf("100.67f");
		Double d4=Double.valueOf("10.56");
		System.out.println("     convering string object into wrapper class    ");
		System.out.println("Integer="+i4+" "+"float="+f4+" "+"double="+d4);
		
		//converting string object into primitive datatypes
		int i5=Integer.parseInt("33");
		float f5=Float.parseFloat("87.9f");
		double d5=Double.parseDouble("99.99");
		System.out.println("     converting string object into primitive datatypes    ");
		System.out.println("Integer="+i5+" "+"float="+f5+" "+"double="+d5);
		
		//converting wrapper class object into string class
		String s1=i1.toString();
		String s2=i2.toString();
		System.out.println("     converting wrapper class object into string class    ");
		System.out.println("string 2="+s1+" "+"string 2="+s2);
		
		//converting primitive datatype into string
		String s3=Integer.toString(20);
		String s4=Float.toString(10f);
		String s5=Double.toString(99.99);
		System.out.println(s3+s3);
		System.out.println(s4+s4);
		System.out.println(s5+s5);
		
	}

}
