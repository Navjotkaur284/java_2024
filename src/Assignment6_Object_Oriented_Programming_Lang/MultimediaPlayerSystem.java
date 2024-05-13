package Assignment6_Object_Oriented_Programming_Lang;

public class MultimediaPlayerSystem {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer("Sony NW-A306", "Born to Shine", "Diljit Dosanjh");
        VideoPlayer videoPlayer = new VideoPlayer("VLC Media Player", "Animal", 190.0);
        ImageDisplay imageDisplay = new ImageDisplay("Media Slider", "Nature", "1920 X 1080");

        audioPlayer.displayDetails();
        audioPlayer.play();
        System.out.println();

        videoPlayer.displayDetails();
        videoPlayer.play();
        System.out.println();

        imageDisplay.displayDetails();
        imageDisplay.displayImage();
        System.out.println();
    }
}
