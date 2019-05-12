package xpathOperators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Operators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Installation stuff\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("abc");
		
		driver.findElement(By.xpath("//*[@type='password' and @name='password']")).sendKeys("er");
		
		driver.findElement(By.xpath("//*[@type='image' or @name='login']")).click();
		driver.navigate().back();
		
		WebElement text = driver.findElement(By.xpath("//*[contains(text,'User')"));
		text.getText();
		System.out.println(text);
		
		

	}

}
