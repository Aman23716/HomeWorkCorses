package com.talentLMS;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.page.LoginPage;
import org.openqa.selenium.WebElement;

/**
 * @author Aman Omorbekov
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        System.out.println(ConfigReader.getProperty("browser"));
//
//
//        Driver.getDriver().get("https://www.amazon.com/");
//        Thread.sleep(3000);
//        Driver.closeDriver();

        Driver.getDriver().get("https://digitalnomads.talentlms.com/");
        LoginPage loginPage = new LoginPage();
        WebElementActions webElementActions = new WebElementActions();



        WebElement element = null;
//
//        WebElementActions webElementActions = new WebElementActions();
//        webElementActions.waitElementToBeClickAble(element)
//                .waitElementToBeDisplayed(element);
    }
}