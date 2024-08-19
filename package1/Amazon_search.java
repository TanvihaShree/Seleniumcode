package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_search {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		//Thread.sleep(1000);
		driver.get("https://www.amazon.in/s?k=login");
		Thread.sleep(20000);
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@name='field-keywords']"));
		Thread.sleep(1000);
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement shoes=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		Thread.sleep(1000);
		shoes.click();

	}

}
