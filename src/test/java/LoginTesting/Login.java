package LoginTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@Test(priority = 1)
	public void veryUrl() {
		String expectedUrl = "https://www.saucedemo.com/";
		String actualUrl = driver.getCurrentUrl();
		assertEquals(expectedUrl, actualUrl);
		assertTrue(true);
	}

	@Test(priority = 2)
	public void verifyTitle() {
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
		assertTrue(true);

	}

	@Test(priority = 3)
	public void Login1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
	}

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
