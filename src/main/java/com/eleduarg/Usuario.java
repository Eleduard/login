package com.eleduarg;

import java.util.Map;

public class Usuario {

    private String userName;
    private String password;
    private Map<String, Object> atributosAdicionales;

    public Usuario(String userName, String password, Map<String, Object> atributosAdicionales) {
        this.userName = userName;
        this.password = password;
        this.atributosAdicionales = atributosAdicionales;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Object> getAtributosAdicionales() {
        return atributosAdicionales;
    }

    public void setAtributosAdicionales(Map<String, Object> atributosAdicionales) {
        this.atributosAdicionales = atributosAdicionales;
    }

}
