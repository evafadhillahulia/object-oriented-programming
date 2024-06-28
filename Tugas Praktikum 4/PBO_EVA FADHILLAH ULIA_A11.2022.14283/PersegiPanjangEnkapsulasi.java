public class PersegiPanjangEnkapsulasi {
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0; // Ubah menjadi static

    // Konstruktor dari objek persegi panjang
    public PersegiPanjangEnkapsulasi() {
        jumlahObjek++;
    }

    // Konstruktor dari objek Persegi Panjang
    public PersegiPanjangEnkapsulasi(int panjangBaru, int lebarBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
        jumlahObjek++;
    }

    // Method setter untuk property panjang
    public void setPanjang(int panjangBaru) {
        panjang = panjangBaru;
    }

    // Method getter untuk property panjang
    public int getPanjang() {
        return panjang;
    }

    // Method setter untuk property lebar
    public void setLebar(int lebar) {
       this.lebar = lebar;
    }

    // Method getter untuk property lebar
    public int getLebar() {
        return lebar;
    }

    // Method getter untuk mengembalikan nilai getJumlahObjek
    public static int getJumlahObjek() { // Ubah menjadi static
        return jumlahObjek;
    }

    // Method getter untuk mengembalikan nilai luas persegi panjang
    public int getLuas() {
        return panjang * lebar;
    }

    // Method getter untuk mengembalikan nilai keliling
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}
