package com.parabank.qa.Tasks;

import com.parabank.qa.models.RegistroModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.parabank.qa.UserInterfaces.RegisterUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Register implements Task {

    RegistroModel newRegister;

    public Register(RegistroModel newRegister) {
        this.newRegister = newRegister;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(REGISTER_BUTTON,isClickable()),

                Enter.theValue(newRegister.getNombre()).into(FIRST_NAME_TBOX),
                Enter.theValue(newRegister.getApellido()).into(LAST_NAME_TBOX),
                Enter.theValue(newRegister.getDireccion()).into(ADDRESS_TBOX),
                Enter.theValue(newRegister.getCiudad()).into(CITY_TBOX),
                Enter.theValue(newRegister.getEstado()).into(STATE_TBOX),
                Enter.theValue(newRegister.getCodPostal()).into(ZIP_CODE_TBOX),
                Enter.theValue(newRegister.getDocumento()).into(SSN_TBOX),
                Enter.theValue(newRegister.getUsuario()).into(USERNAME_TBOX),
                Enter.theValue(newRegister.getPassword()).into(PASSWORD_TBOX),
                Enter.theValue(newRegister.getPassword()).into(CONFIRM_PASS_TBOX),
                Click.on(REGISTER_BUTTON)
        );
        actor.remember("usuario",newRegister.getUsuario());
    }

    public static Register newUser(RegistroModel newRegister){
        return Tasks.instrumented(Register.class,newRegister);
    }

}
