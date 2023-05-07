import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class adactin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium Files\\\\chromedriver_win32\\\\chromedriver.exe");
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement entuser = driver.findElement(By.id("username"));
		entuser.sendKeys("Alibasti");
		entuser.isDisplayed();
		entuser.isSelected();
		
		WebElement entpass = driver.findElement(By.id("password"));
		entpass.sendKeys("Basti@000");
		entpass.isDisplayed();
		entpass.isSelected();
		
		WebElement enter = driver.findElement(By.id("login"));
		enter.click();
		enter.isDisplayed();
		
	WebElement logo = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[1]/td[1]/img"));
	      String logoUrl = logo.getAttribute("src");

	      String expectedLogoUrl = "https://adactinhotelapp.com/img/AdactIn_logo.png";
	      
	      if (logoUrl.matches(expectedLogoUrl)) {
			System.out.println("Logo is Verified");
		}else {
			System.out.println("Logo is not Verified");
		}
		
	}

}
