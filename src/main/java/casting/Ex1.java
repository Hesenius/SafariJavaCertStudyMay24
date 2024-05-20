package casting;

final class B1 {}

/*final*/ class Base {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}

class Sub extends Base {
  void doBaseStuff() { System.out.println("doSubStuff"); }
  void doOtherStuff() { System.out.println("doOtherStuff"); }
}
//
//class Sub2 extends Base implements Runnable {
//  @Override
//  public void run() {
//    System.out.println("Whoot, I'm running!");
//  }
//}

public class Ex1 {
  public static void main(String[] args) {
//    Base b = null;
    Base b = new Sub();
//    Base b = new Sub2();
    ((Runnable) b).run();

    B1 b1 = null;
//    if (b1 instanceof Runnable) {} // impossible, and illegal

  }
}
