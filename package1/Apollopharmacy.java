package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apollopharmacy {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement search=driver.findElement(By.xpath("//div[@class='SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq']"));
		search.click();
		WebElement search1=driver.findElement(By.xpath("//input[@id='searchProduct']"));
		search1.sendKeys("Dolo-500 Tablet");
		Thread.sleep(1000);
		search1.sendKeys(Keys.ENTER);

	}

}
