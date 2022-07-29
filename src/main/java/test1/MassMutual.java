package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MassMutual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "/Users/ruby.shiva/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
		driver.get("http://worksite.genuinedev.com/");
		driver.findElement(By.id("user-modal-yes")).click();
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		driver.findElement(By.name("First_Name")).sendKeys("TestFirstName");
		driver.findElement(By.name("Last_Name")).sendKeys("TestLastName");
		driver.findElement(By.name("Email")).sendKeys("Test@test.com");
		driver.findElement(By.name("Phone")).sendKeys("1234567890");
		driver.findElement(By.name("Zip")).sendKeys("02118");
		driver.findElement(By.name("Requested_Agency")).sendKeys("Genuine");
		System.out.println("Worksite opened");
	}

}
