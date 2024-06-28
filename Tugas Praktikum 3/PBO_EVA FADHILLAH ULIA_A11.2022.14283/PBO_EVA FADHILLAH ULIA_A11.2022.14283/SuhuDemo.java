public class SuhuDemo {
    public static void main(String[] args) {
        Suhu suhu = new Suhu();
        suhu.celcius = 200;
        System.out.println("Kelvin     = " +suhu.Kelvin());
        System.out.println("Fahrenheit = " +suhu.Fahrenheit());
        System.out.println("Delisle    = " +suhu.Delisle());
        System.out.println("Rankine    = " +suhu.Rankine());
        System.out.println("Newton     = " +suhu.Reamur());
        System.out.println("Reamur     = " +suhu.Reamur());
        System.out.println("Romer      = " +suhu.Reamur());
    }
}