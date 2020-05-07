package hello;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) 
	{
		Scanner keyboardInput = new Scanner(System.in);
		
		// Grab the name(one word)
		System.out.print("Enter your name: ");;
		String name = keyboardInput.next();
		System.out.println("Hello " + name + "!");
		
		// Integer.
		System.out.print("Enter your age in years: ");;
		int age = keyboardInput.nextInt();
		System.out.println(age + " You are old! :).");
		
		// Double.
		System.out.print("Enter your weight: ");;
		double weight = keyboardInput.nextDouble();
		System.out.println(weight + " no food for you today!");
		
		//throw away the \n not consumed by nextDouble()
		keyboardInput.nextLine(); 
		
		// Get one line as a string
		System.out.print("Write a sentence or more than one word ");;
		String oneLine = keyboardInput.nextLine();
		System.out.println("Did you just said " + oneLine);
		
				
	}

}
