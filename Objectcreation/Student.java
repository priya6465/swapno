package Objectcreation;

public class Student {

	public int studentid =202;
	
	 public Student(){
		 
		 System.out.println("student class constructor");
	 }
	 
	 public static void main(String []args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		Student s1= (Student) Class.forName("oop.Student").newInstance();
		System.out.println(s1.studentid);
	 }
}
