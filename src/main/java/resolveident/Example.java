package resolveident;

class Parent {
  static int x = 97;
}
class Thing extends Parent {
  int x = 99;

  static void showIt() {
    int x = 98;
    System.out.println("x is " + /* Thing.*/x);
//    System.out.println(new Thing().x);
  }
}
public class Example {
  public static void main(String[] args) {
    Thing.showIt();
  }
}
