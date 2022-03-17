package com.techblog.scripts;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.techblog.constants.AutomationConstants;
import com.techblog.pages.Home;
import com.techblog.utilities.ExcelUtility;


public class AdminHome extends TestBase{
		Home objHome;
		
@Test(priority=1)
	    public void verifyHome() throws IOException, Exception {
	    //Create Home Page object
	    objHome = new Home(driver);
	    //Navigating to home page
	 	    objHome.clickHome();
	 	   String expectedURL =AutomationConstants.URLHOME;
		    String actualURL =driver.getCurrentUrl();
		   AssertJUnit.assertEquals(expectedURL,actualURL);
	 		    Thread.sleep(2000);
	    
 @Test(priority=2)    
	    //Edit post
	 //Clicking on edit   
	    
	   objHome.clickEdit();
	    Thread.sleep(2000);
	    String expectedURL1 =AutomationConstants.URLEDIT;
	    String actualURL1 =driver.getCurrentUrl();
	   AssertJUnit.assertEquals(expectedURL1,actualURL1);
	    	    
	 //Selecting title box   
	    objHome.clickTitle();
	    Thread.sleep(2000); 
	    String title = ExcelUtility.getCellData(1,5);
	    	    objHome.setTitle(title);
	    	    Thread.sleep(5000);
	    
	    
}
		
}