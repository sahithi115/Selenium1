package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class project2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\jar files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        String baseUrl = "https://jobs.lever.co/traderev";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.className("filter-button")).click();
        
        		
        		
        		
//        Select drpCountry = new Select(driver.findElement(By.className("filter-button")));
//        drpCountry.selectByVisibleText("Toronto");


	}

}
