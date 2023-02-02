package com.talentLMS.UI.page;

import com.talentLMS.UI.helper.WebElementActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.logging.XMLFormatter;

public class AddCourses1 extends BasePage {


    WebElementActions webElementActions;


    private WebDriver driver;

    @FindBy(xpath = "//a[@class='brand']")
    public WebElement adminPage;

    @FindBy(xpath = "(//div[@class='hidden-phone']/a)[2]")
    public WebElement clickAddUsers;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement CourseName;

    @FindBy(xpath = "//a[@class='select2-choice select2-default']")
    public WebElement category;

    @FindBy(xpath = "//div[@class='select2-result-label']")
    public WebElement sample;


    @FindBy(xpath = "//textarea[@name=\'description\']")
    public WebElement description;


    @FindBy(xpath = "//input[@name='submit_course']")
    public WebElement saveAndSelectBtn;


    @FindBy(xpath = "//i[@class='icon-plus icon-grid tl-toggle-user']")
    public WebElement plusBtn;


//    @FindBy(xpath = "//tr[@class='odd']")
//    public List<WebElement> allUserList;


//
//    @FindBy(xpath = "//a[text()='Learner']")
//    public WebElement Student;


    @FindBy(xpath = "(//td[@class=' tl-align-left hidden-phone']/a/span)[1]")
    public WebElement student;


    @FindBy(xpath = "//a[text()='Courses']")
    public WebElement studentCourses;


    @FindBy(xpath = "(//span[@class='tl-formatted-course-name'])[1]")
    public WebElement studentCourseName;


    public AddCourses1 clickMeth() {
        elementActions.click(adminPage);
        elementActions.click(clickAddUsers);
        return this;
    }

    public AddCourses1 clickSaveAndSelectBtn() {
        elementActions.click(saveAndSelectBtn);
        return this;


    }

    public AddCourses1 fillCoursesName() {
        elementActions.sendKeys(CourseName, "Amazon's Courses")
                .click(category)
                .click(sample)
                .sendKeys(description, "This is the best courses");


        return this;
    }

    public AddCourses1 clickToCheckCourseName() {
        elementActions.click(plusBtn);

        return this;


    }
    public AddCourses1 checkStudentCourse() {
        elementActions.click(student)
                .click(studentCourses);

        return this;


    }


}
