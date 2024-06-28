 class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    public void bersuara(){
        System.out.println("Hewan "+nama+"bersuara");
    }
    public void makan(String makanan){
        System.out.println("Hewan "+nama+"makan"+makanan);
    }
    public void tidur(){
        System.out.println("Hewan "+nama+"sedang tidur");
    }
    public void bergerak(){
        System.out.println("Hewan "+nama+"bergerak");
    }
    public void setUmur(int umur){
        this.umur=umur;
    }
    public int getUmur(){
        return umur;
    }

}