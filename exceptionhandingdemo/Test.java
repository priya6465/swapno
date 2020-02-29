package exceptionhandingdemo;

public class Test {

	public static void main(String[] args)  {
   try {
	Thread.sleep(8000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
	}

}
