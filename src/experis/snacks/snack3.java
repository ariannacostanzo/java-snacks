package experis.snacks;

public class snack3 {
    public static void main(String[] args) {

        //Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

        int[] numbers = {5, 12, 27, 8, 15, 33, 19, 42, 10, 56, 23, 17, 9, 30, 61, 20, 14, 38, 47};

        int sum = 0;

        for (int i = 0; i < numbers.length - 1; i++) {

            if (i % 2 != 0) {
                sum += numbers[i];
            }
        }

        System.out.println(sum);
    }
}
