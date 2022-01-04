import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		/*
		  
		 Note:when we start frameworks,we will be using selenium 3 not 4 , since some of the libraries may
		 not be compatible with some of the tools we will be using.
		  
		  selenium we learned how set property for our web driver
		      a.System.setProperty("webdriver.chrome.driver","path to the chromedriver")
		           
		  we learned how declare and initialize WebDriver and (chorme,firefox,edge)
		      a.WebDriver driver = new ChromeDriver();
		 */
		
		
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(2000);
		List<WebElement> el = driver.findElements(By.xpath("//div//div//div[@aria-disabled='false']"));
		el.get(1).click();
          System.out.println(el.get(1).getText());
		Thread.sleep(2000);
		for(WebElement els:el) {
		   System.out.println(els.getAttribute("aria-label"));
		}
		

	}

}
