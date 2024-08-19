package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_createAccnt {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement link=driver.findElement(By.linkText("Create new account"));
		link.click();
		Thread.sleep(1000);
	    WebElement fn=driver.findElement(By.xpath("//input[@name='firstname']"));
	    fn.sendKeys("Bhavani");
	    WebElement ln=driver.findElement(By.xpath("//input[@name='lastname']"));
	    ln.sendKeys("Ramappa");
	    WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	    email.sendKeys("rbhvani432@gmail.com");
	    WebElement pwd=driver.findElement(By.xpath("//input[@id='password_step_input']"));
	    pwd.sendKeys("rbhvani432@gmail.com");
	    
	    
	    

	}

}
