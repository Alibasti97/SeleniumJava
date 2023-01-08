package userEnd;

import java.awt.AWTException;
import org.openqa.selenium.TakesScreenshot;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class User1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		driver.get("http://devspots.troontech.com/firm"); //open_url

		driver.manage().window().maximize();
		
		
		Thread.sleep(4000);
		
		// Advancing
		
		WebElement clickadvanced = driver.findElement(By.xpath("//*[@id=\"details-button\"]"));
		clickadvanced.click();
		
		//Proceed to Website
		
		WebElement proceedele = driver.findElement(By.xpath("//*[@id=\"proceed-link\"]"));
		proceedele.click();
	
		//Printing Title
		System.out.println(driver.getTitle());
		
		
		//Adding Username
		
		Thread.sleep(8000);
		
		WebElement usernamefortra = driver.findElement(By.id("email"));
		usernamefortra.sendKeys("cypress@yopmail.com");

		System.out.println("Adding Email");
		//Adding Password
		
		WebElement passwordfortra = driver.findElement(By.id("password"));
		passwordfortra.sendKeys("brokerFirm@123");
		
		System.out.println("Adding Password");
		//Clicking LogIn
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginbtn.click();
		System.out.println("Click Login");
		Thread.sleep(12000);
		
		//Click Add Property
			
		Thread.sleep(12000);
		WebElement addpropbtn = driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[1]/div/div/div/form/a"));
		addpropbtn.click();
		System.out.println("Click Add Property");
		
		// Adding Parameters
		Thread.sleep(10000);
		WebElement addaddress = driver.findElement(By.id("paddress"));
		addaddress.sendKeys("ghori town phase 7");
		 
		System.out.println("Enter Address");
		//Selecting Date
		
		Thread.sleep(6000);
		WebElement dateBox = driver.findElement(By.xpath("//input[@id='fcdate']"));

        //Fill date as mm/dd/yyyy as 09/25/2013

        dateBox.sendKeys("23/01/2023");

        //Press tab to shift focus to time field

        dateBox.sendKeys(Keys.ENTER);
        
        System.out.println("Selecting Date");
        //Adding Percentage
        
        WebElement addper = driver.findElement(By.id("referrals"));
        addper.sendKeys("30");
        
        System.out.println("Entering Percentage");
        //Handling Dropdown
        
        Select drpdowncurr = new Select(driver.findElement(By.id("cpayment")));
        drpdowncurr.selectByVisibleText("USDT");
        
        System.out.println("Selecting USDT");
      //Selecting Date Again
		
      		Thread.sleep(6000);
      		WebElement dateBox1 = driver.findElement(By.xpath("//input[@id='dwdate']"));

              //Fill date as mm/dd/yyyy as 09/25/2013

              dateBox1.sendKeys("25/01/2023");

              //Press tab to shift focus to time field

              dateBox1.sendKeys(Keys.ENTER);
              
              System.out.println("Selecting Date Again");
              //Selecting Status
              Thread.sleep(6000);
              Select drpdownstatus = new Select(driver.findElement(By.id("status")));
              drpdownstatus.selectByVisibleText("open");
		
              System.out.println("Select status");
              
              // Clicking Next
              Thread.sleep(6000);
              WebElement nextbtn = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
              nextbtn.click();
              
              System.out.println("Clicking Next to Upload File");
              
              //Adding Documents
              Thread.sleep(10000);
