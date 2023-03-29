package demoblaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class index {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		driver= new ChromeDriver();
		
		driver.get("https://blazedemo.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")).click();
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
		driver.close();
	}

}