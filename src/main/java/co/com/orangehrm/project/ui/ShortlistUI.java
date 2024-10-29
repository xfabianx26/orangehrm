package co.com.orangehrm.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShortlistUI extends PageObject{


    public static final Target SHORTLIST_BUTTON = Target.the("Shortlist button")
            .located(By.xpath("//button[normalize-space()='Shortlist']"));



    public static final Target NOTES = Target.the("Notes field")
            .located(By.xpath("//textarea[@placeholder='Type here']"));

    public static final Target SAVE_BUTTON = Target.the("Save button")
            .located(By.xpath("//button[@type='submit' and contains(text(), 'Save')]"));
}
