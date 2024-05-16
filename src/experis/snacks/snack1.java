package experis.snacks;

import java.util.Scanner;

public class snack1 {
    //Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userN;

        System.out.println("Inserisci un numero: ");
        userN = Integer.parseInt(scanner.nextLine());

        int message = (userN % 2 == 0) ? userN : userN + 1;

        System.out.println();
        System.out.println(message);

        scanner.close();
    }
}
