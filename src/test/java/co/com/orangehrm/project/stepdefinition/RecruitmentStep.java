package co.com.orangehrm.project.stepdefinition;


import co.com.orangehrm.project.tasks.FillCandidateForm;
import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

import static co.com.orangehrm.project.ui.RecruitmentUI.*;
import static co.com.orangehrm.project.utils.Constants.*;
import static co.com.orangehrm.project.utils.TempFile.createTempResumeFile;
import static co.com.orangehrm.project.utils.TempFile.deleteTempFiles;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RecruitmentStep {

    private String TEMP_FILE_PATH;

    @Before
    public void setTheStage() throws IOException {
        OnStage.setTheStage(new OnlineCast());
        TEMP_FILE_PATH = createTempResumeFile();
    }

    @After
    public void cleanUpTempFiles() {
        deleteTempFiles();
    }

    @When("navigates to the Recruitment section")
    public void navigateToRecruitmentSection() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(NAV_RECRUITMENT)
        );
    }

    @And("clicks on the Add button")
    public void clickOnAddButton() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(BUTTON_ADD)
        );
    }

    @And("fills out the candidate form with all required information")
    public void fillOutCandidateForm() {
        theActorInTheSpotlight().attemptsTo(
                FillCandidateForm.withData(
                        CANDIDATE_FIRST_NAME,
                        CANDIDATE_MIDDLE_NAME,
                        CANDIDATE_LAST_NAME,
                        CANDIDATE_VACANCY,
                        CANDIDATE_EMAIL,
                        CANDIDATE_CONTACT_NUMBER,
                        TEMP_FILE_PATH,
                        CANDIDATE_KEYWORDS,
                        CANDIDATE_NOTES
                )
        );
    }

    @Then("agrees to the data retention policy and submits the form")
    public void consentAndSaveForm() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CONSENT_CHECKBOX),
                Click.on(SAVE_BUTTON)
        );
    }

/*    @Then("{string} clicks on the Shortlist button")
    public void clickOnShortlistButton(String actor) {
        theActorCalled(actor).attemptsTo(
                Click.on(ShortlistUI.SHORTLIST_BUTTON)
        );
    }

    @And("{string} fills out the shortlist form with additional notes and saves it")
    public void fillOutShortlistFormWithNotesAndSave(String actor) {
        theActorCalled(actor).attemptsTo(
                Enter.theValue(ADDITIONAL_NOTES).into(RecruitmentUI.NOTES),
                Click.on(RecruitmentUI.SAVE_BUTTON)
        );
    }*/
}
