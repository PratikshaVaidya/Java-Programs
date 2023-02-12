package Assignment1;

public class AssignmentFirstCommandLineThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float da,hra,gross;
		
		float basic=Float.parseFloat(args[0]);
		da=(basic*20)/100;
		System.out.println("DA is="+da);
		hra=(basic*30)/100;
		System.out.println("HRA is="+hra);
		gross=(basic+da+hra);
		System.out.println("GROSS salary is is="+hra);
		if(basic >0 && basic < 4000 ) 
		{
			float it=(basic*4)/100;
			System.out.println("Income Tax is="+it);
		}
		else if(basic >=4000 && basic < 10000)
		{
			float it=(basic*6)/100;
			System.out.println("Income Tax is="+it);
		}
		else if(basic >=10000 && basic < 17000)
		{
			float it=(basic*8)/100;
			System.out.println("Income Tax is="+it);
		}
		else if(basic >=17000 && basic < 27000 )
		{
			float it=(basic*10)/100;
			System.out.println("Income Tax is="+it);
		}
		else
		{
			float it=(basic*15)/100;
			System.out.println("Income Tax is="+it);
		}
		}

}
