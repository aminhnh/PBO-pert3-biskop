import java.util.ArrayList;
public class Pesanan {
    Film film;
    Studio studio;
    int jmlKursi;
    private double totalHarga;
    ArrayList<Tiket> daftarTiket = new ArrayList<>();
    Penonton penonton;
    Pesanan(){}
    Pesanan(Film film, Studio studio, Penonton penonton) {
        this.film = film;
        this.studio = studio;
        this.penonton = penonton;
    }
    double getTotalHarga(){
        for (Tiket tiket : daftarTiket) {
            tiket.harga = studio.hargaTiket;
            totalHarga += tiket.harga;
        }
        return totalHarga;
    }
    void tambahTiket(Tiket tiketBaru){
        if (daftarTiket.size() > 0) {
            for (Tiket tiket : daftarTiket) {
                jmlKursi += tiket.jmlKursiIngin;
            }
        }
        if (jmlKursi + tiketBaru.jmlKursiIngin > studio.jmlKursi){
            System.out.println("Tidak dapat menambah tiket pada pesanan karena jumlah kursi tidak tersedia.");
        } else {
        jmlKursi += tiketBaru.jmlKursiIngin;
        daftarTiket.add(tiketBaru);
        }
    }
    void kurangiTiket(Tiket tiket){

        daftarTiket.remove(tiket);
    }
    @Override
    public String toString() {
        return "+++++++++++++++ Pesanan +++++++++++++++\n"+
                film.toString() +
                studio.toString() +
                penonton.toString() +
                "Jumlah Tiket : "+daftarTiket.size()+
                "\nTotal Harga : "+getTotalHarga()+
                "\n_______________________________________";
    }
}
