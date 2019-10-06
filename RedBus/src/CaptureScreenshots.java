import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshots {

	@Before

	public void setUp() throws Exception {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com");

	}

	@After

	public void tearDown() throws Exception {

		WebDriver driver = null;
		driver.quit();

	}

	@Test

	public void test() throws IOException {

		// Code to capture the screenshot

		TakesScreenshot driver = null;
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Code to copy the screenshot in the desired location
		FileUtils.copyFile(scrFile, new File("F:\\Selenium\\google.jpg"));
	}

}
