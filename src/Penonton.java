public class Penonton {
    String nama;
    long nomorID;
    char jenisKelamin;
    Penonton(){}
    Penonton(String nama, long nomorID, char jenisKelamin){
        this.nama = nama;
        this.nomorID = nomorID;
        this.jenisKelamin = jenisKelamin;
    }
    public String toString(){
        return "Penonton : Nama = "+nama+
                ", Nomor Identitas = "+nomorID+
                ", Jenis Kelamin = "+jenisKelamin+
                "\n";
    }
}
