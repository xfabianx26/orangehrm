package co.com.orangehrm.project.tasks;

import co.com.orangehrm.project.ui.LoginUI;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.util.EnvironmentVariables;

@AllArgsConstructor
public class Login implements Task {

    private static EnvironmentVariables environmentVariables;
    private String user;
    private String password;




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(LoginUI.INPUT_USER_NAME),
                Enter.theValue(password).into(LoginUI.INPUT_PASSWORD),
                Click.on(LoginUI.BUTTON_LOGIN)
        );
    }


    public static Login authentication(String user, String password) {
        return Tasks.instrumented(Login.class, user, password);
    }
}
