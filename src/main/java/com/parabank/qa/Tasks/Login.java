package com.parabank.qa.Tasks;

import com.parabank.qa.UserInterfaces.HomeUI;
import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.parabank.qa.UserInterfaces.HomeUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Login implements Task, IsSilent {

    private String userId;
    private String userPass;

    public Login(String userId, String userPass) {
        this.userId = userId;
        this.userPass = userPass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOGIN_BUTTON,isClickable()),

                Enter.theValue(userId).into(USERNAME_TBOX),
                Enter.theValue(userPass).into(USERPASS_TBOX),
                Click.on(LOGIN_BUTTON)
        );
    }
    public static Login inTheApp(String userId, String userPass){
        return Tasks.instrumented(Login.class,userId,userPass);
    }

}
