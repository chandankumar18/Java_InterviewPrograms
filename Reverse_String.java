package string_Practice;

/*
 * Java Program To to reverse the String by three ways.
 */

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {

		System.out.println("Please enter a String");

		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();

		// One way
		System.out.println("Entered String are: " + inputString);
		System.out.println("Using StringBuffer Class: " + new StringBuffer(inputString).reverse());

		// Second way
		String rev = "";
		for (int i = inputString.length() - 1; i >= 0; i--) {
			char ch = inputString.charAt(i);
			rev = rev + ch;
		}
		System.out.println("Using iterative method: " + rev);

		// Third Way
		System.out.println("Using Recursive Method: " + recursiveMethod(inputString));

		sc.close();
	}

	// Third Way
	public static String recursiveMethod(String str) {
		if ((null == str) || (str.length() <= 1))
			return str;

		return recursiveMethod(str.substring(1)) + str.charAt(0);

	}

}
