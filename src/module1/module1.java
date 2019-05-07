package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class module1 {

	public static void main(String[] args) {
		
		//Invoke or Initiate or Open Chromebrowser
		/*System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Installation stuff\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		//Open IE Browser
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Selenium\\Installation stuff\\Drivers\\IEDriverServer.exe");
		WebDriver driver1 = new InternetExplorerDriver();

	}

}
