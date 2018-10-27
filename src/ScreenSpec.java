/**
 * Step 8: Interface ScreenSpec. Includes 3 methods.
 *
 * @author Larson 10/27/2018
 */
// Create an interface called ScreenSpec.  This will define 3 methods:
// public String getResolution();
// public int getRefreshRate();
// public int getResponseTime();
public interface ScreenSpec {

  int getRefreshRate();

  int getResponseTime();

  String getResolution();


}
