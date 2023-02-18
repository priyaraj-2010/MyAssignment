package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class ='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Priya");
		driver.findElement(By.name("lastname")).sendKeys("Rajendran");
		driver.findElement(By.xpath("(//input[@class ='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("98765678789");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123@priya");
		WebElement day = driver.findElement(By.id("day"));
		Select option = new Select(day);
		option.selectByVisibleText("20");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select option1 = new Select(month);
		option1.selectByVisibleText("Oct");
		WebElement year = driver.findElement(By.id("year"));
		Select option3 = new Select(year);
		option3.selectByValue("2004");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
		
	}

}
