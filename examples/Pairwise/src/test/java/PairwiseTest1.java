import static tea.TeaAssert.assertEquals;
import org.junit.jupiter.api.Test;

public class PairwiseTest1 extends tea.TeaBase {
  @Test
  public void test() {
    createDriver("chrome");
    driver.get(new java.io.File("../Wizard/Page1.html").toURI().toString());

    element("Name").shift(1).setValue("John");
currentElement().setValue("john@email");
currentElement().setValue("New York");
currentElement().setValue(true);

    assertEquals(element("NAME").shiftName("@").shift(1).build(), toActualValue("John"), "Name entered");
    assertEquals(element("EMAIL").shiftName("@").shift(1).build(), toActualValue("john@email"), "Email entered");
    assertEquals(element("PLACE").shiftName("@").shift(1).build(), "New York", "Place selected");

    driver.quit();
  }

  private String toActualValue(String value) {
    return value.length() > 0 ? value : "No Value";
  }
}
