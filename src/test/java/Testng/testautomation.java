package Testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testautomation {
	WebDriver driver;

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Executing before the method");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("Executing before the class");
	}

	@BeforeTest
	public void beforesetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	}

	@Test(priority = 1)
	public void textareapractise() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("Piyush");
		Thread.sleep(2000);
		driver.findElement(By.id("phone")).sendKeys("84123657");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("piyush@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("piyush");
		Thread.sleep(2000);
		driver.findElement(By.id("address")).sendKeys("Yamunanagar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public void checkradio() throws InterruptedException {
		driver.findElement(By.id("male")).click();
		Thread.sleep(2000);
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@type='checkbox'  and contains(@id ,'day')]"));
		System.out.println(checkboxes.size());
		for (WebElement box : checkboxes) {

			String chkn = box.getAttribute("id");
			System.out.println(chkn);

			if (chkn.equals("tuesday") || chkn.equals("friday")) {
				box.click();
			}
		}
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public void dropdown() throws InterruptedException {
		WebElement ele6 = driver.findElement(By.className("custom-select"));
		Select drpValue5 = new Select(ele6);
		drpValue5.selectByValue("1");
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void checkradio2() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[2]/label")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[1]/label")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 5)
	public void fileupload() throws InterruptedException {
		driver.findElement(By.id("inputGroupFile02"))
				.sendKeys("C:\\Users\\hp\\OneDrive\\Pictures\\Screenshots\\dem_defect2.png");
		Thread.sleep(2000);
		driver.close();
	}

	@AfterTest
	public void teardown() throws InterruptedException {

		Thread.sleep(3000);
	}

	@AfterClass
	public void afterclass() {
		System.out.println("Executing after the class");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("Executing after the method");
	}
}
