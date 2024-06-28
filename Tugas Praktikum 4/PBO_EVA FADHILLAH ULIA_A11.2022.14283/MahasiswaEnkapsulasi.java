/* Nama : Eva Fadhillah Ulia
 * NIM  : A11.2022.14283
 */


public class MahasiswaEnkapsulasi {

    // Modifier privat
    private String nim;
    private String nama;
    private String alamat;
    private double ipk;

    public MahasiswaEnkapsulasi(){  // Tidak melakukan apapun
        this.nim="";
        this.nama="";
        this.alamat="";
        this.ipk=0.0;
    }

    public MahasiswaEnkapsulasi(String nimBaru, String namaBaru, String alamatBaru, double ipkBaru){
        nim = nimBaru;
        nama = namaBaru;
        alamat = alamatBaru;
        ipk = ipkBaru;
    }

    // Memberi nilai property nim milik class diisi dengan nilai masukan method
    public void setNim(String nimBaru){
        nim = nimBaru;
    }

    // Mengembalikan nilai dari property nim
    public String getNim(){
        return nim;
    }

    // Memberi nilai property nama milik class diisi dengan nilai masukan method
    public void setNama(String namaBaru){
        nama = namaBaru;
    }

    // Mengembalikan nilai dari property nama
    public String getNama(){
        return nama;
    }

    // Memberi nilai property alamat milik class diisi dengan nilai masukan method
    public void setAlamat(String alamatBaru){
        alamat = alamatBaru;
    }

    // Mengembalikan nilai dari property alamat
    public String getAlamat(){
        return alamat;
    }

    // Memberi nilai property ipk milik class diisi dengan nilai masukan method
    public void setIpk(double ipkBaru){
        ipk = ipkBaru;
    }
    
    // Mengembalikan nilai dari property ipk
    public double getIpk(){
        return ipk;
    }

    public String predikat(double ipk) {
        if (ipk >= 2.0 && ipk <= 2.75) {
            return "Memuaskan";
        } else if (ipk >= 2.76 && ipk <= 3.5) {
            return "Sangat memuaskan";
        } else if (ipk >= 3.51 && ipk <= 4.0) {
            return "Dengan pujian";
        } else {
            return "-";
        }
    }
}
