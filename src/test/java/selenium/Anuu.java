package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Anuu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//div[@class='container']/child::input[@name='name']")).sendKeys("Anu");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//div[@class='container']/child::input[@name='name'][2]")).sendKeys("pyari");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text'][3]")).sendKeys("pyarianu22@gmail.com");
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//div[@class='container']/div/child::input[@type='password']")).sendKeys("pyari@123");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//div[@class='container']/child::input[@type='password']")).sendKeys("pyari@123");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[@class='btn'][2]")).click();
////      driver.findElement(By.xpath("//button[@type='reset'][2]")).click();.....................????????
//        Thread.sleep(1000);
        
//        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
        
//        driver.findElement(By.xpath("//table[@id='contactList']/descendant::input[2]")).click();
//        driver.findElement(By.xpath("//table[@id='contactList']/descendant::td[text()='Maria Anders']"));
        driver.findElement(By.xpath("//table[@id='contactList']/descendant::a[1]")).click();
//      driver.findElement(By.xpath("//input[@type='checkbox'][3]")).click();

        
//      driver.findElement(By.xpath("//input[@name='name'][1]")).sendKeys("Anu");
//      Thread.sleep(1000);
//      driver.findElement(By.xpath("//input[@name='name'][2]")).sendKeys("Pyari");
//      Thread.sleep(1000);
//      driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("pyarianu22@gmail.com");
//      Thread.sleep(1000);
//      driver.findElement(By.xpath("//input[@type='password'][1]")).sendKeys("pyari@123");
//      Thread.sleep(1000);
      
	}
}

