package blazedemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		WebElement web=driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		Thread.sleep(2000);
		Select drpValue=new Select(web);
		drpValue.selectByValue("Boston");
		Thread.sleep(2000);
		WebElement web1=driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		Thread.sleep(2000);
		Select drpValue1=new Select(web1);
		drpValue1.selectByValue("London");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("inputName"));
		ele.sendKeys("Piyush");
		Thread.sleep(2000);
		
		WebElement ele1 =  driver.findElement(By.id("address"));
		ele1.sendKeys("Noida");
		Thread.sleep(2000);
		
		WebElement ele2 =  driver.findElement(By.id("city"));
		ele2.sendKeys("Indirapuram");
		Thread.sleep(2000);
		
		WebElement ele3 =  driver.findElement(By.id("state"));
		ele3.sendKeys("UP");
		Thread.sleep(2000);
		
		WebElement ele4 =  driver.findElement(By.id("zipCode"));
		ele4.sendKeys("201014");
		Thread.sleep(2000);
		
		WebElement ele5 =  driver.findElement(By.id("cardType"));
		Select drpValue4=new Select(ele5);
		drpValue4.selectByValue("visa");
		Thread.sleep(2000);
		
		WebElement ele6 =  driver.findElement(By.id("creditCardNumber"));
		ele6.sendKeys("2002228888");
		Thread.sleep(2000);
		
		WebElement ele7 =  driver.findElement(By.id("creditCardMonth"));
		ele7.clear();
		ele7.sendKeys("3");
		Thread.sleep(2000);
		
		WebElement ele8 =  driver.findElement(By.id("creditCardYear"));
		ele8.clear();
		ele8.sendKeys("2023");
		Thread.sleep(2000);
		
		WebElement ele9 =  driver.findElement(By.id("nameOnCard"));
		ele9.sendKeys("Noida");
		Thread.sleep(2000);
		
		driver.findElement(By.id("rememberMe")).click();
		 
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(2000);
		
		TakesScreenshot sc1 = ((TakesScreenshot) driver);
		File src = sc1.getScreenshotAs(OutputType.FILE);
		File f2 = new File("D:\\screenshotys\\image1.png");
		FileUtils.copyFile(src, f2);
		driver.close();
		
		
		
		
		
		
		
	}
	

}
