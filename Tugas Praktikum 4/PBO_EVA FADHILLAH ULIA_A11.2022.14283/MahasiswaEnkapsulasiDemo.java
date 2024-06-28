public class MahasiswaEnkapsulasiDemo {

    public static void main(String[] args) {
        MahasiswaEnkapsulasi mhs = new MahasiswaEnkapsulasi(
            "EVA FADHILLAH ULIA",
            "A11.2022.14283",
            "Jalan-Jalan Yuk",
            3.9
        );
        cetak(mhs);
    }

    // Menampilkan nama, nim , alamat , ipk dan predikat
    public static void cetak(MahasiswaEnkapsulasi mhs){
        System.out.println("Nama     :" + mhs.getNama());
        System.out.println("NIM      :" + mhs.getNim());
        System.out.println("Alamat   :" + mhs.getAlamat());
        System.out.println("IPK      :" + mhs.getIpk());   
        System.out.println("Predikat :" + mhs.predikat(mhs.getIpk()));
    }    
}
