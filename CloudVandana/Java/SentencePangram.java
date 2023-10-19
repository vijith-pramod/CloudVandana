package Java;

import java.util.Scanner;

public class SentencePangram {
    public static void main(String[] args) {
       // String x = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";

       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String x = scanner.nextLine();

        x = x.replace(" ", "").toUpperCase();
        char y[] = x.toCharArray();
        int size = y.length;

        int a[] = new int[26]; 

        int i = 0;

        while (i != size) {
            int index = y[i] - 'A'; 
            a[index] = 1; 
            ++i;
        }
        i = 0;
        while (i != 26) {
            if (a[i] == 1) {
                ++i;
            } else {
                System.out.println("Non-Pangram");
                System.exit(0);
            }

        }
        System.out.println("Pangram");
    }
}
