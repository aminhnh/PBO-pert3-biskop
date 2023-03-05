public class Tiket {
    int jmlKursiIngin;
    double harga;

    // Constructors
    Tiket(){}
    public Tiket (int jmlKursiIngin){
        this.jmlKursiIngin = jmlKursiIngin;
    }
    // Meng-override method .toString() bawaan untuk print pesan custom
    @Override
    public String toString() {
        return "Tiket: " +
                "jmlKursiIngin=" + jmlKursiIngin +
                ", harga=" + harga+
                "\n";
    }
}

