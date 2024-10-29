package co.com.orangehrm.project.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Upload;

import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static co.com.orangehrm.project.ui.RecruitmentUI.*;



public class FillCandidateForm  implements Task {

    private  String firstName;
    private  String middleName;
    private  String lastName;
    private  String vacancy;
    private  String email;
    private  String contactNumber;
    private  String curriculumPath;
    private  String keywords;
    private String applicationDate;
    private  String notes;

    public FillCandidateForm(String firstName, String middleName, String lastName, String vacancy, String email, String contactNumber, String curriculumPath, String keywords, String notes) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.vacancy = vacancy;
        this.email = email;
        this.contactNumber = contactNumber;
        this.curriculumPath = curriculumPath;
        this.keywords = keywords;
        this.applicationDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-dd-MM"));
        this.notes = notes;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(FIRST_NAME),
                Enter.theValue(middleName).into(MIDDLE_NAME),
                Enter.theValue(lastName).into(LAST_NAME),
                Click.on(VACANCY_DROPDOWN),
                Click.on(VACANCY_OPTION_SOFTWARE_ENGINEER),
                Enter.theValue(email).into(EMAIL),
                Enter.theValue(contactNumber).into(CONTACT_NUMBER),
                Upload.theFile(Paths.get(curriculumPath)).to(CURRICULUM_UPLOAD),
                Enter.theValue(keywords).into(KEYWORDS),
                Click.on(DATE_OF_APPLICATION),
                Enter.theValue(notes).into(NOTES)

        );
    }


    public static FillCandidateForm withData(String firstName, String middleName, String lastName, String vacancy, String email, String contactNumber, String curriculum, String keywords, String notes) {
        return Tasks.instrumented(FillCandidateForm.class, firstName, middleName, lastName, vacancy, email, contactNumber, curriculum, keywords,notes);
    }


}
