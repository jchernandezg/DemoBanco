package com.parabank.qa.stepsDefinitions;

import com.parabank.qa.Tasks.Register;
import com.parabank.qa.UserInterfaces.RegisterUI;
import com.parabank.qa.models.RegistroModel;
import com.parabank.qa.questions.Message;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class registroSteps {

    @DataTableType
    public RegistroModel registroModel(Map<String,String> entry){
        return RegistroModel.registroModel(entry);
    }

    @Given("El usuario ingresa a la pagina del banco")
    public void elUsuarioIngresaALaPaginaDelBanco() {
        theActorInTheSpotlight().attemptsTo(Open.url(RegisterUI.URL_REGISTER));
    }
    @When("registra los datos en el formulario")
    public void registraLosDatosEnElFormulario(List<RegistroModel> nuevoregistro) {
        theActorInTheSpotlight().attemptsTo(Register.newUser(nuevoregistro.get(0)));
    }
    @Then("deberia ver el mensaje de bienvenida")
    public void deberiaVerElMensajeDeBienvenida() {
        theActorInTheSpotlight().should(seeThat(Message.isVisible(), Matchers.is(true)));
    }
}
