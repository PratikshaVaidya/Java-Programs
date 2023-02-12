package Generics;
import java.util.*;
class Book
{
	int bid;
	String bname,bauthor;
	float bprice;
	public Book(int bid, String bname, String bauthor, float bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bauthor = bauthor;
		this.bprice = bprice;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor + ", bprice=" + bprice + "]";
	}
	
}
public class ExampleOfBookClassAndIterateListOfBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book>l=new ArrayList<Book>();
		l.add(new Book(101,"C","Dennis",850.6f));
		l.add(new Book(102,"Cpp","BJ",1000.6f));
		l.add(new Book(103,"Java","james",890.6f));
		
		ListIterator<Book>li=l.listIterator();
		while(li.hasNext())
		{
			Book b=li.next();
			System.out.println(b);
			
		}

	}

}
