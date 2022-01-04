import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random2{
       public static Random rand = new Random();
	public static void main(String[] args) {
		
	System.out.println(name());

		String name = name();
		String last = last();
		String email = name+""+last+".com";
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/index.php?route=account/register");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name);	
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(last);	
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);	
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("seyar");	
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("seyar");	
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("seyar");	


		
		/*
		String arr[] = {"Seyar","Morid","Wali","Baryalai","Toryalai","Arif"};
		int name = rand.nextInt(arr.length);
		 System.out.println(arr[name]);
		 */

	}
	
	
	public static String name() {
		int name;
		name = rand.nextInt(6)+1;
		
		
		String seyar = "Seyar";
		String morid = "Morid";
		String barry = "Baryalai";
		String toor = "Toryalai";
		String wali = "Wali";
		String arif = "Arif";
		
		if(name == 1) {
			return seyar;
		}else if(name == 2) {
			return morid;
		}else if(name == 3) {
			return barry;
		}else if(name == 4) {
			return toor;
		}else if(name == 5) {
			return wali;
		}else if(name == 6) {
			return arif;
		}
		return "";
	
	}
	public static String last() {
		int name;
		name = rand.nextInt(6)+1;
		
		
		String joyandah = "Joyandah";
		String joya = "Joya";
		String hashim = "Hashim";
		String ahmadi = "Ahmadi";
		String ghanizada = "Ghanizada";
		String ghousy = "Ghousy";
		
		if(name == 1) {
			return joyandah;
		}else if(name == 2) {
			return joya;
		}else if(name == 3) {
			return hashim;
		}else if(name == 4) {
			return ahmadi;
		}else if(name == 5) {
			return ghanizada;
		}else if(name == 6) {
			return ghousy;
		}
		return "";

	   }
	}
