package com.parabank.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.parabank.qa.UserInterfaces.RegisterUI.WELCOME_MESSAGE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Message implements Question<Boolean> {

    private String mensaje;

    @Override
    public Boolean answeredBy(Actor actor) {
        mensaje = "Welcome "+ actor.recall("usuario");
        actor.attemptsTo(
                WaitUntil.the(WELCOME_MESSAGE.of(mensaje),isCurrentlyVisible()));
        return Visibility.of(WELCOME_MESSAGE.of(mensaje)).answeredBy(actor);
    }

    public static Message isVisible(){
        return new Message();
    }
}
