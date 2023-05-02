package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Kavitha");
		driver.findElement(By.id("lastNameField")).sendKeys("Kannan");
		driver.findElement(By.name("submitButton")).click();
		
		
		String text = driver.findElement(By.id("firstNameField")).getText();
		System.out.println(text);
		
		//String title = driver.getTitle();
	
		//System.out.println(driver.getTitle());
		//System.out.println(title);
		
		
		driver.close();
		
	}
	

}
