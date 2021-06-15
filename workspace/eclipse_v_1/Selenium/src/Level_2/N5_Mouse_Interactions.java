package Level_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class N5_Mouse_Interactions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"//Users//shiva//Documents//Technical//Java//Drivers//chromedriver");


		WebDriver v_driver_obj = new ChromeDriver();

		v_driver_obj.get("https://www.amazon.in/");


		Actions v_actions = new Actions(v_driver_obj);

		// click the prime
		v_actions
		.moveToElement(v_driver_obj
				.findElement(By.cssSelector("div[id='nav-main'] div[class='nav-fill'] span:nth-child(1)")))
		.build().perform();



		Thread.sleep(2000);

		v_driver_obj.quit();

	}
}
