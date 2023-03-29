package Practiseset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Problem3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(" https://itera-qa.azurewebsites.net/home/automation");
		WebElement ele6 = driver.findElement(By.className("custom-select"));
		Select drpValue5 = new Select(ele6);
		drpValue5.selectByValue("1");
		Thread.sleep(2000);

		driver.close();

	}

}
