package com.eleduarg;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Login login = new Login();
        login.setNombre("eleduarg");
        login.setPassword("1234");
        login.setAuthType("password");

        AuthStrategy metodo = AuthFactory.getAuthMethod(login.getAuthType());
        metodo.autenticar(login.getNombre(), login.getPassword());
    }
}