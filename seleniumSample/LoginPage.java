package seleniumSample;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.findElement(By.partialLinkText("CRM")).click();
		//to print title of the page
	    String title=driver.getTitle();   // ctrl+2
		System.out.println(driver.getTitle());//another method
		System.out.println(title);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kavitha");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kannan");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Abcd");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Accounts");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("FGhjgbmngu");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kaviarun12@gmail.com");
	    driver.findElement(By.name("submitButton")).click();
	    
	    
	    
		
		
		
		
		
		
		
		//driver.close();
		
		
		
		}
}
