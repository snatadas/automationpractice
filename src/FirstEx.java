import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstEx {

	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\snata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		/*	WebElement staticDropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drop=new Select(staticDropDown);
		drop.selectByIndex(4);
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByVisibleText("USD");
	    System.out.println(drop.getFirstSelectedOption().getText());*/
		driver.findElement(By.id("divpaxinfo")).click();
 WebElement	wb =driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
				Select drop1=new Select(wb);
		drop1.selectByIndex(3);
		Thread.sleep(3000);
		driver.close();
		}
		catch(Exception E) {
			
		}
	}
}

		

	
	

	

