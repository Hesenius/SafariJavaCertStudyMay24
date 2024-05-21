package enums;

enum Suit {
  HEARTS("coeur") /*{
    boolean isTrumps() {
      return true;
    }
  }*/,
  DIAMONDS, CLUBS, SPADES;
  int count;
  static int instanceCount;

  boolean isTrumps() {
    count++;
    return false;
//    return this == HEARTS;
  }
  static void sayHello() {
    instanceCount++;
    System.out.println("Hello!");
  }

  private Suit() {
    System.out.println("Running constructor");
  }

  /*public*/ Suit(String name) {
    System.out.println("Running constructor with name");
  }
}

public class Ex1 {
  public static void main(String[] args) {
    Class<?> cl = Suit.class;
    int mods = cl.getModifiers();
    System.out.println(Integer.toBinaryString(mods));
    System.out.println(Suit.HEARTS);

//    Suit.HEARTS.
  }
}
