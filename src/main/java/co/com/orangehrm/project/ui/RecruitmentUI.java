package co.com.orangehrm.project.ui;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentUI  extends PageObject{

    public static final Target NAV_RECRUITMENT = Target.the("Recruitment menu option")
            .located(By.xpath("//a[normalize-space()='Recruitment']")
            );


    public static final Target BUTTON_ADD = Target.the("Add button")
            .located(By.xpath("//button[normalize-space()='Add']"));


    /* Fill out the form*/
    public static final Target FIRST_NAME = Target.the("First name field")
            .located(By.xpath("//input[@name='firstName']"));

    public static final Target MIDDLE_NAME = Target.the("Middle name field")
            .located(By.xpath("//input[@name='middleName']"));

    public static final Target LAST_NAME = Target.the("Last name field")
            .located(By.xpath("//input[@name='lastName']"));

    public static final Target VACANCY_DROPDOWN = Target.the("Vacancy dropdown")
            .located(By.xpath("//div[@class='oxd-select-text-input']"));

    public static final Target VACANCY_OPTION_SOFTWARE_ENGINEER = Target.the("Option Software Engineer")
            .located(By.xpath("//span[normalize-space()='Software Engineer']"));

    public static final Target EMAIL = Target.the("Email field")
            .located(By.xpath("//label[normalize-space()='Email']/following::input[@placeholder='Type here'][1]"));

    public static final Target CONTACT_NUMBER = Target.the("Contact number field")
            .located(By.xpath("//label[normalize-space()='Contact Number']/following::input[@placeholder='Type here'][1]"));


    public static final Target CURRICULUM_UPLOAD = Target.the("Curriculum upload field")
            .located(By.xpath("//input[@type='file' and @class='oxd-file-input']"));

    public static final Target KEYWORDS = Target.the("Keywords field")
            .located(By.xpath("//input[@placeholder='Enter comma seperated words...']"));


    public static final Target DATE_OF_APPLICATION = Target.the("Date of Application field")
            .located(By.xpath("//div[contains(@class, 'oxd-date-input')]//input[@class='oxd-input oxd-input--active']"));


    public static final Target NOTES = Target.the("Notes field")
            .located(By.xpath("//textarea[@placeholder='Type here']"));

    public static final Target CONSENT_CHECKBOX = Target.the("Consent to keep data checkbox")
            .located(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));

    public static final Target SAVE_BUTTON = Target.the("Save button")
            .located(By.xpath("//button[@type='submit' and text()=' Save ']"));



}
