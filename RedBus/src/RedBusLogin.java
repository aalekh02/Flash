import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBusLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();

		Wait(5);

		// Closing PopUp
		driver.findElement(By.className("modalCloseSmall")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		driver.navigate().refresh();

		// Selecting From Journey
		driver.findElement(By.id("txtSource")).clear();
		driver.findElement(By.id("txtSource")).sendKeys("Pune");
		Wait(2);
		driver.findElement(By.id("txtSource")).sendKeys(Keys.TAB);

		// Selecting To Journey
		driver.findElement(By.id("txtDestination")).clear();
		driver.findElement(By.id("txtDestination")).sendKeys("Akola");
		Wait(2);
		driver.findElement(By.id("txtDestination")).sendKeys(Keys.TAB);

		// Selecting Date of Journey
		driver.findElement(By.id("txtOnwardCalendar")).click();

		List<WebElement> element = driver.findElements(By.xpath("//table[@class='monthTable first']//td"));
		for (WebElement elem : element) {
			String date = elem.getText();
			// System.out.println(date);
			if (date.equalsIgnoreCase("30")) {
				elem.click();
				break;

			}

		}

		// Selecting Date of Return
		driver.findElement(By.id("txtReturnCalendar")).click();
		// driver.findElement(By.xpath(".//*[@id='rbcal_txtReturnCalendar']/table[2]/tbody/tr[1]/td[3]/button")).click();

		List<WebElement> element1 = driver.findElements(By.xpath("//table[@class='monthTable last']//td"));
		for (WebElement elem : element1) {
			String date = elem.getText();
			// System.out.println(date);
			if (date.equalsIgnoreCase("25")) {
				elem.click();
				break;

			}

		}

		driver.findElement(By.id("searchBtn")).click();
		String text = driver.findElement(By.cssSelector(".opf-block > *:first-child")).getText();
		System.out.println(text);
		if (text.equals("4 Bus Offers available in this route")) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}
	}

	private static int Wait(int sec) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return sec;
	}

}
