import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class forgotPassword {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//open the login page
		driver.get("https://console.tevi.co/login");
		
	
		//Forgot password link element
		
		WebElement forgotPasswordLink=driver.findElement(By.xpath("//a[contains(@href, '/forgotpass')]"));
		forgotPasswordLink.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement emailInput =driver.findElement(By.xpath("//input[@id=\"signinSrEmail\"]"));
		
		emailInput.sendKeys("tevicouser@gmail.com");
		WebElement submitButton =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
		submitButton.click();
		Thread.sleep(15000);
		driver.close();
		
		
	}
}
		


