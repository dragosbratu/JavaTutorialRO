package methods;

import java.util.Scanner;

public class MainClass 
{
	// Metoda void (nu returneaza nimic) si fara niciun paramentru.
	public static void metodaMea() 
	{
		System.out.println("S-a apelat metodaMea()");

		System.out.println("Aceasta este prima mea metoda void din Java");
	}

	// Metoda void (nu returneaaa nimic) cu un parametru de tip String.
	public static void metodaMeaCuParamentru(String stringDeAfisat) 
	{
		System.out.println("S-a apelat metodaMeaCuParamentru()");

		System.out.println("Ai zis cumva: " + stringDeAfisat + "?");
	}
	
	// Metoda care returneaza (un double) suma a doua numere primite care parametri.
	public static double calcSumaADouaNumere(double nr1, double nr2) 
	{
		System.out.println("S-a apelat calcSumaADouaNumere()");
		double suma = nr1 + nr2; 
		
		//similar cu return nr1 + nr2
		return suma; 
	}
	
	public static int citesteUnIntregDeLaTastatura(String mesaj) 
	{
		System.out.println("S-a apelat citesteUnIntregDeLaTastatura()");
		
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print(mesaj);
		int integerKeyboard = keyboardInput.nextInt();
		
		
		return integerKeyboard;
	}

	public static void main(String [] args) 
	{
		metodaMea();
		
		metodaMeaCuParamentru("Ecouuuuu!");
		
		double suma = calcSumaADouaNumere(1.2, 1.3);
		System.out.println("Suma este: " + suma );
		
		System.out.println("Suma este: " + calcSumaADouaNumere(99.2, 103.53) );
		
		int nr1 = citesteUnIntregDeLaTastatura("Introdu nr1: ");
		int nr2 = citesteUnIntregDeLaTastatura("Introdu nr2: ");
		
		System.out.println("Suma intregilor este: " + calcSumaADouaNumere(nr1, nr2) );
		

	}
}
