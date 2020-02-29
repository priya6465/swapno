package Inheritance;

class Parent1{
	Parent1(){
		System.out.println("parent class 0-argu cons");
	}
}

class Child1 extends Parent1{
      Child1(){
    	  System.out.println("child class 0-argu cons");
      }}
public class inheritanceexmp{
public static void main(String[] args) {
	
	new Child1();
		
			}

}
