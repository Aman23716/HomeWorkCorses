package uiTests;


import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;

import static org.testng.Assert.*;

import com.talentLMS.UI.helper.WebElementActions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;


public class LoginTests extends BaseUiTests {

    @BeforeMethod
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
    }


//    @Test(description = "Verify to ")
//    public void loginWithInvalidUsernameTest(){
//        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
//        loginPage.fillUpUsernameAndPass("Name", "Password123");
//
//        String expectedErrMes="Your username or password is incorrect. Please try again, making sure that CAPS LOCK key is off.";
//        assertEquals(loginPage.loginErrMess.getText(),expectedErrMes);
//        webElementActions.pause(5000);
//
//
//
//    }

    @Test(description = "Verify that user can login with valid credentials")
    public void loginWithValidCredentials() {
        loginPage.fillUpUsernameAndPass("amanzadr", "amanzadr");
        assertEquals(adminPage.users.getText(), "USERS");
        assertEquals(driver.getCurrentUrl(), "https://justtestforaman.talentlms.com/dashboard");

    }
//    @Test(description = "Verify that user can not login with invalid username and valid password")
//
//    public void loginWithValidCredentialsTest1(){
//        loginPage.fillUpUsernameAndPass("Testamanzadr","amanzadr");
//    assertEquals(driver.findElement(By.xpath("//div[@class='toast-message']")).getText(),"Your username or password is incorrect. Please try again, making sure that CAPS LOCK key is off.");
//}
//    @Test(description = "Verify that user can not login with valid username and invalid password")
//
//    public void loginWithValidCredentialsTest2(){
//        loginPage.fillUpUsernameAndPass("amanzadr","asfaamanzadr");
//        assertEquals(driver.findElement(By.xpath("//div[@class='toast-message']")).getText(), "Your username or password is incorrect. Please try again, making sure that CAPS LOCK key is off.");
//    }

    @Test(description = "verify that Admin can create new user in TalentLMs")

    public void createNewUser() {
        loginPage.fillUpUsernameAndPass("amanzadr", "amanzadr");
        adminPage.clickAddUserBtn();
        assertEquals(driver.getCurrentUrl(), "https://justtestforaman.talentlms.com/user/create");
        addUserPage.creatNewUser();
        webElementActions.pause(3000);
        addCourses.clickMeth();
        addCourses.fillCoursesName();
        addCourses.clickSaveAndSelectBtn();
        addCourses.clickToCheckCourseName();
        webElementActions.pause(3000);
        addCourses.checkStudentCourse();
        assertEquals(addCourses.studentCourseName.getText(),"Amazon's Courses");

//        addUserPage.creatNewUser();
//        webElementActions.pause(3000);
//        addUserPage.creatNewUser();
//        webElementActions.pause(3000);

//
//        addUserPage.returnToUsersPage();
//        assertEquals(driver.getCurrentUrl(),"https://justtestforaman.talentlms.com/user/index");
//        webElementActions.pause(3000);
//
//         addUserPage.deleteUser();
//        webElementActions.pause(2000);
//        addUserPage.deleteUser();
//        webElementActions.pause(2000);
//        addUserPage.deleteUser();
//        webElementActions.pause(2000);


    }

// @AfterMethod
//
//    public void Close(){
//        Driver.closeDriver();
// }


}
