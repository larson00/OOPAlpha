/**
 * @author Larson
 */
// We require a concrete class that will allow us to capture the details of an audio player.
// Create a class called AudioPlayer that is a subclass of Product
// and implements the MultimediaControl interface.
public class AudioPlayer extends Product implements MultimediaControl {
// The class will have 2 fields
// String audioSpecification
// ItemType mediaType


  public String audioSpecification;
  public ItemType mediaType;

  // Create a constructor that will take in 2 parameters – name and audioSpecification.
  public AudioPlayer(String name, String audioSpecification) {
    // The constructor should call its parents constructor and also setup the media type.
    super();

  }

  @Override
  public void play() {

  }

  @Override
  public void stop() {

  }

  @Override
  public void previous() {

  }

  @Override
  public void next() {

  }
}
