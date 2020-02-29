package Objectcreation;

public class Createobjectusingnewinstancesmethod {
	
	public void m1(){
		System.out.println("m1 method");
	}

	
	public static void main(String[] args) throws Exception, IllegalAccessException, ClassNotFoundException {
		
		Createobjectusingnewinstancesmethod obj=(Createobjectusingnewinstancesmethod) Class.forName("oop.Createobjectusingnewinstancesmethod").newInstance();
		 obj.m1();
		
		
		
	}

}
