package Assignment6;
abstract class Instruments
{
	abstract void play();
}
class Piano extends Instruments
{
	void play()
	{
		System.out.println("Piano is playing tan tan tan........");
	}
}
class Flute extends Instruments
{
	void play()
	{
		System.out.println("Flute is playing toot toot toot........");
	}
}
class Guitar extends Instruments
{
	void play()
	{
		System.out.println("Guitar is playing tin tin tin........");
	}
}
public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Instruments a1[]=new Instruments[10];
		
		a1[0]=new Piano();
		a1[1]=new Flute();
		a1[2]=new Guitar();
		a1[3]=new Piano();
		a1[4]=new Flute();
		a1[5]=new Guitar();
		a1[6]=new Piano();
		a1[7]=new Flute();
		a1[8]=new Guitar();
		a1[9]=new Piano();
		
		for(i=0;i<a1.length;i++) 
		{
			if(a1[i] instanceof Piano)
			{
				System.out.println("yes its Piano");
				a1[i].play();
			}
			if(a1[i] instanceof Flute)
			{
				System.out.println("yes its Flute");
				a1[i].play();
			}
			if(a1[i] instanceof Guitar)
			{
				System.out.println("yes its Guitar");
				a1[i].play();
			}
		}

	}

}
