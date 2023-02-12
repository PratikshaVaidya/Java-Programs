/*10. Write a java program to serialize the Employee 
objects(id,name,salary,address,email,contact) and restrict serialization of email 
and contact (use ObjectInputStream,ObjectOutputStream,transient)*/

package Assignment12;
import java.util.*;
import java.io.*;
class Employee implements Serializable
{
	int id;
	String name;
	String address;
	transient String email;
	transient long contact;
	public Employee(int id, String name, String address, String email, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", contact="
				+ contact + "]";
	}
	
	
	
}
public class ProgramTen {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("f2.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Employee e=new Employee(1001,"Ram","Pune","sweety123@gmail.com",897897697);
		oos.writeObject(e);
		oos.close();
		
		FileInputStream fis=new FileInputStream("f2.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e1=(Employee)ois.readObject();
		System.out.println(e1);
		ois.close();
		
		

	}

}
