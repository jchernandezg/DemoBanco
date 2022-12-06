package com.parabank.qa.stepsDefinitions;

import com.parabank.qa.Tasks.Login;
import com.parabank.qa.exceptions.LoginException;
import com.parabank.qa.questions.LoginMessage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class loginSteps {
    private String userName = System.getProperty("name");
    private String userId = System.getProperty("user");
    private String userPass = System.getProperty("pass");


    @When("ingresa sus credenciales")
    public void ingresaSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(
                Login.inTheApp(userId,userPass)
        );
    }
    @Then("deberia ver el mensaje de ingreso")
    public void deberiaVerElMensajeDeIngreso() {
        theActorInTheSpotlight().remember("UserName",userName);
        theActorInTheSpotlight().should(seeThat(LoginMessage.isVisible(), Matchers.is(true))
                .orComplainWith(LoginException.class,LoginException.LOGIN_FAIL));
    }
}
