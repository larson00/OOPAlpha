//Create a class called Screen that implements ScreenSpec.  Add three fields
//String resolution int refreshrate int responsetime
//
//    Complete the methods from the ScreenSpec interface.
//
//    Add a toString method that will
//    return the details of the 3 field in the same format as the Product Class.
public class Screen implements ScreenSpec {

  @Override
  public int getRefreshRate() {
    return 0;
  }

  @Override
  public int getResponseTime() {
    return 0;
  }

  @Override
  public String getResolution() {
    return null;
  }
  public String toString() {
    return " Refresh Rate " + getRefreshRate() +
        "Response Time " + getResponseTime() +
        "Resolution" + getResolution();
  }

}


