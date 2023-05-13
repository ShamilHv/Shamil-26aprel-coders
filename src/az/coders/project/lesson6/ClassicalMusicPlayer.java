package az.coders.project.lesson6;

public class ClassicalMusicPlayer implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Classic music played");
    }

    @Override
    public void pause() {
        System.out.println("Classic music paused");
    }

    @Override
    public void stop() {
        System.out.println("Classic music stopped");
    }
    public  void playClassicalMusic(){
        System.out.println("Classical music playing...");
    }
}