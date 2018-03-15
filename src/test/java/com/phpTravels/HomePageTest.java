package com.phpTravels;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phpTravels.base.BaseClass;
import com.phpTravels.pages.HomePage;
import com.phpTravels.pages.OneOnOneComparisonPage;

public class HomePageTest extends BaseClass {

	HomePage homePage;
	OneOnOneComparisonPage oneOnOneComparisonPage;
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup(){
		initialize();
		homePage = new HomePage();
		oneOnOneComparisonPage = new OneOnOneComparisonPage();
	}
	
	@Test
	public void compareOneOnOneTest() throws InterruptedException {
		homePage.clickOnOneOnOneComparisonBtn();
		String output = oneOnOneComparisonPage.clickOnCompareBtn("Nikon D5300", "sony a6000");
		Assert.assertEquals(output, "78");
	}
	
	@AfterMethod
	public void clear(){
		//driver.quit();
	}
}
