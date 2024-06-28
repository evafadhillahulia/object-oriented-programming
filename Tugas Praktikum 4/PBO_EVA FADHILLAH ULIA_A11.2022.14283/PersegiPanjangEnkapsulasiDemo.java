public class PersegiPanjangEnkapsulasiDemo {
    
    /* Main method */
    public static void main(String[] args) { 
        System.out.println("Sebelum membuat objek");
        System.out.println("Jumlah objek = " + PersegiPanjangEnkapsulasi.getJumlahObjek());

        // Membuat objek persegi panjang pertama
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        System.out.println("Luas persegi panjang 1 = " + pp1.getLuas());
        System.out.println("Jumlah Objek = " + PersegiPanjangEnkapsulasi.getJumlahObjek());

        // Membuat objek persegi panjang kedua
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi();
        pp2.setPanjang(6);
        pp2.setLebar(7);
        System.out.println("Luas persegi panjang 2 = " + pp2.getLuas());
        System.out.println("Jumlah objek = " + PersegiPanjangEnkapsulasi.getJumlahObjek());

        // Membuat objek persegi panjang ketiga
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(8, 5);
        System.out.println("Luas persegi panjang 3 = " + pp3.getLuas());
        System.out.println("Jumlah objek = " + PersegiPanjangEnkapsulasi.getJumlahObjek());
    }
}
