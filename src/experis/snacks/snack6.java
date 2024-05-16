package experis.snacks;

import java.util.Scanner;

public class snack6 {
    public static void main(String[] args) {

        /*Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
        Possibile usare solo : cicli, chartAt, if / switch
        Es. “25" come stringa deve essere convertito in intero 25. */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        String stringNumber = scanner.nextLine();

        int numberString = 0;
        int value = -1;

        //per ogni ciclo do al valore del carattere della parola il valore numerico corrispondente
        for (int i = 0; i < stringNumber.length(); i++) {
            char character = stringNumber.charAt(i);

            value = switch (character) {
                case '0' -> 0;
                case '1' -> 1;
                case '2' -> 2;
                case '3' -> 3;
                case '4' -> 4;
                case '5' -> 5;
                case '6' -> 6;
                case '7' -> 7;
                case '8' -> 8;
                case '9' -> 9;
                default -> value;
            };

            //mi calcolo la posizione sottraendo alla lunghezza sia 1 che l'index. es: 452,
            // la posizione al primo giro è 2 del 2
            //la posizione al secondo giro è 1 del 5
            //la posizione al terzo giro è 0 del 4
            int position = stringNumber.length() - i - 1;

            //stabilisco i numeri, le decide, le centinaia ecc
            int positionValue = (int) Math.pow(10, position);

            //4 diventa 400, 5 diventa 50 e 2 rimane due, unendoli ho 452
            numberString += value * positionValue;

        }

        System.out.println(numberString);

    }
}
