package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Factorial of a number ***");
		System.out.println();
		
		System.out.print("Enter the number to calcule the factorial: ");
		int control = scanner.nextInt();
		int factorial = 1;
		for (int i = 1; i <= control; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		
		scanner.close();		
	}

}
