package Assignment5;
class game
{
	game()
	{
		System.out.println("This is default Constructor of game class :-");
	}
}
class boardgame extends game
{
	boardgame()
	{
		System.out.println("This is default Constructor of boardegame class :-");
	}
}
class chess extends boardgame
{
	chess()
	{
		System.out.println("This is default Constructor of chess class :-");
	}
}
public class AssignmentfiveQuestionFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chess c1=new chess();
		
	}

}
