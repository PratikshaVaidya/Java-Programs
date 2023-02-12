/*Create a package com.user .
Now create a Greeter class in this package having the following features:
Attributes:
 name string //indicates name of the person to be greeted
Member functions:
 Greeter(aName) //constructor to initialize the name of the
 //person to be greeted by this greeter.
 sayHello() //returns a hello message with the name of the 
 //person initialized earlier.
 sayGoodBye() //bids goodbye to the person named earlier.
Create another class in the same package called Advisor 
Attributes:
 message string[5] //contains five advice messages
Member functions:
 Advisor() //default constructor to initialize an array of 
 //strings with atleast five advice messages
 getAdvice() //randomly selects an advice from the available 
 //list of messages and returns it to the caller of this method
Outside the package, from your working directory, create a class GreeterTest that
constructs Greeter objects for all command-line arguments and prints out the
results of calling sayHello(). 
The program should then display an advice and finally bid goodbye to each of the
persons/entities in reverse order of the names entered at the command line. 
 java GreeterTest Mars Venus
 then the program should print
Hello, Mars!
Hello, Venus!
Advice: Never say No
Goodbye Venus!
Goodbye Mars!
*/

package Assignment7;
class Greeter
{
	String name;
	Greeter()
	{
		name="sweety";
	}
	void sayHello()
	{
		System.out.println("hello "+name);
	}
	void sayGoodBye()
	{
		System.out.println("Good Bye "+name);
	}
}
class Advisor
{
	String message;
	Advisor()
	{
	
	}
}
public class ProgramFifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter g1=new Greeter();
		g1.sayHello();
		g1.sayGoodBye();

	}

}
