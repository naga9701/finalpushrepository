package package_Selenium_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Selenium {
static WebDriver driver;

public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("www.facebook.com");
		
	}
	
}
