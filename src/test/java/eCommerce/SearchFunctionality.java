package eCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFunctionality {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		 String urlPage=driver.getTitle();
		 System.out.println("Name of Website =" +urlPage);

				
       WebElement txt_search=driver.findElement(By.id("twotabsearchtextbox"));
          txt_search.sendKeys("iphone",Keys.ENTER);
        WebElement link_iphone= driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div/div[1]/div/span[3]/div[2]/div[4]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(link_iphone)).click();
         String name=driver.getTitle();
         System.out.println("Name of the Product =" +name);
         
      WebElement button_cart=driver.findElement(By.id("add-to-cart-button"));
          button_cart.click();
         String addedCart=driver.getTitle();
        
          System.out.println( "Name of selectedcart =" +addedCart);
          WebElement link_pricetag=driver.findElement(By.xpath("//*[@id=\'hlb-subcart\']/div[1]/span/span[2]"));
          String price=link_pricetag.getText();
          System.out.println("Price of the Product=" +price);
          
   
        }

}



