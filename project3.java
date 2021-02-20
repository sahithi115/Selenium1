package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\jar files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        String baseUrl = "https://jobs.lever.co/traderev";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.className("filter-button")).click();
	}

}
