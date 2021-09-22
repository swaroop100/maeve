import org.testng.annotations.Test;

import test123.ChromeDriver;

public class TestNG {
  @Test
  public void f() {
	  
	  ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
  }
}
