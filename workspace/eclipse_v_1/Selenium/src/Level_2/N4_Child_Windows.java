package Level_2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class N4_Child_Windows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"//Users//shiva//Documents//Technical//Java//Drivers//chromedriver");

		WebDriver v_driver_obj = new ChromeDriver();


		v_driver_obj.get("https://rahulshettyacademy.com/loginpagePractise/#");

		// find the url floating at top
		v_driver_obj.findElement(By.cssSelector(".blinkingText")).click();

		// what are the list of windows
		Set<String> windows = v_driver_obj.getWindowHandles();

		// loop thru all windows
		Iterator<String> it = windows.iterator();

		String parentId = it.next();

		String childId = it.next();

		v_driver_obj.switchTo().window(childId);

		Thread.sleep(2000);

		// get the text with email id
		v_driver_obj.findElement(By.cssSelector(".im-para.red")).getText();

		// split it to get the email id alone
		String emailId = v_driver_obj.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim()
				.split(" ")[0];

		v_driver_obj.switchTo().window(parentId);

		// fill the username with string from child page
		v_driver_obj.findElement(By.id("username")).sendKeys(emailId);

		Thread.sleep(2000);

		v_driver_obj.quit();

	}
}
