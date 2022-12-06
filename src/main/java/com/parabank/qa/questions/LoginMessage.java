package com.parabank.qa.questions;

import com.parabank.qa.UserInterfaces.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class LoginMessage implements Question<Boolean> {
    private String mensaje;
    @Override
    public Boolean answeredBy(Actor actor) {
        mensaje = " " + actor.recall("UserName");
        actor.attemptsTo(
                WaitUntil.the(HomeUI.WELCOME_USER_TEXT.of(mensaje),isCurrentlyVisible())
        );
        return Visibility.of(HomeUI.WELCOME_USER_TEXT.of(mensaje)).answeredBy(actor);
    }

    public static LoginMessage isVisible(){
        return new LoginMessage();
    }
}
