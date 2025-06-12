package com.eleduarg;

public class AuthFactory {

    public static AuthStrategy getAuthMethod(String metodo) {
        switch (metodo.toLowerCase()) {
            case "password": return new PassStrategy();
            default: throw new IllegalArgumentException("Método de autenticación no válido.");
        }
    }

}
