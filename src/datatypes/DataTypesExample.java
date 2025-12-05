package datatypes;


public class DataTypesExample {
  //Instance variables - non static variables
  byte byteValue;
  short shortValue;
  int intValue;
  long longValue;
  float floatValue;
  double doubleValue;
  char charValue;
  boolean booleanValue;

  static final int age = 25; //  static variable

  public static void main(String[] args) {
    DataTypesExample dataTypesExample = new DataTypesExample(); // Reference variable - Object creation
    DataTypesExample obj2 = new DataTypesExample();

    String name= "XYZ"; // Local variable
    System.out.println("Name: "+name);
    System.out.println("Data Types in Java:");
    System.out.println("Byte: " + dataTypesExample.byteValue);
    System.out.println("Short: " + dataTypesExample.shortValue);
    System.out.println("Integer: " + dataTypesExample.intValue);
    System.out.println("Long: " + dataTypesExample.longValue);
    System.out.println("Float: " + dataTypesExample.floatValue);
    System.out.println("Double: " + dataTypesExample.doubleValue);
    System.out.println("Character: '" + dataTypesExample.charValue + "'");
    System.out.println("Boolean: " + dataTypesExample.booleanValue);
  }
}
