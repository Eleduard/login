package com.eleduarg;

public class UserSession {

    private static UserSession sesion;
    private String usuarioActual;

    private UserSession() {}

    public static UserSession getSesion() {
        if(sesion == null) {
            sesion = new UserSession();
        }
        return sesion;
    }

    public void login(String usuario) {
        this.usuarioActual = usuario;
    }

    public String getUsuarioActual() {
        return usuarioActual;
    }

    public void logout() {
        usuarioActual = null;
    }
}
