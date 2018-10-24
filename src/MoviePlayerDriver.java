/**
 * Step 12
 * @author Larson
 */
// Create a diver class to test the functionality of the movie player.
public class MoviePlayerDriver {

  public static void testMoviePlayer() {

    MoviePlayer m1 = new MoviePlayer("720x480", "LCD");
    m1.play();
    m1.stop();
    m1.next();
    m1.previous();
    System.out.println(m1.toString());

    MoviePlayer m2 = new MoviePlayer("1366x768", "LED");
    System.out.println(m2.toString());
  }
}
