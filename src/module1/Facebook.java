package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		//Open Bowser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Installation stuff\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://www.facebook.com/");
		
		/*//Using id
		driver.findElement(By.id("u_0_c")).sendKeys("Priya");
		driver.findElement(By.id("u_0_e")).sendKeys("Patel");
		driver.findElement(By.id("u_0_h")).sendKeys("7327072320");
		
		//Using Name
		driver.findElement(By.name("firstname"));
		*/
		//Using Class Name
		driver.findElement(By.className("inputtext")).sendKeys("Priya");
		driver.findElement(By.className("inputtext")).sendKeys("Patel");
		
		//Using Linktext
		driver.findElement(By.linkText(""))

	}

}
