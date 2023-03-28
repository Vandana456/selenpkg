package selenPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Searchcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of WebDriver to perform google search through chrome web browser. 
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				// 2. Initialize WebDriver object through ChromeDriver class.
				ChromeDriver browserObject = new ChromeDriver();
				// 3. Open the web page www.google.com
				browserObject.get("https://www.google.com/");
				
				// 4. Locate the search bar element and send values using sendkeys
				browserObject.findElement(By.name("q")).sendKeys("Selenium python");
				// 5. Locate the search button and perform click
				browserObject.findElement(By.name("btnK")).submit();
				
	}

}