package pack;

import java.util.Scanner;

public class MainClass {
    public static int readIntKeyboard(String msg) {

	Scanner keyboardInput = new Scanner(System.in);
	System.out.print(msg);
	int integerKeyboard = keyboardInput.nextInt();

	return integerKeyboard;
    }

    public static int add(int x, int y) {
	int result = x + y;
	return result;
    }

    public static int sub(int x, int y) {
	int result = x - y;
	return result;
    }

    public static int mult(int x, int y) {
	int result = x * y;
	return result;
    }

    public static int div(int x, int y) {
	int result = x / y;
	return result;
    }

    public static void showMenu() {
	System.out.println("============== Menu =============");
	System.out.println("Enter your selection: ");
	System.out.println("1  Addition ");
	System.out.println("2  Substraction ");
	System.out.println("3  Multiplication ");
	System.out.println("4  Divsion ");
	System.out.println("=================================");
    }

    public static void main(String[] args) {
	showMenu();
	int option = readIntKeyboard("Enter your option: ");

	int num1 = readIntKeyboard("Enter first  number: ");
	int num2 = readIntKeyboard("Enter second number: ");

	switch (option) {
	case 1:
	    System.out.println("Answer=" + add(num1, num2));
	    break;
	case 2:
	    System.out.println("Answer=" + sub(num1, num2));
	    break;
	case 3:
	    System.out.println("Answer=" + mult(num1, num2));
	    break;
	case 4:
	    System.out.println("Answer=" + div(num1, num2));
	    break;
	default:
	    System.out.println("Case not covered. Please chose one option from menu!!");

	}
    }

}