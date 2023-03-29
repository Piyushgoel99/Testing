package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload {

	WebDriver driver;

	@BeforeTest
	public void beforesetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
	}

	@Test(priority = 1)
	public void fileupload() throws InterruptedException {
		driver.findElement(By.id("file-upload"))
				.sendKeys("C:\\Users\\hp\\OneDrive\\Pictures\\Screenshots\\dem_defect2.png");
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void submit() throws InterruptedException {
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2000);
	}

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}
