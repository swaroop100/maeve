import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel {

	public static void main(String[] args) {
		  WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//login function
			//driver.get("https://opensource-demo.orangehrmlive.com/");
			//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			//driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			//driver.findElement(By.id("btnLogin")).click();
	
		driver.get("https://demoqa.com/buttons");
		//double click prg
		//WebElement element=driver.findElement(By.id("doubleClickBtn"));
		//Actions act=new Actions(driver);
		//act.doubleClick(element).build().perform();
		
		//right click button click
		//WebElement element=driver.findElement(By.id("rightClickBtn"));
			//Actions act=new Actions(driver);
			//act.contextClick(element).build().perform();
	
		// dynamic value click button click prg
		String str=driver.findElement(By.xpath("//button[text()='Click Me']")).getAttribute("id");
			driver.findElement(By.id(str)).click();
			
	}

}
