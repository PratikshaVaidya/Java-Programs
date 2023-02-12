package Assignment12;

import java.io.*;
import java.util.*;
class Student implements Serializable
{
	int id;
	String name;
	float per;
	public Student(int id, String name, float per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
}
public class ProgramNine {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("f1.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Student s1=new Student(1,"sweety",89);
		oos.writeObject(s1);
		oos.close();
		
		FileInputStream fis=new FileInputStream("f1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s=(Student)ois.readObject();
		System.out.println(s);
		ois.close();
		
		
		

	}

}
