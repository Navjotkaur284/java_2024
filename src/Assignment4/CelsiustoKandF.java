package Assignment4;

public class CelsiustoKandF {

    public static int converttemp(int x) {
        return x + 273;
    }
    public static double converttemp(double x) {

        return (x *1.8) + 32;
    }
    public static void main(String[] args) {

        int Kelvin = converttemp(1);
        System.out.println("Temperature in Kelvin:" + Kelvin);

        double Cel = converttemp(1.0);
        System.out.println("Temperature in Celsius:" + Cel);

    }

}
