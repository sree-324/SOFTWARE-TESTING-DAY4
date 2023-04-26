package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opengoogle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	}

}