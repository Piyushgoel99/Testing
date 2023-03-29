package practiseSet2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoblaze {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("cartur")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement ele = driver.findElement(By.id("name"));
		ele.sendKeys("Piyush");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("country"));
		ele1.sendKeys("India");
		Thread.sleep(2000);

		WebElement ele2 = driver.findElement(By.id("city"));
		ele2.sendKeys("Yamunanagar");
		Thread.sleep(2000);

		WebElement ele3 = driver.findElement(By.id("card"));
		ele3.sendKeys("Visa");
		Thread.sleep(2000);

		WebElement ele4 = driver.findElement(By.id("month"));
		ele4.sendKeys("March");
		Thread.sleep(2000);

		WebElement ele5 = driver.findElement(By.id("year"));
		ele5.sendKeys("2023");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);

		TakesScreenshot sc = ((TakesScreenshot) driver);
		File src = sc.getScreenshotAs(OutputType.FILE);
		File f2 = new File("D:\\images\\store.png");
		FileUtils.copyFile(src, f2);
		driver.close();

	}

}
