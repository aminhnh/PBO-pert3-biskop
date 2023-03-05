import java.util.ArrayList;

public class Tiket {
    int jmlKursiIngin;
    double harga;
    Tiket(){}
    Tiket (int jmlKursiIngin){
        this.jmlKursiIngin = jmlKursiIngin;
    }
    public String toString() {
        return "Tiket: " +
                "jmlKursiIngin=" + jmlKursiIngin +
                ", harga=" + harga+
                "\n";
    }
}

