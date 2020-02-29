package Objectcreation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class emst implements Serializable{
	String sname="priya";
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis =new FileInputStream("text.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		emst oo=(emst) ois.readObject();
		System.out.println(oo);
		System.out.println(oo.sname);
	}

}
