package immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Thing {
  private final int x;
  private final List<String> names;

  public Thing(int x, List<String> names) { // might this list be mutable??
    this.x = x;
    this.names = names;
//    this.names = List.copyOf(names);
  }

  public int getX() {
    return this.x;
  }

  public List<String> getNames() {
    return List.copyOf(names);
  }

  @Override
  public String toString() {
    return "Thing{" +
        "x=" + x +
        ", names=" + names +
        '}';
  }
}

//class BadThing extends Thing {
//  private int x;
//  public BadThing(int x) {
//    super(x);
//    this.x = x;
//  }
//  public int getX() {
//    return this.x;
//  }
//  public void setX(int x) {
//    this.x = x;
//  }
//}

class UseIt {
  public static void main(String[] args) {
//    Thing t = new Thing(99, Arrays.asList("Fred", "Jim", "Sheila"));
//    Thing t = new Thing(99, List.of("Fred", "Jim", "Sheila"));
    List<String> names = new ArrayList<>(List.of("Fred", "Jim", "Sheila"));
    Thing t = new Thing(99, names);
    System.out.println("thing is " + t);
    names.add("Freddie");
    System.out.println("thing is " + t);
    t.getNames().set(0, "Algernon");
    System.out.println("thing is " + t);
//    Thing t = new BadThing(99);
//    System.out.println(t.getX());
//    ((BadThing)t).setX(100);
//    System.out.println(t.getX());

  }
}