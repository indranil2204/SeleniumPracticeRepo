package com.phpTravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phpTravels.base.BaseClass;

public class OneOnOneComparisonPage extends BaseClass {

	@FindBy(id="compareFormInput1")
	WebElement camera1Name;
	
	@FindBy(id="compareFormInput2")
	WebElement camera2Name;
	
	@FindBy(xpath="//*[@id='compareForm']/div/div/div/div/div")
	WebElement camera1Found;
	
	@FindBy(xpath="//*[@id='compareForm']/div/div/div/div/div")
	WebElement camera2Found;
	
	@FindBy(xpath="//button[@type='submit' and @class='btn btn-primary btn-lg']")
	WebElement compareBtn;
	
	public OneOnOneComparisonPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String clickOnCompareBtn(String camera1, String camera2) throws InterruptedException {
		camera1Name.sendKeys(camera1);
		Thread.sleep(2000);
		camera1Found.click();
		
		Thread.sleep(1000);
		
		camera2Name.sendKeys(camera2);
		Thread.sleep(2000);
		camera2Found.click();
		
		Thread.sleep(3000);
		
		compareBtn.click();
		
		Thread.sleep(5000);
		
		String score =driver.findElement(By.xpath("//*[@id='compareHead']/div[2]/div[2]/div[2]/div/button[1]/span")).getText();
		return score;	
	}
}
