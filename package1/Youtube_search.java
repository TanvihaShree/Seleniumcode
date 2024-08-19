package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_search 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
	Thread.sleep(1000);
	search.sendKeys("Grotechminds");
	search.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	WebElement subscribe=driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[24]"));
	Thread.sleep(1000);
	subscribe.click();

}
}
