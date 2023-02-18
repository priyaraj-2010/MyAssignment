package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    driver.findElement(By.xpath("//span[text()='Email']")).click();
	    driver.findElement(By.xpath("//input[@name ='emailAddress']")).sendKeys("priya93.raj@gmail.com");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'10896')]")).click();
	    driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	    driver.findElement(By.name("submitButton")).click();
	    driver.close();

	}

}
