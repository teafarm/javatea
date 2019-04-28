import org.junit.jupiter.api.Test;

public class GoogleSearchTest extends tea.TeaBase {
  @Test
  public void test() {
    createDriver("chrome");
    driver.get("http://www.google.com");
    element("name:q").setValue("Test Tool");
currentElement().setValue(true);
  }
}
