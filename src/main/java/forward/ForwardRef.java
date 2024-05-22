package forward;

import java.lang.reflect.Parameter;

public class ForwardRef {

  public int getX(ForwardRef this) {
    int y;

    if (Math.random() > -1) {
      y = 10;
    } else {
      y = 9;
    }
    System.out.println(y);

    switch (y) {
      case 1:
        int bad = 100;
        System.out.println(bad);
      default:
        bad = 200;
        System.out.println("bad is in scope!! " + bad);
    }
    return this.x;
  }

  private int x;
}
