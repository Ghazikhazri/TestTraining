package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {

        public static void main(String[] args) {
        	
        	//**************************Classic approche *****************************//
        	
        	//chrome browser
//           System.setProperty("webdriver.chrome.driver","C:\\Users\\ghazi\\Desktop\\selenium4-training\\chromedriver.exe");
//           WebDriver driver = new ChromeDriver(); // Parent p=new Child (Webdriver is Parent & ChromeDriver is Child)
//           driver.get("https://demo.nopcommerce.com/"); // opening url
//           System.out.println(driver.getTitle());
//           driver.quit(); //closing url
       
        
//    	//Firefox browser
//    	System.setProperty("webdriver.gecko.driver","C:\\Users\\ghazi\\Desktop\\selenium4-training\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver(); // Parent p=new Child (Webdriver is Parent & ChromeDriver is Child)
//        driver.get("https://demo.nopcommerce.com/"); // opening url
//        System.out.println(driver.getTitle());
//        driver.quit(); //closing url
        	
  //-----------------------------------------------------------------------------------------------------------------------------------//      	
        	
        	//************************using webdriver manager *****************************//
        	         //(we don't need to download and specify the driver path //
        	
        	
        	//chrome browser
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver(); // Parent p=new Child (Webdriver is Parent & ChromeDriver is Child)       
        	
            //Maximize current window
            driver.manage().window().maximize();  
            
          driver.get("https://demo.nopcommerce.com/"); // opening url
          System.out.println("the title of web page is:" +driver.getTitle());
          System.out.println("the url of web page is:" +driver.getCurrentUrl());
          driver.quit(); //closing url
        	
        	
//        	//Firefox browser
//        	  WebDriverManager.firefoxdriver().setup();
//            WebDriver driver = new FirefoxDriver(); // Parent p=new Child (Webdriver is Parent & ChromeDriver is Child)
//            
//            //Maximize current window
//            driver.manage().window().maximize();
//            
//            driver.get("https://demo.nopcommerce.com/"); // opening url                     
//            System.out.println("the title of web page is:" +driver.getTitle());
//            System.out.println("the url of web page is:" +driver.getCurrentUrl());
//            driver.quit(); //closing url
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
   }
}
