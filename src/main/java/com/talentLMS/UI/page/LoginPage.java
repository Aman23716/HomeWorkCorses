package com.talentLMS.UI.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * @author Aman Omorbekov
 */



public class LoginPage extends BasePage {


    @FindBy(xpath = "//a[text()='Home']")
    public WebElement homeBtn;


    @FindBy(id = "tl-cms-nav-login")
    public WebElement loginBtn;

    @FindBy(css = ".avatar-square")
    public WebElement digitalNomadsLogo;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitLogin;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement loginErrMess;

//    public LoginPage clickLoginBtn(){
//        elementActions.click(loginBtn);
//        return this;


//    }
    public LoginPage fillUpUsernameAndPass(String username,String password){
//        clickLoginBtn();
        elementActions.sendKeys(usernameInput,username)
                .sendKeys(passwordInput,password).click(submitLogin);
        return this;
    }

//     public LoginPage Error(){
//        equals(loginErrMess);
//        return this;
//     }

//    public LoginPage cklickSubmit(){
//        elementActions.click(submitLogin);
//        return this;
//    }

}
