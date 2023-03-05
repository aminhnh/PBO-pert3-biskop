public class Film {
    String judul;
    int durasi;
    String genre;

    // Constructors
    Film(){}
    Film(String judul, int durasi, String genre){
        this.judul = judul;
        this.durasi = durasi;
        this.genre = genre;
    }
    // Meng-override method .toString() bawaan untuk print pesan custom
    @Override
    public String toString(){
        return "Film : Judul = " +judul+
                ", Durasi = "+durasi+
                ", Genre = "+genre+
                "\n";
    }
}
