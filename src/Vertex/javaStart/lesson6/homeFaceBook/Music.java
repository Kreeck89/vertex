package Vertex.javaStart.lesson6.homeFaceBook;

import java.util.ArrayList;

public class Music extends Friends {

    ArrayList<String> arrayMusic = new ArrayList<>();
    private static int volume;

    /**
     * Add music to playList.
     */
    public void addLinkMusic(String link) {
        arrayMusic.add(link);
    }

    /**
     * Simulator of playing some music.
     */
    public void semulatorPlayMusic() throws InterruptedException {
        for (int i = 0; i < arrayMusic.size(); i++) {
            arrayMusic.get(i);
            Thread.sleep(1_000);
        }
    }

    public static int getVolume() {
        return volume;
    }

    public static void setVolume(int volume) {
        Music.volume = volume;
    }
}
