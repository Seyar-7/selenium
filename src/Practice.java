import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		
		 driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		shot();
		driver.findElement(By.id("newTabBtn")).click();
		
		
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		
		String parent = itr.next();
		String child = itr.next();
		
		
		
		driver.switchTo().window(child);
		Thread.sleep(2000);
		 WebElement el =  driver.findElement(By.xpath("//button[@onclick='promptFunction()']"));
		 el.click();
	   	// driver.switchTo().frame(el);
		 driver.switchTo().alert().sendKeys("hello world");
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
           
		

	}
	public static void shot() throws IOException {
		
		TakesScreenshot shot = (TakesScreenshot) driver;
		File file = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".\\screenshot.png"));
		
	}

}
