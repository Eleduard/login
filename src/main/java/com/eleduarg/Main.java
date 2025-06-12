package com.eleduarg;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Login login = new Login();
        login.setNombre("eleduarg");
        login.setPassword("1234");

        AuthStrategy metodo = AuthFactory.getAuthMethod("password");
        metodo.autenticar(login.getNombre(), login.getPassword());
    }
}