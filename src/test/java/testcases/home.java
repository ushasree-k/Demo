package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class home {

	public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//String path =  System.getProperty("user.dir") + "\\src\\test\\java\\TestData\\UIA_TestData_New.xls";
    String url = "https://www.google.co.in/";
    driver.navigate().to(url);
    System.out.println(driver.getTitle());
   
    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("macbook air");
    System.out.println("Clicked on text box opened Mac book");
   
    driver.navigate().to("https://www.selenium.dev/");
    System.out.println(driver.getTitle());
    driver.findElement(By.xpath("//span[contains(text(),'Documentation')]")).click();
    System.out.println("Opened Documentation");
    
    driver.quit();
  
    
    
    

}
}
