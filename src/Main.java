//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*         int[] arrInt = { 15, 33, 78, 99, 45 };
        String[] arrString = { "Hello", "World", "Ciao", "Giornata" };
        int grandStr = 3;

        int estremoSup = 75;
        int estremoInf = 20;
 */
    Auto auto1= new Auto("A", "Alfa", 1300, 3, 5, 1000);
    Auto auto2= new Auto("B", "Beta", 1300, 3, 5, 1000);
    Auto auto3= new Auto("C", "Gamma", 1300, 3, 5, 4000);
    Auto auto4= new Auto("D", "Teta", 1300, 3, 5, 5000);
        
    Auto[] listaAuto = {auto1, auto2, auto3, auto4}; 
    Concessionario concessionario = new Concessionario(listaAuto);
    concessionario.metodoPrezzoMinMax(listaAuto);

/* 
        metodoMediaDispari(arrInt);
        metodoEstremi(arrInt, estremoInf, estremoSup);
        metodoWorkString(arrString, grandStr);
 */
    }

    private static void metodoWorkString(String[] arrString, int grandStr) {

        for (int i = 0; i < arrString.length; i++) {

            if (arrString[i].length() >= grandStr) {
                System.out.println("L'elemento " + arrString[i] + " Rispetta la condizione");

            }
        }
    }

    public static void metodoEstremi(int[] arrInt, int estremoInf, int estremoSup) {
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] > estremoInf && arrInt[i] < estremoSup) {
                System.out.println("Il numero " + arrInt[i] + " è compreso tra " + estremoInf + " " + estremoSup);
            }
        }

    }

    public static void metodoMediaDispari(int[] arrInt) {
        int somma = 0;
        int count = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0) {
                somma += arrInt[i];
                count++;
            }
        }
        double mediaDisp = somma / count;
        System.out.println("La media dei valori dell'array è : " + mediaDisp);
    }

}

/*
 * Creare un programma in Java che dato un array di interi abbia i seguenti
 * metodi:
 * 
 * 
 * a)Scrivere un metodo che calcoli la media di tutti i numeri dispari
 * all’interno dell’array e stampi l’informazione a video.
 * 
 * 
 * b) Scrivere un metodo che prenda in ingresso un array e 2 valori aggiuntivi e
 * stampi tutti i valori che sono compresi tra questi due estremi.
 * 
 * Creare un programma in Java che dato un array di Stringhe abbia il seguente
 * metodo:
 * 
 * c)
 * Scrivere un metodo che accetti in ingresso un array di stringhe ed una
 * dimensione stabilita dall’utente e stampi tutte le stringhe che soddisfano il
 * requisito, lunghezza della stringa maggiore o uguale alla dimensione passata
 * nel costruttore del metodo.
 * 
 * Scrivere una classe Auto che rappresenti le seguenti informazioni relative ad
 * un autoveicolo: marca, modello, cilindrata, numero di porte, numero di posti,
 * prezzo di vendita. La classe dovrà avere un costruttore ed i metodi
 * accessori.
 * 
 * Scrivere poi una classe Concessionario che rappresenti un insieme di
 * autoveicoli tramite un Array di tipo Auto e che contenga il costruttore, i
 * metodi accessori ed un metodo che restituisce il prezzo minimo e il prezzo
 * massimo di vendita di
 * tutti gli autoveicoli presenti dal concessionario.
 * 
 */