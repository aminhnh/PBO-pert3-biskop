import java.util.ArrayList;

public class Bioskop {
    String nama;
    String alamat;
    private ArrayList<Film> daftarFilm = new ArrayList<>();

    // Constructors
    Bioskop(){}
    Bioskop(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    Bioskop(String nama, String alamat, ArrayList<Film> daftarFilm){
        this.nama = nama;
        this.alamat = alamat;
        this.daftarFilm = daftarFilm;
    }

    // Method untuk menambah dan menghapus film pada suatu objek bioskop
    void tambahFilm(Film film) {
        daftarFilm.add(film);
    }
    void hapusFilm(Film film){
        daftarFilm.remove(film);
    }
}