//              
//              WebElement uploadfile = driver.findElement(By.xpath("/html/body/div/section/div[2]/form/div/div/div[1]/div[1]/div/div/div[2]/div[2]/a"));
//             Thread.sleep(20000);
//              uploadfile.sendKeys("C:\\Users\\Ali Hassan\\Downloads\\Documents\\sample.pdf\\");
//              Thread.sleep(20000);
//              driver.findElement(By.xpath("/html/body/div/section/div[2]/form/div/div/div[1]/div[1]/div/div/div[2]/div[2]/a")).submit();
              
              
//              driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/form/div/div/div[1]/div[1]/div/div/div[2]/div[2]/a")).sendKeys("\"C:\\Users\\Ali Hassan\\Downloads\\Documents\\sample.pdf\"");
//
//              driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/form/div/div/div[1]/div[1]/div/div/div[2]/div[2]/a")).submit();
              
              	
              driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/form/div/div/div[1]/div[1]/div/div/div[2]/div[2]/a")).click();
      	  	
      	  	Robot rb111=new Robot();
      	  	rb111.delay(2000);
      	  		
      	  	StringSelection ss111 = new StringSelection("C:\\Users\\Ali Hassan\\Downloads\\Documents\\sample.pdf");
      	  	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss111, null);
      	  		
      	  	rb111.keyPress(KeyEvent.VK_CONTROL);
      	  	rb111.keyPress(KeyEvent.VK_V);
      	  	rb111.keyRelease(KeyEvent.VK_V);
      	  	rb111.keyRelease(KeyEvent.VK_CONTROL);
      	  	rb111.keyPress(KeyEvent.VK_ENTER);
      	  	rb111.keyRelease(KeyEvent.VK_ENTER);
              
              
              
            System.out.println("Uploading File");
            
            
            // Submitting File
            Thread.sleep(10000);
//          
            WebElement submitproperty = driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/form/div/div/div[2]/div/button[2]"));
            submitproperty.click();
            
            System.out.println("Submitted File");
            
            
        	// Adding Broker Now //
            
            Thread.sleep(10000);     
            WebElement openbroker = driver.findElement(By.xpath("//a[normalize-space()='Brokers']"));
            openbroker.click();
            

            // Adding Broker
            
            Thread.sleep(10000);
        
            WebElement addbroker = driver.findElement(By.xpath("//p[@class='btn btnprimary ms-5 mb-0']"));
            addbroker.click();
            
            // Broker Name
            
            
            Thread.sleep(10000);
            WebElement brokername = driver.findElement(By.xpath("//div[@class='mb-4']//div[2]//input[1]"));
            brokername.sendKeys("Hassan");
	
            // NAR Number
            
            Thread.sleep(10000);
            WebElement narnumber = driver.findElement(By.id("formBasicEmail"));
            narnumber.sendKeys("304332");
            
            // Enter Email
            
            Thread.sleep(10000);
            WebElement enteremail = driver.findElement(By.id("formBasicPassword"));
            enteremail.sendKeys("iwncbs@gmail.com");
            
            // Enter Phonenumber
            
            Thread.sleep(10000);
            WebElement enterphone = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
            enterphone.sendKeys("+923131539047");
            
            // Enter Phonenumber Again
            
            Thread.sleep(10000);
            WebElement enterphoneag = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
            enterphoneag.sendKeys("+923131539047");
            
            //Enter Address
            
            Thread.sleep(10000);
            WebElement enteraddress = driver.findElement(By.xpath("//input[@placeholder='Enter Address']"));
            enteraddress.sendKeys("ghori town phase 7");
            
            // Upload File of Broker
            
            Thread.sleep(10000);
            
 driver.findElement(By.xpath("//a[normalize-space()='Browse']")).click();
      	  	
      	  	Robot rb1112=new Robot();
      	  	rb1112.delay(2000);
      	  		
      	  	StringSelection ss1112 = new StringSelection("C:\\Users\\Ali Hassan\\Downloads\\Documents\\sample.pdf");
      	  	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1112, null);
      	  		
      	  	rb111.keyPress(KeyEvent.VK_CONTROL);
      	  	rb111.keyPress(KeyEvent.VK_V);
      	  	rb111.keyRelease(KeyEvent.VK_V);
      	  	rb111.keyRelease(KeyEvent.VK_CONTROL);
      	  	rb111.keyPress(KeyEvent.VK_ENTER);
      	  	rb111.keyRelease(KeyEvent.VK_ENTER);
      	  	
      	  // Click Add Broker
      	  	
      	  Thread.sleep(10000);
      	  
      	  	WebElement clickaddbroker = driver.findElement(By.xpath("//button[normalize-space()='Add Broker']"));
      	  	clickaddbroker.click();
      	  	
      	  	
	}
	
	
	

	
	
	
	

}
