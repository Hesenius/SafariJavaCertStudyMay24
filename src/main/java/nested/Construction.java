package nested;


class Outer {
  int anX = 99;
  void doStuff(Outer this) { // IDENTICAL to below... "this" is "receiver parameter"
//  void doStuff() { // implicit this (implicitly final in both cases)
  }

  static class Inner { }

  class InstanceInner {
    int anX = 98;
    InstanceInner(Outer Outer.this) { // implicitly final
      System.out.println("this is of type: " + this.getClass().getName());
      System.out.println("Outer.this is of type: " + Outer.this.getClass().getName());
      System.out.println("In instance inner constructor");
      System.out.println("innner anX " + anX);
      System.out.println("Outer anX " + Outer.this.anX);
    }
  }

  void makeInner() {
    this.new InstanceInner();
    new InstanceInner();
  }

  public static void main(String[] args) {
    /*Outer.*/Inner i1 = new Inner();
  }
}
public class Construction {
  public static void main(String[] args) {
    /*nested.*/Outer.Inner i1 = new Outer.Inner();
    Outer o1 = new Outer();
    Outer.InstanceInner i2 = o1.new InstanceInner();

    Outer.InstanceInner i3 = new Outer().new InstanceInner();
  }
}
