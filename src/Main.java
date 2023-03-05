public class Main {
    public static void main(String[] args) {
        // Membuat bioskop
        Bioskop bioskop1 = new Bioskop("Cinepolis", "Jl. Laksda Adisucipto. 32-34, DIY");

        // Membuat film
        Film film1 = new Film("They're Missing", 112, "Mystery/Thriller");
        Film film2 = new Film("Suzume", 195, "Anime");
        Film film3 = new Film("He Never Dies", 78, "Adventure/Action");

        // Menambah dan menghapus film pada bioskop
        bioskop1.tambahFilm(film1);
        bioskop1.tambahFilm(film2);
        bioskop1.hapusFilm(film3);

        // Membuat studio
        Studio studio1 = new Studio(1, 10, 30000, bioskop1);
        Studio studio2 = new Studio(2, 10, 42000,bioskop1);

        // Membuat penonton
        Penonton penonton1 = new Penonton("Risma", 505613, 'P');
        Penonton penonton2 = new Penonton("Salwa", 504834, 'P');
        Penonton penonton3 = new Penonton("Manda", 499652, 'P');

        // Membuat tiket
        Tiket tiket1 = new Tiket(3);
        Tiket tiket2 = new Tiket(7);
        Tiket tiket3 = new Tiket(11);

        // Tiket dibawah akan menghasilkan output "Tidak dapat menambah tiket..."
        // Hal ini karena kursi yang diinginkan melebihi kapasitas kursi di studio2
        Tiket tiket4 = new Tiket(11);


        // Membuat pesanan, dan menambahkan tiket pada pesanan
        Pesanan pesanan1 = new Pesanan(film1, studio1, penonton1);
        pesanan1.tambahTiket(tiket3);
        pesanan1.tambahTiket(tiket1);
        pesanan1.tambahTiket(tiket2);

        Pesanan pesanan2 = new Pesanan(film3, studio1, penonton2);

        Pesanan pesanan3 = new Pesanan(film2, studio2, penonton3);


        System.out.println(pesanan1.toString());
        System.out.println(pesanan2.toString());
        System.out.println(pesanan3.toString());
    }
}
