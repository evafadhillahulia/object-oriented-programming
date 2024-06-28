public class LingkaranEnkapsulasiDemo {
    public static void main(String[] args) {
        LingkaranEnkapsulasi lingkaran1 = new LingkaranEnkapsulasi();
        LingkaranEnkapsulasi lingkaran2 = new LingkaranEnkapsulasi();
        lingkaran2.setJari(5.0);
        LingkaranEnkapsulasi lingkaran3 = new LingkaranEnkapsulasi(7.0);

        System.out.println("Objek Lingkaran 1:");
        System.out.println("Jari-jari: " + lingkaran1.getJari());
        System.out.println("Luas: " + lingkaran1.getLuas());
        System.out.println("Keliling: " + lingkaran1.getKeliling());

        System.out.println("\nObjek Lingkaran 2:");
        System.out.println("Jari-jari: " + lingkaran2.getJari());
        System.out.println("Luas: " + lingkaran2.getLuas());
        System.out.println("Keliling: " + lingkaran2.getKeliling());

        System.out.println("\nObjek Lingkaran 3:");
        System.out.println("Jari-jari: " + lingkaran3.getJari());
        System.out.println("Luas: " + lingkaran3.getLuas());
        System.out.println("Keliling: " + lingkaran3.getKeliling());

        System.out.println("\nJumlah Lingkaran yang telah dibuat: " + LingkaranEnkapsulasi.getJumlahLingkaran());
    }
}
