package Assignment6_Object_Oriented_Programming_Lang;

public class ImageDisplay extends MediaDevice {

    private String imageName;
    private String resolution;

    public ImageDisplay(String name, String imageName, String resolution)
    {
        super(name);
        this.imageName = imageName;
        this.resolution = resolution;
    }

    public void displayImage(){
        System.out.println("Display the image: " + imageName);
    }
    @Override
    public void displayDetails() {
        System.out.println("Image Display Device : " + name);
        System.out.println("Image Name: " + imageName);
        System.out.println("Resolution: " + resolution);
    }
}