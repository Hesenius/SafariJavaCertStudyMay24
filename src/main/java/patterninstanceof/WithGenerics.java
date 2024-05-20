package patterninstanceof;

import java.util.Collection;
import java.util.List;

public class WithGenerics {
  public static void main(String[] args) {
    Iterable<String> is = List.of("a", "b", "c");
    Object obj = is;

// These cannot work, no information to test the generic type
//    System.out.println(obj instanceof List<String> ls);
//    System.out.println(obj instanceof List<String>);

//    if (is instanceof List<?> cs) { // allowed, but unhelpful!!
    if (is instanceof List<String> cs) { // more helpful
      cs.add("d"); // yes, is is IMMUTABLE in this case :)
      String x = cs.get(1);
    }
  }
}
