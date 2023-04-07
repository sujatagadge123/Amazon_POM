package com.amazon.testScenarios;

import org.testng.annotations.Test;

import com.amazon.Base.TestBase;
import com.amazon.Pages.LoginPage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PlaceOrder extends TestBase {
  @Test
  public void LoginTest() {
	  LoginPage loginTest = new LoginPage();
	 boolean actResult = loginTest.ValidateLogin("sujatapgadge123@gmail.com","Sujatap@9");
	 Assert.assertTrue(actResult);
	
  }
  
  @Test
  public void SearchProductPage() {
  }
  
  @Test
  public void selectProductTest() {
  }
  
  @Test
  public void addToCartTest() {
  }
  
  @Test
  public void makePaymentTest() {
  }
  
  @Test
  public void logoffTest() {
  }
  
  @BeforeClass
  public void beforeClass() {
	  launchBrowser();
	  navigateToURL();
  }


@AfterClass
  public void afterClass() {
  }

}
