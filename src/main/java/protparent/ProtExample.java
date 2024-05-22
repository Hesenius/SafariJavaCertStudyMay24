package protparent;

import protparent.protsub.Stuff;

class Sub extends Stuff {
  public void showX(Sub this) {
//    Stuff another = new Sub();
    Stuff another = new Stuff();
    System.out.println("this.x is " + this.x);
//    System.out.println("another.x is " + another.x);
  }
}

public class ProtExample {
}
