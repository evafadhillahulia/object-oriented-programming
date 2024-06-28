public class LingkaranEnkapsulasi {
    
    private double jari_jari;
    private static int jumlahLingkaran = 0;
    private final double phi = 3.14;

    public LingkaranEnkapsulasi() {
        jumlahLingkaran++;
    }
  
    public LingkaranEnkapsulasi(double jari_jari_baru) {
        this.jari_jari = jari_jari_baru;
        jumlahLingkaran++;
    }

    public void setJari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public double getJari() {
        return jari_jari;
    }

    public double getLuas() {
        return phi * jari_jari * jari_jari;
    }

    public double getKeliling() {
        return 2 * phi * jari_jari;
    }

    public static int getJumlahLingkaran() {
        return jumlahLingkaran;
    }
}
