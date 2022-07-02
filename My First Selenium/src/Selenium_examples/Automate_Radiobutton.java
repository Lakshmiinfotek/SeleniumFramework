package Selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		
	    driver.get("http://training.qaonlinetraining.com/testPage.php");// trying to open the site.
	    driver.findElement(By.name("name")).sendKeys("Apple");// trying to login by using name locator and sending username
		  
		  driver.findElement(By.name("email")).sendKeys("apple@yahoo.com");// try to login by name locator to password and sending value.
		  // Thread.sleep(10000);
		 WebElement Radiobuttonfemale = driver.findElement(By.xpath("//input[@value='female']"));
		 Radiobuttonfemale.click();
		  // get the site.
		 
		  //driver.findElement(By.xpath("//input[@value='male']")).click();//Radio button checking
		


	}

}
