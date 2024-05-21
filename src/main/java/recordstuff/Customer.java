package recordstuff;

public class Customer {
  private final int count;

  public Customer() {
//    count = 99;
    this(99);
  }

  public Customer(int c) { // like the canonincal constructor... initializes final fields
    // this pair would be BAD
//    this();
//    count = c;
    count = c;
  }
}

// parent is java.lang.Record, but NO extends is permitted -- implicitly final
// intended to be "data carriers" -- immutable-ish therefore NO SUBTYPES
// ARE PERMITTED to implement interfaces
// canonical constrctor defaults to accessibility of the type, and CANNOT be less accessible
record Client(String name, int creditLimit) /*extends ???*/ {
  // Canonical constructor, created implicitly
  // but we are allowed to REPLACE it...
//  Client(String name, int creditLimit) { // these names MUST NOT be changed!
//    // validation?
//    // normalization?
//    if (name == null) throw new IllegalArgumentException("null name not permitted");
//    this.name = name;
//    this.creditLimit = creditLimit;
//  }

  // compact constructor -- essentially the PREFIX to the canonical constructor
  Client {/*
    if (name == null) throw new IllegalArgumentException("null name not permitted");
    creditLimit = (creditLimit / 1000) * 1000;*/
  }

  private Client(int creditInThousands) {
    this("Unknown", creditInThousands * 1000);
  }

  public static Client makeOne() {return null;}
}
