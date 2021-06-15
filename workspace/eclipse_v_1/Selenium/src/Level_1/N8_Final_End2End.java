package Level_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class N8_Final_End2End {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"//Users//shiva//Documents//Technical//Java//Drivers//chromedriver");

		WebDriver v_driver_obj = new ChromeDriver();

		v_driver_obj.get("https://rahulshettyacademy.com/dropdownsPractise/");


		v_driver_obj.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();// oneway trip selected


		v_driver_obj.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();// from city

		v_driver_obj.findElement(By.xpath("//a[@value='DEL']")).click();// click delhi

		Thread.sleep(2000);

		v_driver_obj
		.findElement(
				By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
		.click();// destination city

		// date cannot be change since current date functionality not available in
		// website

		// click senior citizen
		v_driver_obj.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		// Passengers
		v_driver_obj.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000L);

		for (int i = 1; i < 5; i++)

		{

			v_driver_obj.findElement(By.id("hrefIncAdt")).click();

		}

		// click the done button
		v_driver_obj.findElement(By.id("btnclosepaxoption")).click();

		// click search

		v_driver_obj.findElement(By.cssSelector("input[value='Search']")).click();


		Thread.sleep(4000);

		v_driver_obj.quit();// close all child windows
	}

}
