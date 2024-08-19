package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_linktext {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(0);
	    //WebElement lnk=driver.findElement(By.linkText("Gmail"));
	    WebElement lnk=driver.findElement(By.partialLinkText("Gma"));
	    lnk.click();

	}

}
