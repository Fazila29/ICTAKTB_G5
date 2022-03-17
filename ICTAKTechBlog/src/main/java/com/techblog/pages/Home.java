package com.techblog.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
	 
	 //objects
	 @FindBy (xpath="//*[@id=\"nav\"]")
	 private WebElement home;
	 @FindBy(xpath="/html/body/app-root/app-home/div/div[4]/div/li[1]/div/div/div/button[1]")
	 private WebElement edit;
	 
	 @FindBy(id="exampleInputEmail1")
	 private WebElement title;
	 
	 public Home(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
	 
	 //methods to access the objects

	//Click on 'Home'
	    public void clickHome(){ 
	    	home.click();
	    }
	 //Click on 'Edit'   	
	    	 public void clickEdit(){ 
	 	    	edit.sendKeys(Keys.RETURN);
	   	} 
	
	    	 //Click on 'Title'   	
	    	 public void clickTitle(){ 
	 	    	title.sendKeys(Keys.RETURN);
	   	} 
	
	    	 //Set title in text box
	    	 
	  			    public void setTitle(String strTitle){
			    	title.sendKeys(strTitle);     
			    }

			    /* public void clearTitle() {
			    	 title.clear();
			     } 	*/ 
	    	 
	    	 

}
