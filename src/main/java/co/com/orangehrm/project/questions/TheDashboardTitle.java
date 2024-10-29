package co.com.orangehrm.project.questions;



import co.com.orangehrm.project.ui.LoginUI;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;



public class TheDashboardTitle {

    public static Question<String> isVisible() {
        return Text.of(LoginUI.DASHBOARD_TITLE).asString();
    }

}