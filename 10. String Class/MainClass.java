package methods;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass 
{

    public static void main(String args[])
    {
        // In Java nu exista tipul primitiv pentru siruri de caractere. 
        // Orice sir de caractere este un obiect a clasei String,
        // iar variabilele de tip String nu sunt altceva decat referinte la obiecte ce contin un sir de caractere 
        
        
        String string1 = "Bine ai venit pe canalul meu de Youtube!";
        System.out.println(string1);
        
        
        // Concatenare siruri(Stringuri)
        // 1. Metoda concat()
        String string2 = "Acesta este ";
        String string3 = string2.concat("un sir de caractere");
        
        // 2. Operatorul +
        String string4 = string2 + "un sir de caractere";
        
        
        // Comparare Stringuri
        String string5 = "Java";
        String string6 = "Java";
        String string7= new String("Java");
        
        // Not ok => comparing the objects
        if (string5 == string7)
        {
            System.out.println("Stringurile sunt egale");
        }
        else
        {
            System.out.println("Stringurile nu sunt egale");
        }
        
        
        
        // The right way => stringObj1.equals(stringObj1)
        if (string5.equals(string7))
        {
            System.out.println("Stringurile sunt egale");
        }
        else
        {
            System.out.println("Stringurile nu sunt egale");
        }
        
        
        // Metode folositoare
        String string8 = new String("Acesta este un STRING!");
        
        // length() - lungimea sirului
        System.out.println("Lungimea sirului este " + string8.length() );
        
        // charAt(int index) - Ce caracter se afla la indexul sepcificat.
        System.out.println("La indexul 1 se afla caracterul: " + string8.charAt(1));
        
        // string8.toUpperCase()/toLowerCase - Scrie cu majuscule/minuscule
        System.out.println("Sirul scris cu majuscule: " + string8.toUpperCase());
        System.out.println("Sirul scris cu minuscule: " + string8.toLowerCase());
        
        // endsWith(String suffix) - Verifica daca se termina cu un anume sufix
        if (string8.endsWith("STRING!")) 
        {
            System.out.println("Expresia se termina cu STRING!");
        }
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }



}