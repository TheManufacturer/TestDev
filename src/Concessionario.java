public class Concessionario {
    Auto[] listaAuto;

    public Concessionario(Auto[] listaAuto) {
        this.listaAuto = listaAuto;
    }

    public void metodoPrezzoMinMax(Auto[] listaAuto) {
        int prezzoMax = 0;
        int prezzoMin = listaAuto[0].getPrezzo();
        for (int i = 0; i < listaAuto.length; i++) {
            if (listaAuto[i].getPrezzo()> prezzoMax) {
                prezzoMax=listaAuto[i].getPrezzo();
            }
        }        
        for (int i = 0; i < listaAuto.length; i++) {
            if (listaAuto[i].getPrezzo()< prezzoMin) {
                prezzoMin=listaAuto[i].getPrezzo();
            }
        }

        System.out.println("Il prezzo minimo per l'acquisto è : " + prezzoMin );

        System.out.println("Il prezzo massimo per l'acquisto è : " + prezzoMax );

    }

}

/*
 * * Scrivere poi una classe Concessionario che rappresenti un insieme di
 * autoveicoli tramite un Array di tipo Auto e che contenga il costruttore, i
 * metodi accessori ed un metodo che restituisce il prezzo minimo e il prezzo
 * massimo di vendita di
 * tutti gli autoveicoli presenti dal concessionario.
 */