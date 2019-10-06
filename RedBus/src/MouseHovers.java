import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHovers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.news.google.com");

		Actions actions = new Actions(driver);

		actions.moveToElement(driver.findElement(By.id("view-filter-select"))).perform();

		List<WebElement> points = driver.findElements(By.cssSelector("#view-filter-select"));
		for (WebElement elem : points) {
			String data = elem.getText();
			System.out.println(data);
			if (data.contains("H")) {
				elem.click();
				break;

			}
		}
		driver.findElement(By.id("")).getCssValue("Name of CSS Attribute");
		driver.findElement(By.id("")).getCssValue("font-size");
	}

}

// Testng along with webdriver provides an effective and excellent test report
// mechanism which in turn can be provided to the stakeholders to see the
// application/product overall health thus eliminating webdriver incapibility to
// generate test reports.Testng has an inbuilt exception handling mechanism which
// allows it to run the program without terminating unexceptedly.