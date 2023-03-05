public class Studio {
    int nomor;
    int jmlKursi;
    private int sisaKursi;
    double hargaTiket;
    Bioskop bioskop;
    public Studio(){}
    public Studio(int nomor, int jmlKursi, double hargaTiket, Bioskop bioskop){
        this.nomor = nomor;
        this.jmlKursi = jmlKursi;
        this.hargaTiket = hargaTiket;
        this.bioskop = bioskop;
        sisaKursi = jmlKursi;
    }
    public int getSisaKursi(){
        return sisaKursi;
    }
    public void bookingKursi(int jmlKursiBooking){
        sisaKursi -= jmlKursiBooking;
    }
    public String toString(){
        return "Studio : Nomor Studio = "+nomor+
                ", Jumlah Kursi = "+jmlKursi+
                ", Harga Tiket = "+hargaTiket+
                "\n";
    }
}

