package Assignment6_Object_Oriented_Programming_Lang;

public class VideoPlayer extends MediaDevice implements Playable{
    private String videoTitle;
    public double duration;

    public VideoPlayer(String name, String videoTitle, double duration ){
        super(name);
        this.videoTitle = videoTitle;
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Video Player Name: " + name);
        System.out.println("Video Title: " + videoTitle);
        System.out.println("Duration: " + duration + " mins");
    }

    @Override
    public void play() {
       System.out.println("Playing Video: " + videoTitle + "Duration: " + duration + " mins");
    }
}
