package day4;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		fname.sendKeys("ABISREE");
		WebElement lname=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		lname.sendKeys("D");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		email.sendKeys("sreearu@gmil.com");
		WebElement eemail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		eemail.sendKeys("dhana@gmil.com");
		WebElement button=driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
		button.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		Thread.sleep(3000);
		WebElement message=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
		message.sendKeys("Hi!!");
		WebElement amt=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
		amt.sendKeys("1");
		WebElement button1=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input"));
		button1.click();
		
		
		
	}

}