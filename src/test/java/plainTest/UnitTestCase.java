package plainTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnitTestCase 
{
	public static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\March2022Project\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		//cancel first login window 
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions a=new Actions(driver);
//move to login 
		WebElement ab=driver.findElement(By.xpath("(//*[@class='_28p97w'])[1]"));
		a.moveToElement(ab).build().perform();
		

		//click to my profile 		
		driver.findElement(By.xpath("//*[@class='_3vhnxf']")).click();
//enter username		
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("9881891149");
//enter password		
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Reshma123");
 //click on login 
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		
	}

}
