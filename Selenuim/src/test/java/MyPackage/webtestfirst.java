package MyPackage;

 
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class webtestfirst {
	
	public static void main (String [] args ) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		
		//isDisplayed   is Enabled
		
	    WebElement searchStore = driver.findElement(By.xpath("//*[@id='small-searchterms']"));
	    System.out.println("Display status is:"+searchStore.isDisplayed());  //true
	    System.out.println("Enabled status is:"+searchStore.isEnabled());  //true
	    
	    //isSelected 
	    driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	   //String XpathRegister = "//*[contains(@class,'ico-register')]";
	   WebElement male = driver.findElement(By.xpath("//*[@id='gender-male']"));
	   WebElement female = driver.findElement(By.xpath("//*[@id=\'gender-female\']"));
	   System.out.println("the  male element is selected:" +male.isSelected());       //false
	   System.out.println("the female element is selected:" +female.isSelected());    //false
	    
	   male.click(); // select the male button
	   
	   System.out.println("the  male element is selected:" +male.isSelected());       //True
	   System.out.println("the female element is selected:" +female.isSelected());    //false
	   female.click(); // select the female button
	   
	   System.out.println("the  male element is selected:" +male.isSelected());       //false
	   System.out.println("the female element is selected:" +female.isSelected());    //True
	   
	}
	
	
	
	
}