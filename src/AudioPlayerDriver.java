
public class AudioPlayerDriver {

  public static void testAudioPlayer() {
    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    System.out.println(a1.toString());

    a1.play();
    a1.stop();
    a1.previous();
    a1.next();
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV");
    System.out.println(a1.toString());

  }

}
