package string_Practice;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		System.out.println("Please enter a String");
		
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		
		//One way
		System.out.println("Entered String are: "+inputString);
		System.out.println("Reverse of entered String are: "+new StringBuffer(inputString).reverse());
		
		// Second way
		String rev = "";
		for(int i=inputString.length()-1; i>=0; i--) {
			char ch = inputString.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
		sc.close();
	}

}
