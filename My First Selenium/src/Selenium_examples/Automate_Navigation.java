package Selenium_examples;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();//system is class and setproperty is method and passing path
		  //creating a new object called driver.
		  
	 driver.get("https://www.costco.com");// get the site.
		
	driver.navigate().to("https://training.qaonlinetraining.com");//thismethod is navigting from costco to trainingportal
	  Thread.sleep(2000);// sleep time 2000 milli sec	  
		   
	 driver.navigate().to("https://www.itlearn360.com/");// using navigate  method to switch windows from training 
			//portal to itlearn360.com
	driver.navigate().refresh();//using navigate refesh method to refresh the page 
	driver.get("http://www.yahoo.com");//Get the yahoo
	driver.navigate().to("http://www.gmail.com");//From yahoo to navigate gmail
	driver.navigate().back();//back from gmail to yahoo
	driver.navigate().forward();//from yahoo to gmail
	
	//finally we are in gmail page.
	
	
			
			
		
		


	}

}
