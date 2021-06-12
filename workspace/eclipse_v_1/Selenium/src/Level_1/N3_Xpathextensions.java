package Level_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class N3_Xpathextensions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"//Users//shiva//Documents//Technical//Java//Drivers//chromedriver");

		WebDriver v_driver_obj = new ChromeDriver();
		v_driver_obj.get("https://www.google.com/");
		// System.out.println(v_driver_obj.getTitle());

		v_driver_obj.findElement(By.xpath("//a[normalize-space()='Images']")).click();

		Thread.sleep(4000);
		v_driver_obj.close();// driver.close
		v_driver_obj.quit();// close all child windows
	}

}
