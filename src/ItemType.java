/**
 * @author Larson 9/29/2018 Enum class ItemType for types Audio, Visual, AudioMobile, VisualMobile
 */
public enum ItemType {
  //All items will have a pre-set type. Currently there are 4 types.
  //Create an enum called ItemType that will store the following information.
  //Type Code
  //Audio AU
  //Visual VI
  //AudioMobile AM
  //VisualMobile VM
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");
  public String code;
  ItemType (String code){
    this.code = code;
  }
  public String getCode() {
    return code;
  }

  }
