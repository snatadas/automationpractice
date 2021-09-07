import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffAutomation {
//xpath with regularexpression where attributes value keep on changing
	public static void main(String[] args) {
		try {
		System.setProperty ( "webdriver.chrome.driver","C:\\Users\\snata\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Thread.sleep(4000);
		driver.findElement(By.className("signin")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name=\"login\"]")).sendKeys("mama");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name=\"passwd\"]")).sendKeys("darling");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		Thread.sleep(4000);
		driver.close();
		
		// TODO Auto-generated method stub

		} catch(Exception e) { 
	      
		}
	}	
} 