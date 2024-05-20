package switches;

import java.time.LocalDate;

public class Ex2 {
  public static void main(String[] args) {
    short s = 8;
//    System.out.println(switch (s) { // line n1
//      // line n2
//      default : yield "It's something else"; // line n3
//    });
    System.out.println(switch (s) { // line n1
      // line n2
      case 2, 4, 6, 8 -> "it's less than ten";
      default -> {
        System.out.println("executing default");
        if (Math.random() > 0.5) {
          yield "It's something else";
//          return; // NONONO! breaks the expression without an exception
        } else {
          yield "hahahaa!";
        }
//        } else throw new IllegalArgumentException();
      } // line n3
    });

    // context sensitive special identifier
//    var var = "var";
//    int var = 22;
//    int yield;
//    Thread.yield();

    var oddball = switch(s) {
      case 1, 2, 3 -> "Hello";
      case 4, 5, 6 -> 99;
      default -> LocalDate.now();
    };

  }
}
