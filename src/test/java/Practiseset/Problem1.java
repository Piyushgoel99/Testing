package Practiseset;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Problem1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		WebElement ele = driver.findElement(By.id("name"));
		ele.sendKeys("Piyush");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("phone"));
		ele1.sendKeys("7027274408");
		Thread.sleep(2000);

		WebElement el2 = driver.findElement(By.id("email"));
		el2.sendKeys("piyush19@gmail.com");
		Thread.sleep(2000);

		WebElement el3 = driver.findElement(By.id("password"));
		el3.sendKeys("123456");
		Thread.sleep(2000);

		WebElement el4 = driver.findElement(By.id("address"));
		el4.sendKeys("Yamunanagar");
		Thread.sleep(2000);

		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		driver.close();

	

	}

}
