package methods;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass 
{

    public static void main(String args[])
    {
        // String is imutable
        String s1 = "Welcome ";
        
        // De fapt aici este un alt obiect ;). 
        // Deci folosesti mai multa memorie decat ar trebui.
        s1 = s1 + "to my Youtube Channel";
        System.out.println(s1);
        

        
        // StringBuilder(consuma mai putine resurse pentru un singur thread) (insert(),append())
        // StringBuffer (sincronizare cu threaduri) (insert(),append())

        
        
        StringBuilder sb = new StringBuilder(s1);
        
        sb.append("bla bla");
        
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
        
        


















    }



}