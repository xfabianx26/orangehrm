package co.com.orangehrm.project.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmationMessage {

    public static Question<String> text(Target confirmationElement) {
        return Text.of(confirmationElement).asString();
    }
}
