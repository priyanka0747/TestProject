package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Para_admin_page {
	
	WebDriver driver;

	By adminfield=By.xpath("/html/body/div[1]/div[2]/ul[1]/li[6]/a");
	By submit=By.xpath("/html/body/div[1]/div[3]/div[2]/form/input");

	public Para_admin_page(WebDriver driver)
	{
	this.driver=driver;
	}

	public void selectAdminpage()
	{
		driver.findElement(adminfield).click();
	}
	
	public void submitAdministration() throws InterruptedException
	{
		driver.findElement(submit).click();
		Thread.sleep(3000);
		driver.close();

}
}
