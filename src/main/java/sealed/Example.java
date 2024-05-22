package sealed;

sealed interface Transporter permits Truck, Car, Bicycle, ThreeWheeler {}
final class Truck implements Transporter {
  private long payload;

  public Truck(long payload) {
    this.payload = payload;
  }

  public long getPayload() {
    return payload;
  }
}
//non-sealed class Car implements Transporter /*permits ThreeWheeler*/ {} // five seats
///*final*/ class ThreeWheeler extends Car {}

final class Car implements Transporter {} // five seats
enum ThreeWheeler implements Transporter {
  RELIANT_ROBIN, MESSERSCHMIDT {};
}

// records are implicitly final
/*final */record Bicycle() implements Transporter {}

public class Example {
  static boolean canCarry(Transporter t, long load) {
    if (t instanceof Truck tr) {
      return tr.getPayload() >= load;
    } else if (t instanceof Car c) {
      return load <= (4 * 170);
    } else if (t instanceof Bicycle b) {
      return load < 1;
    }
    return false;
  }

  public static void main(String[] args) {
//    Car c = new Car();
    Bicycle b = new Bicycle();
    System.out.println("I can carry your load? " + canCarry(b, 350));
  }
}
