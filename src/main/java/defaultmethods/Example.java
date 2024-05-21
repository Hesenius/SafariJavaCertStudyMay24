package defaultmethods;

interface IntC {
  static void doCStuff() {}
}

interface IntA extends IntC {
  default void doStuff() {
    System.out.println("IntA.doStuff()");
  }
}

interface IntB {
//  void doStuff();
  default void doStuff() {
    System.out.println("IntB.doStuff()");
  }
}

class ClA implements IntA, IntB {
  public void doStuff() {
    IntC.doCStuff();
    IntA.super.doStuff();
    System.out.println("C1A.doStuff()");
  }
}

public class Example {

  public static void main(String[] args) {
    new ClA().doStuff();
  }
}
