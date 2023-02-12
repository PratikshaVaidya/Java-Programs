package Serialization;

import java.io.*;


import java.io.Serializable;

class Employee121 implements Serializable
{
	int id;
	String name;
	float sal;
	public Employee121(int id, String name, float sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee121 [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}
public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("f9.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//oos.writeObject(new Employee121(101,"pratik",35678.66f));
							//or
		Employee121 e1=new Employee121(101,"zeba",23234.6f);
		oos.writeObject(e1);
		oos.close();
		//reading from file
		FileInputStream fis=new FileInputStream("f9.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee121 e=(Employee121)ois.readObject();
		System.out.println(e);
		ois.close();
		

	}

}
