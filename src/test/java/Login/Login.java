package Login;

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

public class Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://saucedemo.com/");
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Page is correct");
		}else {
			System.out.println("Incorrect Page");
		}
		String expectedUrl="https://www.saucedemo.com/";
		String actualUrl=driver.getCurrentUrl();
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Correct url");
		}
		else {
			System.out.println("Incorrect url");
		}
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("user-name"));

		ele.sendKeys("standard_user");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));

		ele1.sendKeys("secret_sauce");
		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();

		Thread.sleep(2000);
		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().forward();

		Thread.sleep(2000);

		driver.navigate().refresh();

		Thread.sleep(2000);
		TakesScreenshot sc = ((TakesScreenshot) driver);

		File src = sc.getScreenshotAs(OutputType.FILE);
		File f2 = new File("D:\\screenshotys\\image.png");
		FileUtils.copyFile(src, f2);
		driver.close();
	}

}
