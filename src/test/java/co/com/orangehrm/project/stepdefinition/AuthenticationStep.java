package co.com.orangehrm.project.stepdefinition;

import co.com.orangehrm.project.questions.TheDashboardTitle;
import co.com.orangehrm.project.tasks.Login;
import co.com.orangehrm.project.utils.WaitUtils;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.util.EnvironmentVariables;
import org.hamcrest.Matchers;

import static co.com.orangehrm.project.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AuthenticationStep {


    private static EnvironmentVariables environmentVariables;
    private String user;
    private String password;



    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} opens the OrangeHRM website")
    public void opensTheTestWebsite(String actorName) {
        theActorCalled(actorName).attemptsTo(
                Open.url(EnvironmentSpecificConfiguration.from(environmentVariables)
                        .getProperty(WEB_URL))
        );


    }

    @When("enters their credentials")
    public void enterTheCredentials() {
        user = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USER);
        password = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PASSWORD);
        theActorCalled(ACTOR).attemptsTo(
                Login.authentication(user, password)
        );
    }

    @Then("should see the homepage")
    public void itWillDisplayTheHomeAndWaitForAValidation() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheDashboardTitle.isVisible(),
                        Matchers.equalTo(TITLE)
                )
        );
    }

}
