package com.parabank.qa.UserInterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final String URL_HOME = "https://parabank.parasoft.com/parabank/index.htm";
    public static final Target USERNAME_TBOX = Target.the("Caja de texto para usuario")
            .locatedBy("//input[@name='username']");
    public static final Target USERPASS_TBOX = Target.the("Caja de texto para password")
            .locatedBy("//input[@name='password']");

    public static final Target LOGIN_BUTTON = Target.the("Boton para realizar el login")
            .locatedBy("//*[@class='button' and @type='submit']");

    public static final Target WELCOME_USER_TEXT = Target.the("Mensaje de bienvenida al usuario")
            .locatedBy("//*[text()='{0}']");

}
