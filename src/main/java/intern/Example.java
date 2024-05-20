package intern;

public class Example {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello"; // could be separately compiled
    System.out.println("s1 == s2 " + (s1 == s2));
    String s3 = "He" + "llo"; // "constant expression"
    System.out.println("s1 == s3 " + (s1 == s3));

    String part1 = "He";
    String part2 = "llo";
    String s4 = part1 + part2;
    System.out.println("s1 == s4 " + (s1 == s4));

    String s5 = s4.intern();
    System.out.println("s1 == s5 " + (s1 == s5));

    final String part1a = "He";
    final String part2a = "llo";
    String s4a = part1a + part2a;
    System.out.println("s1 == s4a " + (s1 == s4a));
//    s4a = "other";

    String s6 = "Oddball";
    String s7 = s6.intern();

    // turns out to be added by reference
    System.out.println("s6 == s7 " + (s6 == s7));
  }
}
