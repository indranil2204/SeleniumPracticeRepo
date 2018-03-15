package com.phpTravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phpTravels.base.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//a[@href='http://cameradecision.com/search' and @class='btn btn-primary']")
	WebElement oneOnOneComparisonBtn;
	
	@FindBy(xpath="//a[@href='http://cameradecision.com/size-comparison' and @class='btn btn-primary']")
	WebElement sizeComparisonBtn;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnOneOnOneComparisonBtn() {
		oneOnOneComparisonBtn.click();
	}
	
	public void clickOnSizeComparisonBtn() {
		sizeComparisonBtn.click();
	}
}
