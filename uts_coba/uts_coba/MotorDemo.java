class MotorDemo {
    public static int min2(int a,int b){
        if (a<b)
        {
            return a;
        }
        else {
            return b;
        }
    }
    public static boolean isNamaSama(Motor m1,Motor m2){
        if (m1.getNama().toLowerCase().equals(m2.getNama().toLowerCase())){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        
        Motor[] m = new Motor[3];
        m[0] = new Motor();
        m[1] = new Motor("Honda Vario",2024,2,0);
        m[2] = new Motor("Yamaha RX-King",1994,2,5);
        m[0].reset("Suzuki Satria",2001,2,6);
        m[1].cetak();System.out.println("");
        m[2].cetak();System.out.println("");

        System.out.println("Nama Motor pertama dan kedua");
        if (isNamaSama(m[1],m[2]))
        {
            System.out.println("sama");
        }
        else {
            System.out.println("tidak sama");
        }
        System.out.print("");
        if (m[0].getGigi()<min2(m[1].getGigi(),m[2].getGigi()))
        {
            System.out.println("Gigi paling sedikit = "+m[0].getNama());
        } else if (m[1].getGigi()<min2(m[0].getGigi(),m[2].getGigi())) {
            System.out.println("Gigi paling sedikit = "+m[1].getNama());
        }
        else {
            System.out.println("Gigi paling sedikit = "+m[2].getNama());

        }
     

    }
}