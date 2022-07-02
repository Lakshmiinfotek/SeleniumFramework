package Selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automate_Rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		  Actions action = new Actions(driver);
		   WebElement button= driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		   //located the button element by locator xpath.
		   action.contextClick(button).build().perform();//we ae performing rightclik means contextclick on button
		   // and build and perform.
		  

	}

	
		
	


	}


