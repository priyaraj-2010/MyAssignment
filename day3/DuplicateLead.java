package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
	driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testlead");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("PriyaRaj");
	driver.findElement(By.name("departmentName")).sendKeys("CSC");
	driver.findElement(By.name("description")).sendKeys("Selenium Training");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priya93.raj@gmail.com");
	WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select option = new Select(state);
	option.selectByVisibleText("Florida");
	driver.findElement(By.name("submitButton")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//a[text() ='Duplicate Lead']")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).clear();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("HCL");
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).clear();
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Aathmika");
	driver.findElement(By.name("submitButton")).click();
	String title1 = driver.getTitle();
	System.out.println(title1);
	driver.close();
	

	}

}
