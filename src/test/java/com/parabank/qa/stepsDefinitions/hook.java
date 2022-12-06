package com.parabank.qa.stepsDefinitions;

import com.parabank.qa.UserInterfaces.HomeUI;
import com.parabank.qa.UserInterfaces.RegisterUI;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class hook {
    @Managed
    WebDriver driver;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("demoBank").whoCan(BrowseTheWeb.with(driver));
    }

    @Given("El usuario registrado accede a la pagina de login")
    public void elUsuarioRegistradoAccedeALaPaginaDeLogin() {
        theActorInTheSpotlight().attemptsTo(Open.url(HomeUI.URL_HOME));
    }

}
