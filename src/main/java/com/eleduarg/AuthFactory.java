package com.eleduarg;

public class AuthFactory {

    //creación de la clase factory (patrón factory)
    public static AuthStrategy getAuthMethod(String metodo) {
        switch (metodo.toLowerCase()) {
            case "password": return new PassStrategy();
            default: throw new IllegalArgumentException("Método de autenticación no válido.");
        }
    }

}
