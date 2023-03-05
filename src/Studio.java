public class Studio {
    int nomor;
    int jmlKursi;
    double hargaTiket;
    Bioskop bioskop;
    Studio(){}
    Studio(int nomor, int jmlKursi, double hargaTiket, Bioskop bioskop){
        this.nomor = nomor;
        this.jmlKursi = jmlKursi;
        this.hargaTiket = hargaTiket;
        this.bioskop = bioskop;
    }
    public String toString(){
        return "Studio : Nomor Studio = "+nomor+
                ", Jumlah Kursi = "+jmlKursi+
                ", Harga Tiket = "+hargaTiket+
                "\n";
    }
}

