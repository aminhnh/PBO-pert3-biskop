public class Studio {
    int nomor;
    int jmlKursi;
    private int sisaKursi;
    double hargaTiket;
    Bioskop bioskop;

    // Constructors
    public Studio(){}
    public Studio(int nomor, int jmlKursi, double hargaTiket, Bioskop bioskop){
        this.nomor = nomor;
        this.jmlKursi = jmlKursi;
        this.hargaTiket = hargaTiket;
        this.bioskop = bioskop;
        sisaKursi = jmlKursi;
    }
    // Method untuk me-return sisaKursi karena sisaKursi di private
    public int getSisaKursi(){
        return sisaKursi;
    }
    // Method untuk mengurangi sisa kursi setelah pesanan berhasil dilakukan
    public void bookingKursi(int jmlKursiBooking){
        sisaKursi -= jmlKursiBooking;
    }
    // Meng-override method .toString() bawaan untuk print pesan custom
    @Override
    public String toString(){
        return "Studio : Nomor Studio = "+nomor+
                ", Jumlah Kursi = "+jmlKursi+
                ", Harga Tiket = "+hargaTiket+
                "\n";
    }
}

