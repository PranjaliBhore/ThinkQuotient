package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectName
{
	public static void main(String args[])throws InterruptedException

{
	
	System.setProperty("webdriver.chrome.driver","D:\\QA testing\\seleniumC\\chromedriver\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
	driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("abc");
    driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("uvw");
    driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("mno@gmail.com");
    driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("2222222222");
    driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("pqr");
    WebElement jt=driver.findElement(By.xpath("//select[@name='UserTitle']"));
	Select jobtitle=new Select( jt );
	jobtitle.selectByVisibleText("Sales Manager");
    System.out.println("Sign Up Page --Title of Page is:"+driver.getTitle());
    driver.close();
    Thread.sleep(2000);
}
}
