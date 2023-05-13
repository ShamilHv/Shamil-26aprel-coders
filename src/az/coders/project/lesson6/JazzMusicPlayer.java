package az.coders.project.lesson6;

public class JazzMusicPlayer implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Jazz music played");
    }

    @Override
    public void pause() {
        System.out.println("Jazz music paused");
    }

    @Override
    public void stop() {
        System.out.println("Jazz music stopped");
    }
    public  void playJazzMusic(){
        System.out.println("Jazz music playing...");
    }
}
