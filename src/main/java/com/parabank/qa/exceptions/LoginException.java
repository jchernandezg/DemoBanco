package com.parabank.qa.exceptions;

public class LoginException extends AssertionError{
    public static final String LOGIN_FAIL = "Se ha producido un error al realizar el proceso de Login";
    public LoginException(String mensaje) {super(mensaje);}
    public LoginException(String mensaje, Throwable cause) {super(mensaje,cause);}

}
