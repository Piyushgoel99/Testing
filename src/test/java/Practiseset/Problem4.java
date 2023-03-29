package Practiseset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Problem4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(" https://itera-qa.azurewebsites.net/home/automation");
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[2]/label")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[1]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[3]/label")).click();
		Thread.sleep(2000);
		
		driver.close();

	}

}
