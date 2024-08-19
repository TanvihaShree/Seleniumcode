package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_loginpage 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement un=driver.findElement(By.xpath("//input[@id='email']"));
		un.sendKeys("abhfdr@gmail.com");
		Thread.sleep(1000);
		WebElement pwd=driver.findElement(By.xpath("//input[@id='pass']"));
		pwd.sendKeys("Abc@123");
		Thread.sleep(1000);
		WebElement lgnbtn=driver.findElement(By.xpath("//button[@name='login']"));
		 lgnbtn.click();

	}

}
