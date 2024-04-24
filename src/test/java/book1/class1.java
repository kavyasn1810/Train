package book1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class class1 {

	public static void main(String[] args)  throws Throwable{
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/index.php");
		
		Thread.sleep(2000);
		
		
		WebElement ele = driver.findElement(By.xpath("//*[.='The is a sample site you can test with BlazeMeter! ']"));
	
		boolean b =ele.isDisplayed();
		
		if(b) {
			System.out.println("text is displayed");
		}
		
		else {
			System.out.println("text not displayed");
		}
	 driver.findElement(By.xpath("//*[.='destination of the week! The Beach!']")).click();
	 Thread.sleep(2000);
		
driver.navigate().back();
Thread.sleep(2000);


driver.findElement(By.xpath("//html/body/div[3]/form/select[1]/option[6]")).click();
Thread.sleep(2000);
Select sel=new Select(ele);
sel.selectByIndex(6);
Thread.sleep(2000);
sel.selectByValue("Mexico City");
Thread.sleep(2000);


driver.findElement(By.xpath("//html/body/div[3]/form/select[2]/option[3]")).click();
Thread.sleep(2000);
Select sel1=new Select(ele);
sel1.selectByIndex(6);
Thread.sleep(2000);
sel1.selectByValue("London");
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@type='submit' and @value='Find Flights']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();
Thread.sleep(2000);

WebElement ele1 = driver.findElement(By.xpath("//*[text()='Total Cost: ']"));

boolean b1 =ele.isDisplayed();

if(b) {
	System.out.println("cost is displayed");
}

else {
	System.out.println("cost not displayed");
}
	 Thread.sleep(2000);
	 
	 WebElement scroll = driver.findElement(By.xpath("//input[@type='submit' and @value='Purchase Flight']"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(scroll).perform();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//input[@type='submit' and @value='Purchase Flight']")).click();
	 Thread.sleep(2000); 
	 
	 
	 WebElement ele2 = driver.findElement(By.xpath("//html/body/div[2]/div/h1[text()='Thank you for your purchase today!']"));
		
		boolean b3 =ele.isDisplayed();
		
		if(b) {
			System.out.println("Conformation message is displayed");
		}
		
		else {
			System.out.println("Conformation message is not displayed");
		}
	 Thread.sleep(2000);
	 
	 driver.close();
	 
	 
	 
	 
		
	}
	
}
		
		


