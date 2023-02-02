package uiTests;


import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.page.AddCourses1;
import com.talentLMS.UI.page.AddUserPage;
import com.talentLMS.UI.page.AdminPage;
import com.talentLMS.UI.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTests {



AdminPage adminPage;
    LoginPage loginPage;
    WebElementActions webElementActions;
    WebDriver driver;

    AddCourses1 addCourses;
    AddUserPage addUserPage;
    @BeforeClass
    public void setUpUiTest(){
        loginPage=new LoginPage();
        webElementActions = new WebElementActions();
        driver= Driver.getDriver();
        adminPage = new AdminPage();
        addUserPage = new AddUserPage();
        addCourses = new AddCourses1();
    }



}
