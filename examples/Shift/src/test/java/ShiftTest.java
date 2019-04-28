import static tea.TeaAssert.assertEquals;
import org.junit.jupiter.api.Test;
 
public class ShiftTest extends tea.TeaBase {
  @Override
  // Override built-in shift method. Operator > now shifts on BUTTON tags only.
  protected String shift(int n) {
    return "./" + (n < 0 ? "preceding" : "following") + "::button";
  }

  // Custom shift method that moves on INPUT tags.
  private String shiftinput(int n) {
    return "./" + (n < 0 ? "preceding" : "following") + "::input";
  }

  @Test
  public void test() {
    createDriver("chrome");
    driver.get(new java.io.File("../Wizard/Page1.html").toURI().toString());

    element("Name").shiftName("input").shift(1).setValue("John Smith");
element("Email").shiftName("input").shift(1).setValue("jsmith@email");
element("Name").shift(1).setValue(true);

    assertEquals(element("Name").shiftName("input").shift(1).build(), "John Smith", "Name on Page 1");
    assertEquals(element("Email").shiftName("input").shift(1).build(), "jsmith@email", "Email on Page 1");

    driver.quit();
  }
}
