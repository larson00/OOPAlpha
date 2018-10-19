//Create a class called Screen that implements ScreenSpec.  Add three fields
//String resolution int refreshrate int responsetime
//
//    Complete the methods from the ScreenSpec interface.
//
//    Add a toString method that will
//    return the details of the 3 field in the same format as the Product Class.
public class Screen implements ScreenSpec {
  int responseTime;
  int refreshRate;
  String resolution;


  Screen(String resolution, int refreshRate, int responseTime){
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }


  @Override
  public int getRefreshRate() {
    return refreshRate;
  }

  @Override
  public int getResponseTime() {
    return  responseTime;
  }

  @Override
  public String getResolution() {
    return resolution;
  }
  public String toString() {
    return super.toString() +  "Resolution: " + getResolution() +
        "Refresh Rate: " + getRefreshRate() +
        "Response Time: " + getResponseTime();

  }

}


