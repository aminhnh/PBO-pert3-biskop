public class Pesanan {
    private Film film;
    private Studio studio;
    private double totalHarga;
    private Penonton penonton;
    private Tiket tiket;

    // Constructors
    public Pesanan(){}
    public Pesanan(Film film, Studio studio, Penonton penonton, Tiket tiket) {
        // Mengecek apakah jumlha kursi yang ingin dipesan melebih sisa kursi di studio
        // Jika ya, lanjut ke constructor, jika tidak, print error.
        if ( tiket.jmlKursiIngin <= studio.getSisaKursi() ){
            studio.bookingKursi(tiket.jmlKursiIngin);
            tiket.harga = studio.hargaTiket;
            this.film = film;
            this.studio = studio;
            this.penonton = penonton;
            this.tiket = tiket;
            this.totalHarga = tiket.harga * tiket.jmlKursiIngin;
        } else {
            System.out.println("Tidak dapat memesan tiket karena jumlah kursi tidak tersedia.\n");
        }
    }
    // Meng-override method .toString() bawaan untuk print pesan custom
    @Override
    public String toString() {
        return "+++++++++++++++ Pesanan +++++++++++++++\n"+
                film.toString() +
                studio.toString() +
                penonton.toString() +
                "Jumlah Tiket : "+tiket.jmlKursiIngin+
                "\nTotal Harga : "+totalHarga+
                "\n_______________________________________\n";
    }
}
