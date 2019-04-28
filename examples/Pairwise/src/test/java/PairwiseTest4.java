import static tea.TeaAssert.assertEquals;
import org.junit.jupiter.api.Test;

public class PairwiseTest4 extends tea.TeaBase {
  @Test
  public void test() {
    createDriver("chrome");
    driver.get(new java.io.File("../Wizard/Page1.html").toURI().toString());

    element("Name").shift(1).setValue("John");
currentElement().setValue("");
currentElement().setValue("Japan");
currentElement().setValue(true);

    assertEquals(element("NAME").shiftName("@").shift(1).build(), toActualValue("John"), "Name entered");
    assertEquals(element("EMAIL").shiftName("@").shift(1).build(), toActualValue(""), "Email entered");
    assertEquals(element("PLACE").shiftName("@").shift(1).build(), "Japan", "Place selected");

    driver.quit();
  }

  private String toActualValue(String value) {
    return value.length() > 0 ? value : "No Value";
  }
}
