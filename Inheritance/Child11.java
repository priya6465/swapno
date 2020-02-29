package Inheritance;
class Parent11{
		void m1(){
			System.out.println("parent class  m1 method");}
}
public class Child11 extends Parent11 {

	void m1(){
		System.out.println(" child class m1 method");}
	   void m2(){
		super.m1();
		m1();
		
	}
public static void main(String[] args) {
	new Child11().m2();


	}

}
