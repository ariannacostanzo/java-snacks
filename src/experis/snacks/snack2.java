package experis.snacks;

import java.util.Random;

public class snack2 {
    public static void main(String[] args) {

        //Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una
        // lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.

        String[] names = {"Pippo", "Francesco", "Marco", "Henry", "Gioacchino", "Gertrude", "Arianna", "Valeria", "Matilde", "Chiara", "Luca", "Emma", "Olivia", "Giovanni", "Mason"};
        String[] surnames = {"Impastato", "Arena", "Fonti", "Lancellotti", "Cavill", "Simpson", "Turner", "Dinkleberg", "Costanzo", "Rossi", "Russo", "Conti", "Williams", "Wilson", "Moretti"};
        Random randomGenerator = new Random();



        for (int i = 0; i < names.length; i++) {
            int randomNumber = randomGenerator.nextInt(0, names.length);
            System.out.println(names[randomNumber] + " " + surnames[randomNumber]);
        }


    }
}
