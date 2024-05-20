package textblocks;

public class Ex1 {
  public static void main(String[] args) {
    String message = """
        Hello \n hello again     
            ""\"""\"Java 17 World!     """;
    System.out.println(message + "XXX");
  }
}
