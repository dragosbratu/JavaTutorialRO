package pack;

public class Loops {

    // Buclele sunt o construcție fundamentală pentru multe limbaje de programare.
    // De fapt, toate programele, cu excepția celor mai de bază, pot include cel
    // puțin o buclă în ele.
    // Buclele pot fi foarte utile și pot economisi mult timp.

    public static void main(String[] args) {

	System.out.println("Salut!");

	// Ciclu for
	// Scrie salut de 10 ori
	for (int i = 0; i < 10; i = i + 1) {
	    System.out.println("Salut");
	}

	// Numara pana la 9
	for (int i = 0; i < 10; i++) {
	    System.out.println(i);
	}

	// Numara pana la 9 din 2 in 2
	for (int i = 0; i < 10; i = i + 2) {
	    System.out.println(i);
	}

	// Ciclu for imbricat (for in for)
	for (int i = 0; i < 3; i++) {
	    System.out.print("\ni=" + i);
	    for (int j = 0; j <= 2; j++) {
		System.out.print("\tj=" + j);
	    }
	}

	// Numara pana la 9 din 2 in 2 opreste-te la 4 opreste loop cu break
	for (int i = 0; i < 10; i = i + 2) {
	    if (i == 4) {
		break;
	    }
	    System.out.println(i);
	}

	// Numara pana la 9 din 2 in 2 sari peste 4 continua loop cu continue
	for (int i = 0; i < 10; i = i + 2) {
	    if (i == 4) {
		continue;
	    }
	    System.out.println(i);
	}

	int nr = 10;

	while (nr <= 50) {
	    System.out.println("I'm in while loop!");
	    double x = 0;
	    nr++;
	}

	do {
	    System.out.println("I'm in do while loop!");

	} while (1 == 10);

    }

}
