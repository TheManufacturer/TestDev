public class Auto {
    private String marca;
    private String modello;
    private int cilindrata;
    private int  numeroPorte;
    private int numeroPosti;
    private int prezzo;
    
    public Auto(String marca, String modello, int cilindrata, int numeroPorte, int numeroPosti, int prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.numeroPorte = numeroPorte;
        this.numeroPosti = numeroPosti;
        this.prezzo = prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public int getPrezzo() {
        return prezzo;
    }

}
