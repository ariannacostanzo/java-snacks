package experis.snacks;

import java.util.Scanner;

public class snack4 {
    public static void main(String[] args) {

        //Data in input una stringa verificare se è palindroma
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola:");
        String word = scanner.nextLine();
        String message = "La parola non è palindroma";
        String reverseWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            reverseWord += word.charAt(i);

            if (word.equals(reverseWord)) {
                message = "La parola è palindrama";
            }
        }

        System.out.println(word + " al contrario è: " + reverseWord);

        System.out.println(message);

        scanner.close();
    }
}
