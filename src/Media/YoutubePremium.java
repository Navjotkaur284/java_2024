package Media;

public class YoutubePremium extends Youtube implements AudioMediaPlayer, VideoMediaPlayer {

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();

    }

    @Override
    public void stop() {
        super.stop();
    }
    @Override
    public boolean chatsAllowed() {
        return false;
    }

    @Override
    public boolean screenOffAllowed() {
        return false;
    }
}
