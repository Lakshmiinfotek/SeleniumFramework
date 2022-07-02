package Selenium_examples;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 //system is a class
		 //set property is a method 
		 //chromeDriver path is located in program files. 
		 
		  ChromeDriver driver = new ChromeDriver();
		  //chrome driver is an interface and driver or variable or object is one of the interface and creating new chromedriver
		 
		  driver.get("https://gmail.com/");
		  //we are trying to get the object
		  //driver.close();
		  // we are trying to close


	}

}
