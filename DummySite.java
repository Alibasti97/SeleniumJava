package tryTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DummySite {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium Files\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		
		
		// Sample OK Alert Button
		
		WebElement alertbtn = driver.findElement(By.xpath("//button[normalize-space()='Your Sample Alert Button!']"));
		alertbtn.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		System.out.println("Accepting Alert");
		
		// Sample CANCEL Alert Button
		
		WebElement alertbtn1 = driver.findElement(By.xpath("//button[normalize-space()='Your Sample Alert Button!']"));
		alertbtn1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		System.out.println("Dismissing Alert");
		
		// Filling Form
		
		Thread.sleep(2000);
		WebElement first_name = driver.findElement(By.id("fname"));
		first_name.sendKeys("Ali");
		
		System.out.println("Entering First Name");
		Thread.sleep(2000);
		WebElement last_name = driver.findElement(By.id("lname"));
		last_name.sendKeys("Hassan");
		
		System.out.println("Entering Last Name");
		Thread.sleep(2000);
		WebElement radio1 = driver.findElement(By.id("male"));
		radio1.click();
		
		System.out.println("Male Radio");
		
		Thread.sleep(2000);
		WebElement radio2 = driver.findElement(By.id("female"));
		radio2.click();
		System.out.println("FeMale Radio");
		
		
		
		if (radio2.isSelected()) {
			System.out.println("Female is Selected");
		}else {
			System.out.println("Male is Selected");
		}
		
		 Select dropdownoptions = new Select(driver.findElement(By.id("option")));
		 dropdownoptions.selectByValue("option 1");
	        
	        System.out.println("Selecting option");
	        
	        
	    WebElement selectmuloptions = driver.findElement(By.cssSelector("select[id='owc'] option[value='option']"));
	    selectmuloptions.click();	
	    
	    // Applicable Option 1
	    
	    WebElement selectapplicableop = driver.findElement(By.id("moption"));
	    selectapplicableop.click();
	    
	 // Applicable Option 2
	    
	    WebElement selectapplicableop1 = driver.findElement(By.xpath("//*[@id=\"moption\"]"));
	    selectapplicableop1.click();
	    
	 // Applicable Option 3
	    
	    WebElement selectapplicableop2 = driver.findElement(By.xpath("//*[@id=\"moption\"]"));
	    selectapplicableop2.click();
	    
	    
	 // Choosing from auto guess answer inbox element
	    
	    WebElement selectvanilla = driver.findElement(By.cssSelector("input[name='Options']"));
	    selectvanilla.sendKeys("Banana");
	    Robot rb = new Robot();
	    // Press control keyboard key
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_TAB);
	 
	    
	    // Choosing Color
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement ColorElement =driver.findElement(By.id("favcolor"));
	    js.executeScript("arguments[0].setAttribute('value', 'DEDEDE')",ColorElement);
	    
	    System.out.println("Choosing color");
	    
	    
	    // Handling Date Picker
	    
	    WebElement dateBox = driver.findElement(By.xpath("//*[@id=\"day\"]"));
        dateBox.sendKeys("25092023");
        dateBox.sendKeys(Keys.TAB);
 
	    
	    // Handling Slider
	    
	    WebElement slider = driver.findElement(By.xpath("//*[@id=\"a\"]"));
	    slider.isEnabled();
	    slider.isSelected();
	    Thread.sleep(2000);
	    Robot rb1 = new Robot();
	    
	    System.out.println("Slider work");
	    
	    rb1.keyPress(KeyEvent.VK_RIGHT);  // Press Right Key on keyboard
	    rb1.keyPress(KeyEvent.VK_RIGHT);  // Press Right Key on keyboard
	    rb1.keyPress(KeyEvent.VK_RIGHT);  // Press Right Key on keyboard
	    rb1.keyPress(KeyEvent.VK_RIGHT);  // Press Right Key on keyboard
	    rb1.keyPress(KeyEvent.VK_RIGHT); // Press Right Key on keyboard
	    
	    
	    
	// Uploading the file
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"myfile\"]")).sendKeys("C:\\Users\\Ali Hassan\\Downloads\\85269 (1) (1) (1).jpg");

	    driver.findElement(By.xpath("//*[@id=\"myfile\"]"));
	    
	    System.out.println("File's Uploaded");
        
	    // Selecting Quantity
	    
	    WebElement setquan = driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
	    setquan.isDisplayed();
	    setquan.isEnabled();
	    setquan.sendKeys("3");
	    
	    // Enter Messsage
	    
	    WebElement entmsg = driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/fieldset/textarea"));
	    entmsg.clear();
	    Thread.sleep(2000);
	    entmsg.sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the "
	    		+ "industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled "
	    		+ "it to make a type specimen book.");
		Thread.sleep(4000);
	    // Drag and Drop Pizza
	    
		WebElement pizzaitem = driver.findElement(By.id("drag1"));
		
		WebElement pizzabox = driver.findElement(By.id("div1"));
		
		dragndrop(driver, pizzaitem, pizzabox);
	 
	}
	
	public static void dragndrop(WebDriver driver, WebElement srcelement, WebElement dstelement ) {
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(srcelement, dstelement).perform();
		
	}
	
	
	
}