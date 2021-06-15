package Level_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class N6_Assert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"//Users//shiva//Documents//Technical//Java//Drivers//chromedriver");

		WebDriver v_driver_obj = new ChromeDriver();
		v_driver_obj.get("https://rahulshettyacademy.com/dropdownsPractise/");


		Assert.assertFalse(v_driver_obj.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Thread.sleep(4000);

		v_driver_obj.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		Assert.assertTrue(v_driver_obj.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		System.out.println("Senior Citizen clicked true of false  : Its "
				+ v_driver_obj.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Thread.sleep(4000);
		v_driver_obj.close();// driver.close
		v_driver_obj.quit();// close all child windows
	}

}
