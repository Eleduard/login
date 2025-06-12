package com.eleduarg;

public class PassStrategy implements AuthStrategy{

    @Override
    public void autenticar(String nombre, String password) {

        System.out.println("nombre = " + nombre + " - password = " + password);

    }

}
