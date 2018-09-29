import java.util.Date;

//Create an abstract type called Product that will implement the Item interface
public abstract class Product implements Item {

  // Add the following fields to Product
// int serialNumber
// String manufacturer
// Date manufacuredOn
// String name
  int serialNumber;
  String manufacturer;
  Date manufacuredOn;
  String name;
  // Add an integer class variable called currentProductionNumber.
// This will store the next number to be assigned to serialNumber.
  static int currentProductionNumber;

  // Complete the methods from the interface Item.
//  public void setProductionNumber(int productionNumber);
  public void setProductionNumber(int productionNumber) {
    serialNumber = productionNumber;
  }

  //  public String getName();
  public String getName() {
    return name;
  }

  //public Date getManufactureDate(Date date);
  public Date getManufactureDate() {
    return manufacuredOn;
  }

  //public int getSerialNumber();
  public int getSerialNumber() {
    return serialNumber;
  }
//  Add a constructor that will take in the name of the product and set this to the field variable
// name.
// You will also assign a serial number from the currentProductionNumber.
// The currentProductionNumber should be incremented in readiness for the next instance.
// Set manufacturedOn as the current date and time
  public Product(String name){
    this.name = name;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacuredOn = new Date(System.currentTimeMillis());
  }
//  Add a toString method that will return the following: (example data shown).
//  Manufacturer : OraclProduction
//  Serial Number : 1
//  Date : Thu May 14 15:18:43 BST 2015
//  Name : Product Name
  public String toString(){
    return "Manufacturer: " + manufacturer+ "\n" +
    "Serial Number: " + serialNumber + "\n" +
    "Date: " + manufacuredOn + "\n" +
    "Name :" + name + "\n";
  }

}
