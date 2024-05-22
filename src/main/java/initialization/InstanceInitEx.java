package initialization;


class Parent {
  int getXValue(Parent this) {
    System.out.println("x is " + x);
    System.out.println("in getXValue()");
    return 99;
  }
  {
    System.out.println("value of x is " + this.x);
  }
  int x = getXValue();
  Parent() {
    // this will be inserted by compiler if neither this(...) nor super(...) is coded
//    System.out.println("Hello??"); preview in Java 22, can put code here, but not refer to "this"
    super();
    // when returning from super(...) RUN INSTANCE INITIALIZATION
    System.out.println("I'm in Parent()... x is " + x);
  }

  Parent(int x) {
    this();
    // NOT doing instance init here
    System.out.println("in Parent(int)");
  }
}
class Child extends Parent {
  int myValue = -1;
  // default constructor if, but only if, zero "coded" constructors
  /*
  access same as class
  Child() {
  super();
  // instance initialization
  }
   */
  Child() {
    super(1);
    // Child instance init
    System.out.println("back in child constructor");
  }
  @Override
  int getXValue(Child this) {
    System.out.println("in overridden getXValue()");
    return myValue;
//    return -1;
  }
}

public class InstanceInitEx {
  public static void main(String[] args) {
    new Child();
  }
}
