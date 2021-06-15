package Level_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class N4_DropDownPractise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"//Users//shiva//Documents//Technical//Java//Drivers//chromedriver");

		WebDriver v_driver_obj = new ChromeDriver();
		v_driver_obj.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// System.out.println(v_driver_obj.getTitle());

		// v_driver_obj.findElement(By.xpath("//a[normalize-space()='Images']")).click();

		WebElement v_obj_webE_dropdown = v_driver_obj.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select v_obj_dropdown = new Select(v_obj_webE_dropdown);
		v_obj_dropdown.selectByIndex(3);
		System.out.println(v_obj_dropdown.getFirstSelectedOption().getText());
		v_obj_dropdown.selectByVisibleText("AED");
		System.out.println(v_obj_dropdown.getFirstSelectedOption().getText());
		v_obj_dropdown.selectByValue("INR");
		System.out.println(v_obj_dropdown.getFirstSelectedOption().getText());

		v_driver_obj.findElement(By.id("divpaxinfo")).click();// number of passengers
		Thread.sleep(2000L);

		for (int i = 1; i < 5; i++)

		{

			v_driver_obj.findElement(By.id("hrefIncAdt")).click();

		}

		v_driver_obj.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(v_driver_obj.findElement(By.id("divpaxinfo")).getText());


		Thread.sleep(4000);

		v_driver_obj.quit();// close all child windows
	}

}
