class Motor extends Darat {
    private int gigi;

    public int getGigi() {
        return gigi;
    }

    public void setGigi(int gigi) {
        this.gigi = gigi;
    }

    public Motor() {
    }

    public Motor(String nama,int tahunProduksi,int roda,int gigi) {
        super(nama,tahunProduksi,roda);
        setGigi(gigi);    }
    public void reset(String nama,int tahunProduksi,int roda,int gigi)
    {
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setRoda(roda);
        setGigi(gigi);
    }
    public String kategori(int gigi){
        if (gigi>0)
        {
            return "Motor manual";
        }
        else {
            return "Motor matic";
        }
    }
    public void cetak(){
        super.cetak();
        System.out.println("Gigi Kendaraan : "+gigi);
        System.out.println("Kategori Kendaraan : "+kategori(gigi));

    }
}