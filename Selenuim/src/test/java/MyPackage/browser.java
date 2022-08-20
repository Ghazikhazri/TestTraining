package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {

        public static void main(String[] args) {
        	
        	//**************************  Classic approche  *****************************//
        	
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
  //        WebDriverManager.chromedriver().setup();
 //         WebDriver driver = new ChromeDriver(); // Parent p=new Child (Webdriver is Parent & ChromeDriver is Child)       
        	
            //Maximize current window
 //           driver.manage().window().maximize();  
            
 //         driver.get("https://demo.nopcommerce.com/"); // opening url
//          System.out.println("the title of web page is:" +driver.getTitle());
//          System.out.println("the url of web page is:" +driver.getCurrentUrl());
//          driver.quit(); //closing url
        	
        	
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
          
          
          //navigate back , refresh , forward command
          
//            WebDriverManager.chromedriver().setup();
//            WebDriver driver = new ChromeDriver();       
          	
              //Maximize current window
//              driver.manage().window().maximize();  
//              
//            driver.get("https://demo.nopcommerce.com/"); 
            //driver.get("https://www.amazon.com/"); 
//            driver.navigate().to("https://www.amazon.com/");
//            
//            driver.navigate().back(); //nopcommerce
//            driver.navigate().forward(); // amazon
//            driver.navigate().refresh();//refresh the page 
          
//           *** //findElement() --> Return the single WSebElelment ****
//            //Scenario 1:
//              WebElement searchbox =driver.findElement(By.xpath("//*[@id=\'small-searchterms\']"));     
//              searchbox.sendKeys("XYZ");
//              
//            //Scenario 2:
//              WebElement ele =driver.findElement(By.xpath("//*[@class='footer-upper']//a"));
//              System.out.println(ele.getText());  
              
//              //Scenario 3:
//              WebElement searchbutton =driver.findElement(By.xpath("//button[normalize-space()=\"login\"]"));
//              System.out.println("then button is select:" +searchbutton.isEnabled());
        	
              
//              *** //findElements() --> Return multiple WSebElelment ****
            //Scenario 1:
//             List<WebElement> Links =driver.findElements(By.xpath("//*[@class='footer-upper']//a"));
//             System.out.println("Numberof elements captured:" +Links.size()); 
//             
//             for ( WebElement ele:Links)
//             {
//            	 System.out.println(ele.getText());
//             }
//             
             //Scenario 2:
//             List<WebElement> Logo =driver.findElements(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
//             System.out.println("Numberof elements captured:" +Logo.size());  
            
          //Scenario 2:
//         List<WebElement> elements =driver.findElements(By.xpath("//img[contains(@title,'Emmmctronics')]"));
//         System.out.println("Numberof elements captured:" +elements.size()); 
        	

        	udemyy m = new udemyy();
        	System.out.println(m.validateheader());
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
   }
}
