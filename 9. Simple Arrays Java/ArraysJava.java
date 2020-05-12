package pack;

import java.util.Arrays;

public class ArraysJava
{

	public static void main(String[] args)
	{
		// Declarare si intializare a 3 intregi.
		int a0 = 0;
		int a1 = 0;
		int a2 = 0;

		System.out.println(a0);
		System.out.println(a1);
		System.out.println(a2);

		// Declararea unui array de dimensiune 1x3(contine trei elemente)
		int array1[] = new int[3];

		// Parantezele drepte pot fi puse si inaintea numelui array-ul = acelasi
		// comportament
		int[] array2 = new int[3];

		// Modifca un element din array(index-ul incepe de la 0 la lungime-1 in cazul de
		// aici de la 0 la 3)
		array1[0] = 99;

		// Afiseaza un element de la un anumit index(0)
		System.out.println(array1[0]);

		// Afiseaza cate elemente sunt in array (lungimea acestuia)
		System.out.println("Lungimea array1 este: " + array1.length);

		// Printeaza un array - not ok.
		System.out.println(array1);

		// Afisaza toate elementele array-ului cu un for loop
		for (int i = 0; i < array1.length; i++)
		{
			System.out.println("Elementul de la pozitia " + i + "este" + array1[i]);
		}

		// Printeaza un array folosind clasa Arrays
		System.out.println("Elementele array-ului folosind metoda tString: " + Arrays.toString(array1));

		// Declarea si intializare unui array.
		int array3[] = { 1, 2, 3 };

		// Eroare iesim din limtele array-ului
		// array3[99] = 8;
		// Eroare array-ul are 3 elemente index-ul 3 inseamna al 4lea element
		// array3[3] = 8;

		// Array 2D 3 tari(Romania, Franta Lisabona) cate 2 entry pentru fiecare tara
		String tari_capitale[][] = new String[3][2];

		tari_capitale[0][0] = "Romania";
		tari_capitale[0][1] = "Bucuresti";

		tari_capitale[1][0] = "Franta";
		tari_capitale[1][1] = "Paris";

		tari_capitale[2][0] = "Portugalia";
		tari_capitale[2][1] = "Lisabona";

		// Printeaza tari si capitale cu 2 for-uri
		for (int i = 0; i < tari_capitale.length; i++)
		{
			for (int j = 0; j < tari_capitale[i].length; j++)
			{
				if (j == 0)
				{
					System.out.print("Tara " + tari_capitale[i][j]);
				} else
				{
					System.out.println(" are capitala: " + tari_capitale[i][j]);
				}

			}

		}

	}

}
