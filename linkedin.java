package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class linkedin 
{
public static void main(String args[])throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\QA testing\\seleniumC\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	String baseUrl = "http://www.linkedin.com";
    driver.get(baseUrl);
    Thread.sleep(3000);
    System.out.println("end of code");
}
}
