package Selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automate_Mouseover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 //system is a class
		 //set property is a method 
		 //chromeDriver path is located in program files. 
		 
		  ChromeDriver driver = new ChromeDriver();
		  //chrome driver is an interface and driver or variable or object is one of the interface and creating new chromedriver
		 
driver.get("https://www.costco.com");  //we are trying to get the costcosite
driver.manage().window().maximize();//we are trying to maximize the costco window
Actions act = new Actions(driver);//Act is a class

WebElement sigin =  driver.findElement (By.id("header_sign_in"));//Find the signin element by id locator
Thread.sleep(2000);


act.moveToElement(sigin).click().build().perform();// here act is a class ,moveToElement is a method and (Element)is signin button and we are building and performing action


//driver.close();
// we are trying to close

	}

}
