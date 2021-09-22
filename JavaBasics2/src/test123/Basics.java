package test123;

import org.testng.annotations.Test;

public class Basics {
  @Test
  public void f() {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
  }
}
