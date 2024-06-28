public class PiramidaEnkapsulasiDemo {
    public static void main(String[] args) {
        PiramidaEnkapsulasi piramida = new PiramidaEnkapsulasi(5, 6, 4);
        tampilkanInfo(piramida);
        piramida.setTinggi(8);
        tampilkanInfo(piramida);
    }

    public static void tampilkanInfo(PiramidaEnkapsulasi piramida) {
        System.out.println("Informasi Piramida:");
        System.out.println("Tinggi: " + piramida.getTinggi());
        System.out.println("Alas: " + piramida.getAlas());
        System.out.println("Jumlah Sisi: " + piramida.getJumlahSisi());
        System.out.println("Luas Permukaan: " + piramida.getLuasPermukaan());
        System.out.println("Volume: " + piramida.getVolume());
    }
}
