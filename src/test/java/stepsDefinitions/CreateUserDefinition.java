package stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Data;
import questions.ValidateUser;
import tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateUserDefinition {


    @Given("that the user enters the Utest page to register")
    public void that_the_user_enters_the_utest_page_to_register() {
        theActorCalled("actor").wasAbleTo(OpenPageTask.utest());
    }

    @When("he registers his personal information")
    public void he_registers_his_personal_information(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(FillOutPage.form(data));
    }

    @When("registers his location")
    public void registers_his_location(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(LocationTask.form(data));
    }

    @When("register their devices")
    public void register_their_devices(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(DevicesPage.form(data));
    }

    @When("register his password")
    public void register_his_password(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(PassFormTask.final2(data));
    }

    @Then("he verifies the registration of the new user")
    public void he_verifies_the_registration_of_the_new_user() {
        theActorInTheSpotlight().should(seeThat(ValidateUser.create()));
    }

}