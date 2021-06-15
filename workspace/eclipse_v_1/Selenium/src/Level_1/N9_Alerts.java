package Level_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class N9_Alerts {

	public static void main(String[] args) throws InterruptedException {

		String name = "Siva";

		System.setProperty("webdriver.chrome.driver",
				"//Users//shiva//Documents//Technical//Java//Drivers//chromedriver");

		WebDriver v_driver_obj = new ChromeDriver();
		v_driver_obj.get("https://rahulshettyacademy.com/AutomationPractice/");

		// input name
		v_driver_obj.findElement(By.id("name")).sendKeys(name);

		Thread.sleep(4000);

		// click alert button
		v_driver_obj.findElement(By.cssSelector("[id='alertbtn']")).click();

		Thread.sleep(4000);

		// switch to alert and accept
		v_driver_obj.switchTo().alert().accept();

		Thread.sleep(4000);

		// input name
		v_driver_obj.findElement(By.id("name")).sendKeys(name);

		// click confirm
		v_driver_obj.findElement(By.id("confirmbtn")).click();

		Thread.sleep(4000);

		// switch to alert and dismiss
		v_driver_obj.switchTo().alert().dismiss();

		Thread.sleep(4000);

		// quit window
		v_driver_obj.quit();

	}

}
