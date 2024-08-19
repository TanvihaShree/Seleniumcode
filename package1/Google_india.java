package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_india {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		 WebElement s1=driver.findElement(By.name("q"));
		 Thread.sleep(1000);
		 s1.sendKeys("india");
		 s1.sendKeys(Keys.ENTER);

	}

}
