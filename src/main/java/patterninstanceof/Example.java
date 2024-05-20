package patterninstanceof;

public class Example {
  public static void main(String[] args) {
//    String s = "Hello";
    Object s = "Hello";
    if (s instanceof String) {
      String str = (String)s;
      System.out.println("it's a String " + str + " of length " + str.length());
    } else {
      System.out.println("it's something else " + s);
    }

    if (s instanceof String str) { // NOT allowed if s is declared as String (Java 17 specific!!!)
      System.out.println("it's a String " + str + " of length " + str.length());
    } else {
      System.out.println("it's something else " + s);
    }

    boolean isString = s instanceof String str;

    s = "Hello";

    if (s instanceof String str && str.length() > 3) System.out.println(str);
    else System.out.println("Nope");


    if (!(s instanceof String str) || str.length() <= 3) System.out.println("Nope");
    else System.out.println(str);
  }
}
