package experis.snacks;

import java.util.Scanner;

public class snack5 {
    public static void main(String[] args) {

        /*Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
        Continuare a chiedere una nuova stringa finchè non si inserisce 0.
        */

        Scanner scanner = new Scanner(System.in);

        //inizializzo i miei contatori
        int numbers = 0;
        int alphabeth = 0;
        int notNumberOrLetters = 0;

        //finchè l'utente non inserisce 0
        while (true) {
            System.out.println("Inserisci una stringa: (scrivi 0 per chiudere)");
            String inputString = scanner.nextLine();

            if (inputString.equals("0")) {
                break;
            }

            //aumento i contatori in base al tipo di carattere
            for (int i = 0; i < inputString.length(); i++) {
                char character = inputString.charAt(i);
                if (Character.isDigit(character)) {
                    numbers++;
                } else if (Character.isLetter(character)) {
                    alphabeth++;
                } else {
                    notNumberOrLetters++;
                }
            }

            //stampo i risultati
            System.out.println("Caratteri numerici: " + numbers);
            System.out.println("Caratteri alfabetici: " + alphabeth);
            System.out.println("Caratteri non alfanumerici: " + notNumberOrLetters);
            System.out.println();


            //resetto i contatori
            numbers = 0;
            alphabeth = 0;
            notNumberOrLetters = 0;

        }





        scanner.close();
    }
}
