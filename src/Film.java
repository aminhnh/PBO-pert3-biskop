public class Film {
    String judul;
    int durasi;
    String genre;
    Film(){}
    Film(String judul, int durasi, String genre){
        this.judul = judul;
        this.durasi = durasi;
        this.genre = genre;
    }
    public String toString(){
        return "Film : Judul = " +judul+
                ", Durasi = "+durasi+
                ", Genre = "+genre+
                "\n";
    }
}
