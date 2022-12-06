package com.parabank.qa.UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterUI {
    public static final String URL_REGISTER = "https://parabank.parasoft.com/parabank/register.htm";
    public static final Target FIRST_NAME_TBOX = Target.the("Caja de texto para nombre del usuario")
            .locatedBy("//*[@id='customer.firstName']");
    public static final Target LAST_NAME_TBOX = Target.the("Caja de texto para apellido del usuario")
            .locatedBy("//*[@id='customer.lastName']");
    public static final Target ADDRESS_TBOX = Target.the("Caja de texto para direccion del usuario")
            .locatedBy("//*[@id='customer.address.street']");
    public static final Target CITY_TBOX = Target.the("Caja de texto para ciudad del usuario")
            .locatedBy("//*[@id='customer.address.city']");
    public static final Target STATE_TBOX = Target.the("Caja de texto para estado del usuario")
            .locatedBy("//*[@id='customer.address.state']");
    public static final Target ZIP_CODE_TBOX = Target.the("Caja de texto para codigo postal del usuario")
            .locatedBy("//*[@id='customer.address.zipCode']");
    public static final Target SSN_TBOX = Target.the("Caja de texto para documento del usuario")
            .locatedBy("//*[@id='customer.ssn']");
    public static final Target USERNAME_TBOX = Target.the("Caja de texto para identificador del usuario")
            .locatedBy("//*[@id='customer.username']");
    public static final Target PASSWORD_TBOX = Target.the("Caja de texto para identificador del usuario")
            .locatedBy("//*[@id='customer.password']");
    public static final Target CONFIRM_PASS_TBOX = Target.the("Caja de texto para identificador del usuario")
            .locatedBy("//*[@id='repeatedPassword']");
    public static final Target REGISTER_BUTTON = Target.the("Caja de texto para identificador del usuario")
            .locatedBy("//input[@type='submit' and @value='Register']");

    public static final Target WELCOME_MESSAGE = Target.the("Mensaje de bienvenida de registro")
            .locatedBy("//*[@class='title' and text() = '{0}']");

}
