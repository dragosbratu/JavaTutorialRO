package hello;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) 
	{
		// Primitive Data Types

		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

		//Default primitive data type values

		// byte: Size 8bits range +127 to -128
		byte  byteVar = 0;

		// short: Size 16bits range +32,767 to -32,768
		short shortVar = 0;

		// int: Size 32bits range +2,147,483,647 to -2,147,483,648
		int   intVar = 0;

		// long: Size 64bits range +9,223,372,036,854,775,807 to -9,223,372,036,854,775,808
		long  longVar = 0L;

		// float: Size 32bits range 3.402,823,5 E+38 to 1.4 E-45
		float floatVar = 0.0f;

		// double: Size 64bits range 1.797,693,134,862,315,7 E+308 to 4.9 E-324
		double doubleVar = 0.0d;

		// char: Size 16bits range 0 to 2^16-1(Unicode chars)
		char charVar = '\u0000';

		// boolean: Size depends on the virtual machine range True, False
		boolean booleanVar = false;

		//Literals
		boolean result = true;
		char capitalC = 'C';
		byte b  = 100;
		short s = 10000;
		int i   = 100000;

		// Integer Literals
		// The number 26, in decimal
		int decVal = 26;

		//  The number 26, in hexadecimal
		int hexVal = 0x1a;

		// The number 26, in binary
		int binVal = 0b11010;

		//Floating-Point Literals
		double d1 = 123.4;

		// same value as d1, but in scientific notation
		double d2 = 1.234e2;
		float f1 = 123.4f;

		// Underscore Characters in Numeric Literals
		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi = 3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;             

		
									

	}
}
