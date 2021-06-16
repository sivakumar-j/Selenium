package Level_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class N7_Frames_Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"//Users//shiva//Documents//Technical//Java//Drivers//chromedriver");


		WebDriver v_obj_driver = new ChromeDriver();

		v_obj_driver.get("https://jqueryui.com/droppable/");


		Actions v_obj_actions = new Actions(v_obj_driver);


		System.out.println("Number of frames in the window" + v_obj_driver.findElements(By.tagName("iframe")).size());

		v_obj_driver.switchTo().frame(v_obj_driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

		// click the textbox and type hello
		WebElement source = v_obj_driver.findElement(By.id("draggable"));

		WebElement target = v_obj_driver.findElement(By.id("droppable"));


		v_obj_actions.dragAndDrop(source, target).build().perform();
		v_obj_driver.switchTo().defaultContent();



		Thread.sleep(2000);

		v_obj_driver.quit();

	}
}
