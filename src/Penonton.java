public class Penonton {
    String nama;
    long nomorID;
    char jenisKelamin;

    // Constructors
    Penonton(){}
    Penonton(String nama, long nomorID, char jenisKelamin){
        this.nama = nama;
        this.nomorID = nomorID;
        this.jenisKelamin = jenisKelamin;
    }
    // Meng-override method .toString() bawaan untuk print pesan custom
    @Override
    public String toString(){
        return "Penonton : Nama = "+nama+
                ", Nomor Identitas = "+nomorID+
                ", Jenis Kelamin = "+jenisKelamin+
                "\n";
    }
}
