package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC_reg 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mybusiness.digital.hdfcbank.com/register");
		Thread.sleep(1000);
	    WebElement mail=driver.findElement(By.xpath("//input[@id='registeration_email']"));
	    mail.sendKeys("dgshfjjh@gmail.com");
	    WebElement mbl=driver.findElement(By.xpath("//input[@id='registeration_mobile_no']"));
	    mbl.sendKeys("34245566");
	    WebElement uid=driver.findElement(By.xpath("//input[@id='registeration_userid']"));
	    uid.sendKeys("567364");
	    WebElement pwd=driver.findElement(By.xpath("//input[@id='registeration_new_password']"));
	    pwd.sendKeys("hdfhdfgh");
	    WebElement rpwd=driver.findElement(By.xpath("//input[@id='registeration_confirm_password']"));
	    rpwd.sendKeys("hdfhdfgh");
	    Thread.sleep(1000);
	    WebElement checkbox1=driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1])"));
	    checkbox1.click();
	    Thread.sleep(1000);
	    WebElement checkbox2=driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2])"));
	    checkbox2.click();
	    Thread.sleep(1000);
	    WebElement signup=driver.findElement(By.xpath("//button[@id='create_account_button']"));
	    signup.click();
	    

	}

}
