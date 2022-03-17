package com.techblog.scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.techblog.constants.AutomationConstants;
import com.techblog.pages.Login;
import com.techblog.utilities.ExcelUtility;

public class AdminLoginClass extends TestBase{
	Login objLogin;


	
	@Test(priority=1)
    public void verifyValidLogin() throws IOException, Exception {
    //Create Login Page object
    objLogin = new Login(driver);
    //login to application
    
    objLogin.clickDropDown();
    objLogin.SelectLogin();
    String username = ExcelUtility.getCellData(1,2);
    //String password = ExcelUtility.getCellData(1,3);
    objLogin.setUserName(username);
    //objLogin.setPassword(password);
    /*WebElement username=driver.findElement(By.id("user"));
    username.sendKeys("admin");*/
    WebElement password=driver.findElement(By.id("pwd"));
    password.sendKeys("1234");
    objLogin.clickLogin();
    
    Thread.sleep(2000);
    
    String expectedURL =AutomationConstants.URLADMIN;
    String actualURL =driver.getCurrentUrl();
    Assert.assertEquals(expectedURL,actualURL);
    
    Thread.sleep(2000);
    }

	
}
