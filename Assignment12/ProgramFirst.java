/*1. Write java program to print file specification such as isFile,isDirectory,last 
modified date,file size,file patch etc*/

package Assignment12;

import java.io.*;
import java.util.Date;


public class ProgramFirst {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("f10.txt");
		f1.createNewFile();
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		System.out.println(new Date(f1.lastModified()));
		System.out.println(f1.length());
		System.out.println(f1.getAbsolutePath());
	}

}

