package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MassMutual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "/Users/ruby.shiva/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://worksite.genuinedev.com/");
		System.out.println("Worksite opened");
	}

}
