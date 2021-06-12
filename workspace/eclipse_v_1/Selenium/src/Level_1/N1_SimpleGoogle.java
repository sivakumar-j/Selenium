package Level_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class N1_SimpleGoogle {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"//Users//shiva//Documents//Technical//Java//Drivers//chromedriver");


		WebDriver v_driver_obj = new ChromeDriver();
		v_driver_obj.get("http://google.com");
		System.out.println(v_driver_obj.getTitle());

		// validate i am landing on correct url

		// System.out.println(v_driver_obj.getCurrentUrl());

		// get the page source

		// System.out.println(v_driver_obj.getPageSource());

		// navigate back

		v_driver_obj.get("http://youtube.com");
		v_driver_obj.navigate().back();

		v_driver_obj.close();// driver.close
		v_driver_obj.quit();// close all child windows

	}

}
