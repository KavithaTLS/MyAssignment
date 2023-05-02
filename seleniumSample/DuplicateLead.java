package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	
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
		   
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.partialLinkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavitha");
		    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kannan");
		    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Abcd");
		    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Accounts");
		    driver.findElement(By.id("createLeadForm_description")).sendKeys("FGhjgbmngu");
		    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kaviarun12@gmail.com");
		    driver.findElement(By.name("submitButton")).click();
		    
		    String title = driver.getTitle();
		    System.out.println(driver.getTitle());
		    
		     driver.findElement(By.linkText("Duplicate Lead")).click();
		     driver.findElement(By.id("createLeadForm_companyName")).clear();
		     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Global Solution");
		     driver.findElement(By.id("createLeadForm_firstName")).clear();
		     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
		     driver.findElement(By.name("submitButton")).click();
		    
			    System.out.println(title);
		     
		    
		    

	}

}
