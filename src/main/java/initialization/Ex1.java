package initialization;

class Thing {
  static void sayHello() {
    System.out.println("Hello, I'm Thing");
  }
  static {
    System.out.println("Running static initialization of Thing");
  }

  public static void main(String[] args) {
    System.out.println("main in Thing...");
  }
}

public class Ex1 {
  public static void main(String[] args) {
    Thing t;
    System.out.println("var declared");
    Class<?> cl = Thing.class;
    System.out.println("class loaded");
    Thing.sayHello();
  }
}

class MyEnum {
  private static final MyEnum MY_ENUM_FIELD1 = new MyEnum();
  private static final MyEnum MY_ENUM_FIELD2 = new MyEnum();
  private static final MyEnum MY_ENUM_FIELD3 = new MyEnum();
  static {
    System.out.println("Guess what!!!");
  }
}