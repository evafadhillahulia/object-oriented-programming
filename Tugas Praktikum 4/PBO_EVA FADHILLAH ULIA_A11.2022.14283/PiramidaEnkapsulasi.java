public class PiramidaEnkapsulasi {
    
    private int tinggi;
    private int alas;
    private int jumlahSisi;
    private double luasPermukaan;
    private double volume;

    public PiramidaEnkapsulasi(int tinggi, int alas, int jumlahSisi) {
        this.tinggi = tinggi;
        this.alas = alas;
        this.jumlahSisi = jumlahSisi;
        hitungLuasPermukaan();
        hitungVolume();
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
        hitungLuasPermukaan();
        hitungVolume();
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
        hitungLuasPermukaan();
        hitungVolume();
    }

    public int getJumlahSisi() {
        return jumlahSisi;
    }

    public void setJumlahSisi(int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

    private void hitungLuasPermukaan() {
        luasPermukaan = 0.5 * alas * jumlahSisi + 0.5 * alas * Math.sqrt(Math.pow(tinggi, 2) + Math.pow(alas / (2 * Math.tan(Math.PI / jumlahSisi)), 2));
    }

    private void hitungVolume() {
        volume = (1.0 / 3) * alas * alas * tinggi;
    }
}
