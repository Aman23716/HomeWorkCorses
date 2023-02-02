package com.talentLMS.UI.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends BasePage{


    private WebDriver driver;
    private Alert alert;



    @FindBy(xpath = "//input[@name='name']")

    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='surname']")
    public WebElement secondName;

    @FindBy(xpath = "//input[@name='email']")

    public WebElement emailInput;

    @FindBy(xpath = "//input[@name='login']")

    public WebElement UserInput;

    @FindBy(xpath = "//input[@name='password']")

    public WebElement password;

    @FindBy(xpath = "//input[@name='submit_personal_details']")
    public WebElement addUserBtn;


    @FindBy(xpath = "//a[@title='Users']")
    public WebElement usersBtn;

    @FindBy(xpath = "(//a[@class='btn btn-primary'])[3]")
    public WebElement addUsersAgain;



    @FindBy(xpath = "(//i[@class='icon-remove icon-grid'])[1]")
    public WebElement deleteUsers1;


    @FindBy(xpath = "(//a[@class='btn btn-danger'])[1]")
    public WebElement deleteNow;


//    @FindBy(xpath = "//a[@class='brand']")
//    public WebElement adminPage;
//
//    @FindBy(xpath = "(//div[@class='hidden-phone']/a)[2]")
//    public WebElement clickAddUsers;



    public AddUserPage creatNewUser(){
        elementActions.sendKeys(firstNameInput,mock.generateMockFirstname());
        elementActions.sendKeys(secondName,mock.generateMockLasttname());
        elementActions.sendKeys(emailInput,mock.generateMockEmail());
        elementActions.sendKeysWithClear(UserInput,mock.generateMockUsername())
                .sendKeys(password,mock.generateMockPassword())
                .click(addUserBtn)
                .click(usersBtn)
                .click(addUsersAgain);

return this;
    }
    public AddUserPage returnToUsersPage(){
        elementActions.click(usersBtn);

        return this;
    }

    public AddUserPage deleteUser(){
        elementActions.click(deleteUsers1);
        elementActions.click(deleteNow);
        return this;
    }



//    public AddUserPage clickMeth(){
//        elementActions.click(adminPage);
//        elementActions.click(clickAddUsers);
//        return this;
//    }







}
