package usevar;

import java.io.Serializable;

public class Ex1 {
  public static long getX() { return 1L; }
  public static void showAll(int [] values) {
    for (var v : values) {
      System.out.println(v);
    }
  }

//  A) var [] x = { 1,2,3 };
//  B) var x = new int[]{ 1,2,3 };
//  C) var x = 10, y = 100;
//  D) var x = true ? "99" : 99;
//  E) var var = "var";

  public static void main(String[] args) {
//    int [] ia = new int[] {1, 2, 3};
//    Object[] ia = {1, 2, 3};
    int [] ia = {1, 2, 3};
    showAll(ia);
//    showAll({1, 2, 3}); // NOPE
    showAll(new int[]{1, 2, 3});

    for (int a, b, c=10, d; ;) {
      break;
    }
//    var [] x = { 1,2,3 }; //NOPE
//    var x = new int[]{ 1,2,3 }; // YES!!!
//    var x = getX();
//    var x = 10, y = 100; // NOPE
    /*Serializable & Comparable<?>*/ var x = true ? "99" : 99;

    "99".compareTo(null);
    Integer.valueOf(99).compareTo(null);
    x.compareTo(null);

    System.out.println(x);
//    throw new IllegalArgumentException();
//    System.out.println("Hello"); // would be "unreachable error"
    final boolean DEBUG = false;
    if (DEBUG) {
      System.out.println("message");
    }

//    Long num = 99; // autoboxing can turn int -> Integer, etc. BUT NOT do "wideneing promotion" at the same time
    Object num = 99; // this will be Integer...
    System.out.println("type of num is " + num.getClass().getName());
  }
}
