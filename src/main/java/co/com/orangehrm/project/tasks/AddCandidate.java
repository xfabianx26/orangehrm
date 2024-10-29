package co.com.orangehrm.project.tasks;


import co.com.orangehrm.project.ui.RecruitmentUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.orangehrm.project.ui.RecruitmentUI.NAV_RECRUITMENT;

public class AddCandidate  implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NAV_RECRUITMENT),
                Click.on(RecruitmentUI.BUTTON_ADD)
        );
    }
}
