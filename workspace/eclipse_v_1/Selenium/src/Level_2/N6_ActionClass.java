package Level_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class N6_ActionClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"//Users//shiva//Documents//Technical//Java//Drivers//chromedriver");


		WebDriver v_driver_obj = new ChromeDriver();

		v_driver_obj.get("https://www.amazon.in/");


		Actions v_actions = new Actions(v_driver_obj);

		// click the textbox and type hello
		v_actions
		.moveToElement(v_driver_obj
				.findElement(By.cssSelector("#twotabsearchtextbox")))
		.click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick()
		.build().perform();



		Thread.sleep(2000);

		v_driver_obj.quit();

	}
}
