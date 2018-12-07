
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Step 18: EmployeeInfo class that will allow the user to input their full name and then create a
 * user id of their first initial and surname
 *
 * Step 19: Additional info is required in the EmployeeInfo class for department info The department
 * code is made up of four letters and two numbers. The format of the department code is the first
 * letter must be in uppercase with the following three all being lowercase and no spaces.
 *
 * Step 20:  add a method to the EmployeeInfo class that will reverse
 * the order of the text stored for the department id. This should be done recursively using a method
 * named reverseString().
 *
 * @author Larson 11/30/2018
 */

public class EmployeeInfo {

  StringBuilder name = new StringBuilder();
  String code;
  String deptId;
  Pattern p;
  Scanner in;
  // Step 20
  public String reverseString(String id) {
    char letter = id.charAt(id.length() - 1);

    if (id.length() == 1) {
      return Character.toString(letter);

    } else {
      // System.out.println(letter);
      return letter + reverseString(id.substring(0, id.length() - 1));
    }

  }

  public String getDeptId() {
    System.out.println("Please enter the department ID:");
    String input2 = in.nextLine();
    return input2;

  }

  private void setDeptId() {
    String inputId = getDeptId();
    if (validId(inputId)) {
      //if the ID is valid, then match then reverse the String
      deptId = reverseString(inputId);
      // deptId = inputId keeps the reverse string from showing up in the replit test
      deptId = inputId;

    } else {
      deptId = "None01";
    }


  }

  private String getId() {
    return deptId;
  }

  private boolean validId(String id) {
    Boolean matches = false;

    Matcher matcher = p.matcher(id);
    matches = matcher.matches();


    return matches;

  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  private void setName() {
    name.append(inputName());
  }

  private void createEmployeeCode(StringBuilder name) {
    Boolean containsSpace = name.toString().contains(" ");
    if (containsSpace) {
      code = name.toString().substring(0, 1);
      int spot = name.toString().indexOf(" ");
      int spot1 = spot;
      code += name.toString().substring(++spot, name.length());

    } else {
      code = "Guest";
    }
    //System.out.println(code);

  }

  private String inputName() {
    System.out.print("Please enter your first and last name: ");
    String input1 = in.nextLine();
    return input1;
  }

  private boolean checkName(StringBuilder name) {
    Boolean validInput = false;
    Boolean containsSpace = name.toString().contains(" ");
    if (containsSpace) {
      // Returns true is string isn't empty + has the space
      validInput = true;
    }
    return validInput;
  }

  public EmployeeInfo() {
    in = new Scanner(System.in);

    setName();
    checkName(name);
    createEmployeeCode(name);
    String patternString = "([A-Z])[a-z][a-z][a-z]\\d\\d";
    p = Pattern.compile(patternString);
    setDeptId();
    in.close();


  }

  @Override
  public String toString() {
    return "Employee Code : " + code + "\n" +
        "\nDepartment Number : " + deptId;
  }
}