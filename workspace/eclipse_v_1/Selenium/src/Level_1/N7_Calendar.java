package Level_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class N7_Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"//Users//shiva//Documents//Technical//Java//Drivers//chromedriver");

		WebDriver v_driver_obj = new ChromeDriver();
		v_driver_obj.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// System.out.println(v_driver_obj.getTitle());

		// v_driver_obj.findElement(By.xpath("//a[normalize-space()='Images']")).click();

		System.out.println("Opacity  Before click " + v_driver_obj.findElement(By.id("Div1")).getAttribute("style")); // Opacity
																														// before
																														// click

		v_driver_obj.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();// roundtrip click

		System.out.println("Opacity  After click " + v_driver_obj.findElement(By.id("Div1")).getAttribute("style"));// opacity
																													// after
																													// click

		if (v_driver_obj.findElement(By.id("Div1")).getAttribute("style").contains("1"))// opacity changes from 0.5 to 1

		{

			System.out.println("its enabled");

			Assert.assertTrue(true);

		}

		else

		{

			Assert.assertTrue(false);

		}


		Thread.sleep(4000);
		v_driver_obj.close();// driver.close
		v_driver_obj.quit();// close all child windows
	}

}
