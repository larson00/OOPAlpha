/**
 * Step 11
 *
 * @author Larson
 */
// Create a class called MoviePlayer that extends Product and implements MultimediaControl
public class MoviePlayer extends Product implements MultimediaControl {

  // Add 2 fields to this class called screen and monitor type and assign appropriate types to them.
  public MonitorType monitorType;
  public String screen;


  public MoviePlayer(String screen, String name) {
    super(name);
    this.monitorType = MonitorType.LCD;
    this.monitorType = MonitorType.LED;
    this.screen = screen;

  }

  // Complete the methods from the MultimediaControl interface
  // in a similar fashion to the audio player.
  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  @Override
  public void stop() {
    System.out.println("Stopping movie");
  }

  @Override
  public void previous() {
    System.out.println("Previous movie");
  }

  @Override
  public void next() {
    System.out.println("Stopping movie");
  }

  // Create a toString method that calls the product toString,
  // displays the monitor and the screen details.
  public String toString() {
    return
        "Screen : Resolution : " + screen + "\n" +
            "Monitor Type : " + monitorType;

  }
}