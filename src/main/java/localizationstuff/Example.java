package localizationstuff;

import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Example {
  public static void main(String[] args) {
    Locale.setDefault(Locale.GERMAN);
    ResourceBundle bundle = PropertyResourceBundle.getBundle(
        "localization.MyResources");
    System.out.println("Name is " + bundle.getString("name"));
  }
}
