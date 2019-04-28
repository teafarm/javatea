import static tea.TeaAssert.*;
import static tea.Assert.*;
import org.junit.jupiter.api.Test;

public class PropertiesTest extends tea.TeaBase {
  @Test
  public void test1() {
    createDriver("chrome");
    driver.get(new java.io.File("../Wizard/Page1.html").toURI().toString());

    setPropertiesFile("labels");
    element("{name}").shift(1).setValue("{entry name}");
currentElement().setValue("{entry email}");
currentElement().setValue("New York");
currentElement().setValue(true);
    assertEquals(element("Name").shift(1).build(), "John Smith", "Name on Page 1");
    assertEquals(element("Email").shift(1).build(), "jsmith@email", "Email on Page 1");
//    driver.quit();
//  }

//  @Test
//  public void test2() {
//    createDriver('chrome');
    driver.get(new java.io.File("../Wizard/Page1.html").toURI().toString());

    setPropertiesFile("labels_ja_JP");
    element("{name}").shift(1).setValue("{entry name}");
currentElement().setValue("{entry email}");
currentElement().setValue("Japan");
currentElement().setValue(true);
    assertEquals(element("Name").shift(1).build(), "ジョン　スミス", "Japanese name on Page 1");
    assertEquals(element("Email").shift(1).build(), "ジェイスミス＠電子手紙", "Japanese email in Page 1");

    assertEquals(element("Name").shift(1).build(), $("{entry name}"), "Japanese name on Page 1");
    assertEquals(element("Email").shift(1).build(), $("{entry email}"), "Japanese email on Page 1");
    driver.quit();
  }
}
