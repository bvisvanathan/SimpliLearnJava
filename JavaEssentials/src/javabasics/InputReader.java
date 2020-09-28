package javabasics;

import java.util.Scanner;

public class InputReader {

	public static void main(String args[]) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter y/n :");
		char resp = s1.nextLine().charAt(0);
		if (resp == 'y') {
			System.out.println("you entered YES!");
		} else {
			System.out.println("you entered NO!");
		}
		s1.close();

	}

}
