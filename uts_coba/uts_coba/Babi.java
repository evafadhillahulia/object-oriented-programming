public class Babi extends Hewan {
    public Babi(String nama,int umur){
        super(nama,umur);
    }
    public void bersuara(){
        System.out.println("Babi bersuara oink oink");
    }
    public void berendamLumpur(){
        System.out.println("Babi"+nama+"berendam di lumpur");
    }
}
