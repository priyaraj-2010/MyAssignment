package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
    driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
    driver.findElement(By.id("firstNameField")).sendKeys("Priya");
    driver.findElement(By.id("lastNameField")).sendKeys("Rajendran");
    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Aathmika");
    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Thiyagu");
    driver.findElement(By.name("departmentName")).sendKeys("CSC");
    driver.findElement(By.name("description")).sendKeys("Hello Selenium");
    driver.findElement(By.name("primaryEmail")).sendKeys("priya-rajendran@gmail.com");
    WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
    Select option = new Select(state);
    option.selectByVisibleText("Alabama");
    driver.findElement(By.name("submitButton")).click();
    driver.findElement(By.xpath("//a[text()='Edit']")).click();
    driver.findElement(By.name("description")).clear();
    driver.findElement(By.name("description")).sendKeys("One of the Automation Tool is Selenium");
    driver.findElement(By.name("submitButton")).click();
    String title = driver.getTitle();
	System.out.println(title);
	driver.close();

	}

}
