package oop;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
		System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String[] words = s.trim().split(" ");
        System.out.println("Numbers of words in the string = "+words.length);
           sc.close();
	}

}
