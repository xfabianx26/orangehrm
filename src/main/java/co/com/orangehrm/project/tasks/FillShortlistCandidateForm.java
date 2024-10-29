package co.com.orangehrm.project.tasks;

import co.com.orangehrm.project.ui.ShortlistUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class FillShortlistCandidateForm implements Task {

    private String notes;

    public FillShortlistCandidateForm(String notes) {
        this.notes = notes;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ShortlistUI.SHORTLIST_BUTTON),
                WaitUntil.the(ShortlistUI.SHORTLIST_BUTTON, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(ShortlistUI.SHORTLIST_BUTTON)
        );
    }


    public static FillShortlistCandidateForm withNotes(String notes) {
        return new FillShortlistCandidateForm(notes);
    }
}
