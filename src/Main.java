public class Main {
    public static void main(String[] args) {
        // Membuat bioskop (parameter nama & alamat)
        Bioskop bioskop1 = new Bioskop("Cinepolis", "Jl. Laksda Adisucipto. 32-34, DIY");

        // Membuat film (parameter judul, durasi dan genre)
        Film film1 = new Film("Behind You", 112, "Mystery/Thriller");
        Film film2 = new Film("Suzume", 121, "Anime");
        Film film3 = new Film("He Never Dies", 170, "Adventure/Action");

        // Menambah dan menghapus film pada bioskop
        bioskop1.tambahFilm(film1);
        bioskop1.tambahFilm(film2);
        bioskop1.hapusFilm(film3);

        // Membuat studio (parameter nomor, jumlah kursi, dan harga tiket)
        Studio studio1 = new Studio(1, 10, 22000, bioskop1);
        Studio studio2 = new Studio(2, 10, 33000,bioskop1);

        // Membuat penonton (parameter nama, nomor identifikasi, dan jenis kelamin)
        Penonton penonton1 = new Penonton("Risma", 505613, 'P');
        Penonton penonton2 = new Penonton("Salwa", 504834, 'P');
        Penonton penonton3 = new Penonton("Manda", 499652, 'P');

        // Membuat tiket (parameter jumlah kursi yang ingin di pesan)
        Tiket tiket1 = new Tiket(3);
        Tiket tiket2 = new Tiket(7);
        Tiket tiket3 = new Tiket(11);

        // Membuat pesanan, dan menambahkan tiket pada pesanan
        Pesanan pesanan1 = new Pesanan(film1, studio1, penonton1, tiket1);
        Pesanan pesanan2 = new Pesanan(film2, studio1, penonton2, tiket2);

        // Print pesanan dengan method .toString()
        System.out.println(pesanan1);
        System.out.println(pesanan2);


        Pesanan pesanan3 = new Pesanan(film2, studio2, penonton3, tiket3);
        // Pesanan3 akan menghasilkan output "Tidak dapat menambah tiket..."
        // Hal ini karena kursi yang diinginkan (11) melebihi kapasitas kursi di studio2 (10)

        // Mengurangi kursi yang ingin di pesan, lalu membuat pesanan baru dan print
        tiket3.jmlKursiIngin -= 1;
        Pesanan pesanan4 = new Pesanan(film2, studio2, penonton3, tiket3);
        System.out.println(pesanan4);
    }
}
