package serialization;

import java.io.*;

class Thing{}

class Name implements Serializable { // line n1
  protected String first, last; // line n2
  private transient Thing t = new Thing();
  // line n3
//  public Name() {
//    System.out.println("Zero Arg constructor");
//  }

  public Name(String first, String last) {
    this.first = first;
    this.last = last;
  }

  public String toString() {
    return "[first=" + first + ", last=" + last + "]";
  }
}

class Person extends Name implements Serializable {
//  private static final long serialVersionUID = 1;
  private String address;

  public Person(String fName, String lName, String address) {
    super(fName, lName);
    System.out.println("Person constructor");
    this.address = address;
  }

  public String toString() {
    return "Person{" + "name=" + first + ", " + last + ", address=" + address + '}';
  }
}

public class Example {
  public static void main(String[] args) throws Throwable {
    ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
    ObjectOutputStream oos = new ObjectOutputStream(baos);
    Person p = new Person("Algernon", "Montgomery", "In the hangar");
    oos.writeObject(p);
    System.out.println("Write completed");
    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);
    Object obj = ois.readObject();
    System.out.println(obj);
  }
}
