//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        int[] arr = { 3, 4, 8, 9, 10 };
        String[] arrayStrings = { "Ciao", "come", "stai", "caro" };
        int grandezza = 5;

        maxMin(arr);
        sommaPari(arr);
        cercaStringa(arrayStrings, grandezza);


    }

    // qui il metodo c

    public static boolean cercaStringa(String[] arrayStrings, int grandezza) {
        for (int i = 0; i < arrayStrings.length; i++) {
            if (arrayStrings[i].length() == grandezza) {
                System.out.println("Il valore esiste all'interno: true");
                return true;
            }
        }
        System.out.println("Il valore non esiste all'interno: false");
        return false;
    }
    
    

    // qui i metodi a e b

    public static void maxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            } else {
                System.out.println("numero inserito non valido");
            }
        }
        System.out.println("il min in questo array è" + min);
        System.out.println("il max in questo array è" + max);
    }

    public static void sommaPari(int[] arr) {
        int sommaPari = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sommaPari += arr[i];
            }
        }
        System.out.println("La Somma dei pari e: " + sommaPari);
    }
}

/*
 * Creare un programma in Java che dato un array di interi abbia i seguenti
 * metodi
 * 
 * a) Scrivere un metodo che a partire da un array calcoli il valore massimo e
 * il valore minimo e
 * stampi l’informazione a video.
 * 
 * b) Scrivere un metodo che calcoli la somma di tutti i numeri pari all’interno
 * dell’array e stampi l’informazione a video.
 * 
 * 
 * Creare un programma in Java che dato un array di Stringhe abbia il seguente
 * metodo:
 * 
 * c) Scrivere un metodo che ricerchi se una stringa di lunghezza definita
 * dall’utente è contenuta o meno all’iterno dell’array e che restituisca true o
 * false come risultato della ricerca. Il risultato della ricerca dovrà essere
 * stampato a video.
 */