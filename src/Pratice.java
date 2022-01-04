import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pratice {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		
		
		 driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		shot("page1");
		
		Thread.sleep(2000);
		WebElement els= driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		els.click();
		
//		Actions action = new Actions(driver);
//		action.moveToElement(els).keyDown(els,Keys.SHIFT).click().keyUp(els, Keys.SHIFT).build().perform();
		
		
		Set<String> set = driver.getWindowHandles();
	    Iterator<String> itr = set.iterator();
	    
	    String parent = itr.next();
	    String child = itr.next();
	    
	    driver.switchTo().window(child);
	    
	    
	    
	    Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("seyar");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("joyandah");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("seyarjoyandah");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		shot("page2");
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		js();
		driver.findElement(By.id("newTabBtn")).click();
		/*
		List<WebElement> el = driver.findElements(By.xpath("//select[@id='month']//child::option"));
		
		for(WebElement els:el) {
			if(els.getText().equalsIgnoreCase("jun")) {
				els.click();
			}
		}
           */
	}
	public static void shot(String page) throws IOException {
		
		TakesScreenshot shot = (TakesScreenshot) driver;
		File file = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File(".//"+page+".png"));
		
	}
	public static void js() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-200)");
		
	}

}