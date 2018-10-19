import java.util.Date;

/**
 * @author Larson 9/29/2018 Main File
 */
public class Main {

  public static void main(String[] args) {
    AudioPlayer a1 = new AudioPlayer("Player1", "MP3");
    System.out.println(a1.toString());

    Screen screen = new Screen();
    System.out.println(screen.toString());


  }
}
