package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_linktext {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=login");
		Thread.sleep(0);
	    WebElement lnk=driver.findElement(By.linkText("Customer Service"));
	    //WebElement lnk=driver.findElement(By.partialLinkText("Gma"));
	    lnk.click();

	}

}
