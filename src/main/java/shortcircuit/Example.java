package shortcircuit;

public class Example {

  public static boolean v1() {
    return true;
  }

  public static boolean v2() {
    if (Math.random() < 10) {
      throw new RuntimeException();
    } else {
//      throw new IllegalArgumentException();
      return false;
    }
  }

  public static void main(String[] args) {
//    System.out.println(v1() || v2());
    System.out.println(v1() | v2());
  }
}
