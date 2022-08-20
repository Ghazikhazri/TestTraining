package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class udemyy {

        public  String validateheader() {
        	
        	//**************************  Classic approche  *****************************//
        	
        	//chrome browser
           System.setProperty("webdriver.chrome.driver","C:\\Users\\ghazi\\Desktop\\selenium4-training\\chromedriver.exe");
           WebDriver driver = new ChromeDriver(); // Parent p=new Child (Webdriver is Parent & ChromeDriver is Child)
           driver.get("https://www.google.com/"); // opening url
   		//Maximize current window
          driver.manage().window().maximize();  
		  System.out.println((driver.getTitle()));
		  System.out.println( driver.getCurrentUrl());
		  //System.out.println( driver.getPageSource());
		  

       // driver.get("https://www.amazon.com/"); 
          driver.navigate().to("https://www.amazon.com/");
//      
          driver.navigate().back(); //google
          driver.navigate().forward(); // amazon
          driver.navigate().refresh();//refresh the page
		  
		  
		  
		  driver.quit(); //closing all browsers opened with selenium
		  driver.close(); // close current browser
		  
        	return "true" ;
        }
}