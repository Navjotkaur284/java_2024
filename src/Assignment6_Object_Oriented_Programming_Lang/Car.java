package Assignment6_Object_Oriented_Programming_Lang;

public class Car extends Vehicle{
    protected int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }
    public void honk() {
        System.out.println("Beep beep!");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
    }

}
