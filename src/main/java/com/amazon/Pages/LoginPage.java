package com.amazon.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.Base.TestBase;

import io.netty.handler.timeout.TimeoutException;

public class LoginPage  extends TestBase {
	
	By SignInLink = By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]");
	By email = By.name("email");
	By Continue = By.xpath("//*[@id=\"continue\"]"); 
	By password = By.name("password");
	By SignInBtn = By.id("signInSubmit");
	
	public boolean  ValidateLogin(String Uname, String Pwd) {
		
		driver.findElement(SignInLink).click();
		wait(2000);
		driver.findElement(email).sendKeys(Uname);
		driver.findElement(Continue).click();
		wait(2000);
		driver.findElement(password).sendKeys(Pwd);
		driver.findElement(SignInBtn).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		boolean actResult = true;
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")));
		} catch(TimeoutException te) {
			actResult = false;
			System.out.println("screenshot for login failure");
		}
		return actResult;
		
		}
		
	}
	


