package Assignment6_Object_Oriented_Programming_Lang;

class AudioPlayer extends MediaDevice implements Playable{
    private String songName;
    private String artist;

    public AudioPlayer(String name, String songName, String artist) {
        super(name);
        this.songName = songName;
        this.artist = artist;
    }

    @Override
    public void displayDetails() {
        System.out.println("Audio Player Name: " + name);
        System.out.println("Song: " + songName);
        System.out.println("Artist: " + artist);

    }

    @Override
    public void play() {
        System.out.println("Playing audio " + songName + " by " + artist);
    }
}
