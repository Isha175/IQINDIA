package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {
public static void main (String[]srgs) throws InterruptedException {
	
	WebDriverManager.chromedriver();
	WebDriver driver =new ChromeDriver();
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.get("http://demo.testfire.net/login.jsp");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys("jsmith");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("demo1234");
	Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("View Account Summary")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("View Recent Transactions")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Transfer Funds")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Search News Articles")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Customize Site Language")).click();
	Thread.sleep(1000);
	driver.close();
	
//	driver.get("https://www.hyrtutorials.com/");           
	
//	driver.get("https://magento.softwaretestingboard.com/");
//	driver.findElement(By.linkText("Sign-In")).click();
//	Thread.sleep(1000);
	
//	WebDriverManager.edgedriver();
//	WebDriver driver=new EdgeDriver();
	
//	WebDriverManager.firefoxdriver();
//	WebDriver driver=new FirefoxDriver();
}
}
