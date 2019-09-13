import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestClass {

	String passWorddd;
	WebElements elements ;
	@Test
	public void DemoOne() throws IOException{
		
		InputsFromExcel inputExcel = new InputsFromExcel();
	
		System.setProperty("webdriver.chrome.driver","D:\\Softwears\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://accounts.google.com/signin";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS); 
		WebElement emailId = driver.findElement(By.xpath(elements.mailId));
		//email_phone.sendKeys("UREDDY1862@gmail.com");
		emailId.sendKeys(inputExcel.getData(0, 1, 0));
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.id(elements.mailNext)).click();
	/*	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys("your_password");*/
		driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
		//System.out.println("This is my Passwordd   "+EncodeFormat.enCoode(passWorddd));
		driver.findElement(By.xpath(elements.passwords)).sendKeys(EncodeFormat.enCoode(passWorddd));
		driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath(elements.passNext));
		String textt = ele.getText();
		System.out.println("This is next button element  "+textt);
		
		driver.findElement(By.xpath(elements.passNext)).click();
		driver.close();
		
	}
	
}
