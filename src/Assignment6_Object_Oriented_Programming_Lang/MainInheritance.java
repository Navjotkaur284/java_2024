package Assignment6_Object_Oriented_Programming_Lang;

public class MainInheritance {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 4);
        car.start();
        car.displayInfo();
        car.honk();
        car.stop();
        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Honda", "CBR1000RR", 2020, 4);
        motorcycle.start();
        motorcycle.displayInfo();
        motorcycle.wheelie();
        motorcycle.stop();
        System.out.println();

        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2023, 4, 100);
        electricCar.start();
        electricCar.displayInfo();
        electricCar.honk();
        electricCar.chargeBattery();
        electricCar.stop();
    }
}
