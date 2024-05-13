package Assignment6_Object_Oriented_Programming_Lang;

public abstract class MediaDevice {
    protected String name;

    public MediaDevice(String name) {
        this.name = name;
    }

    public abstract void displayDetails();

}
