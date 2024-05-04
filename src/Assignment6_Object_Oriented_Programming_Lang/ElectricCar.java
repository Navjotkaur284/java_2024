package Assignment6_Object_Oriented_Programming_Lang;

public class ElectricCar extends Car {
    protected double batteryCapacity;

    public ElectricCar(String make, String model, int year, int numDoors, double batteryCapacity) {
        super(make, model, year, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery() {
        System.out.println("Charging the battery...");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery capacity: " + batteryCapacity + " kWh");
    }

}
