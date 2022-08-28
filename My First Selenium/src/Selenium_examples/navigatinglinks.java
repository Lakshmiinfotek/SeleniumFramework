package Selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatinglinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
	        WebDriver driver=new ChromeDriver();
		// 3. Open the web page https://www.itlearn360.com/
	        driver.get("https://www.itlearn360.com/");
		// 4. Locate facebook icons using className locator and perform click
	        driver.findElement(By.className("fa-facebook")).click();
	        Thread.sleep(1000);
		// 5. Navigate back on main page using navigate and back method 
	        driver.navigate().back();
		// 6. Locate twitter icons using className locator and perform click
	       driver.findElement(By.className("fa-twitter")).click();
	       Thread.sleep(1000);
		// 7. Navigate back on main page using navigate and back method
	        driver.navigate().back();
		// 8. Locate insta icons using className locator and perform click
	        driver.findElement(By.className("fa-instagram")).click();
		// 9. Navigate back on main page using navigate and back method
	        driver.navigate().back();
	       Thread.sleep(1000);
		// 10. Locate youtube icons using className locator and perform click
	        driver.findElement(By.className("fa-youtube")).click();
		// 11. Navigate back on main page using navigate and back method
	       driver.navigate().back();
	       Thread.sleep(1000);
		// 12. Locate linkedIn icons using className locator and perform click
	        driver.findElement(By.className("fa-linkedin")).click();
		// 13. Navigate back on main page using navigate and back method
	       driver.navigate().back();
	        // 14. Close the browser
	       driver.close();


	}

}
//In this code we are trying to perform navigation on different icons in webpage. 
//Steps to perform
//1. setup the property of WebDriver to perform navigate on icons through chrome web browser.
//2. Initialize WebDriver object through ChromeDriver class.
//3. Open the web page https://www.itlearn360.com/
//4. Locate facebook icons using className locator and perform click
//5. Navigate back on main page using navigate and back method 
//6. Locate twitter icons using className locator and perform click
//7. Navigate back on main page using navigate and back method
//8. Locate instagram icons using className locator and perform click
//9. Navigate back on main page using navigate and back method
//10. Locate youtube icons using className locator and perform click
//11. Navigate back on main page using navigate and back method
//12. Locate linkedIn icons using className locator and perform click
//13. Navigate back on main page using navigate and back method
//14. Close the browser