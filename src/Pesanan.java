public class Pesanan {
    private Film film;
    private Studio studio;
    private double totalHarga;
    private Penonton penonton;
    private Tiket tiket;
    public Pesanan(){}
    public Pesanan(Film film, Studio studio, Penonton penonton, Tiket tiket) {
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
