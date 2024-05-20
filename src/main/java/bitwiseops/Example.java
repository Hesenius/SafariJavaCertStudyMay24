package bitwiseops;

public class Example {
  public static void main(String[] args) {
    int x = -1;
    int y = 0b0000_0000_0000_1010; // line n1
    System.out.println(x | y); // line n2
    System.out.println(x & y);
  }
}
