package Practiseset;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Problem2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(" https://itera-qa.azurewebsites.net/home/automation");
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
		driver.close();

		
	}
}
