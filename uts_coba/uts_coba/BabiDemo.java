public class BabiDemo {
    public static void main(String[]args){
        Babi babi = new Babi("C.leng",3);
        babi.bersuara();
        babi.berendamLumpur();
        babi.makan("");
        babi.bergerak();
        babi.tidur();
        babi.setUmur(2);
        System.out.println("Babi"+babi.nama+"sekarang berumur"+babi.getUmur()+"tahun");

    }
    
}
