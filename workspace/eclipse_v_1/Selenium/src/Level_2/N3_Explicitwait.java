package Level_2;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class N3_Explicitwait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"//Users//shiva//Documents//Technical//Java//Drivers//chromedriver");

		WebDriver v_driver_obj = new ChromeDriver();

		WebDriverWait v_explicitwait_obj = new WebDriverWait(v_driver_obj, 5);

		String[] v_itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		v_driver_obj.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(v_driver_obj, v_itemsNeeded);

		// click card
		v_driver_obj.findElement(By.cssSelector("img[alt='Cart']")).click();

		// proceed to checkout
		v_driver_obj.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		// explicit wait
		v_explicitwait_obj.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));


		// apply prpmocode
		v_driver_obj.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		// apply promo button
		v_driver_obj.findElement(By.cssSelector("button.promoBtn")).click();

		// promotcode applied or not--not working
		// System.out.println(v_driver_obj.findElement(By.cssSelector(".promoInfo")).getText());
		// System.out.println(v_driver_obj.findElement(By.xpath("//span[@class='promoInfo']")).getText());

		v_driver_obj.quit();

	}

	public static void addItems(WebDriver v_param_driver, String[] v_param_itemsNeeded) throws InterruptedException

	{

		int j = 0;

		List v_itemsNeededList = Arrays.asList(v_param_itemsNeeded);// converting to arraylist

		// get the names
		List<WebElement> v_all_products = v_param_driver.findElements(By.cssSelector("h4.product-name"));



		//for (int i = 0; i < v_all_products.size(); i++)
		for (int i = 0; i < v_all_products.size(); i++)
		{

			// remove the - 1 kg
			String[] v_item_name = v_all_products.get(i).getText().split("-");

			String v_item_formattedName = v_item_name[0].trim();

			// format it to get actual vegetable name

			// convert array into array list for easy search

			// check whether name you extracted is present in arrayList or not-



			if (v_itemsNeededList.contains(v_item_formattedName))

			{

				j++;

				// click on Add to cart

				v_param_driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				Thread.sleep(1000);

				if (j == v_param_itemsNeeded.length)

				{

					break;

				}

			}

		}

	}

}
