import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserXpath {
//by browser given xpath
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  try {
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\snata\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.get("https://login.salesforce.com/?locale=in");
	      Thread.sleep(3000);
	      //driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("mama");
	      driver.findElement(By.xpath("//*[@id='username']")).sendKeys("mama");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("darling");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	      Thread.sleep(10000);
	      driver.close(); 
	  } catch(Exception ex) {
		  
	  }
	  
      
      
      
      
	}

}
