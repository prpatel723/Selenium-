package module1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatinpractice {

	public static void main(String[] args) throws InterruptedException{
		
		//Open Bowser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Installation stuff\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//Open AUT
		driver.get("http://automationpractice.com/index.php");
		
		//Using linkText
		driver.findElement(By.linkText("Sign in")).click();
		
		//Using name
		driver.findElement(By.name("search_query")).sendKeys("top");
		
		//Using id
		driver.findElement(By.id("email")).sendKeys("Priya");
		
		//Using Partial link text
		driver.findElement(By.partialLinkText("your pass")).click();
		
		//Using css
		driver.findElement(By.cssSelector("input#search_query")).sendKeys("Tops");
		
		//Using Tag name
		driver.findElement(By.tagName("input"));
		List<WebElement> list = driver.findElements(By.tagName("input"));
		System.out.println(list.size());
		
		//Using Xpath
		driver.findElement(By.xpath("//img[@id=\"header_logo\"]")).click();

	}

}
