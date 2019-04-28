import tea.util.TeaUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class CustomEventListener extends AbstractWebDriverEventListener {
  private int index = 0;

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		TeaUtil.takeScreenshot(driver, "screenshot"+(++index)+".png");
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		TeaUtil.takeScreenshot(driver, "screenshot"+(++index)+".png");
	}
}
