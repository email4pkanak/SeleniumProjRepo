package d;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class First {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.navigate().to("http://www.ebay.com");
		
		driver.findElement(By.id("gh-ac")).sendKeys("JBL Speakers");
		driver.findElement(By.id("gh-btn")).click();
		driver.findElement(By.cssSelector("#gh-p-1 > a")).click();
		System.out.println("The title of the page is: " +driver.getTitle());
		driver.close();
	}

}
