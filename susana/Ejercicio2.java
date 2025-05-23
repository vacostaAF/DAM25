package org.example;
public class Ejercicio2 {


    //código original

    /**
     * Imprime nombre, edad actual y edad futura de una persona pasado ciertos años
     * @param nombre Nombre persona
     * @param edad Edad actual
     * @param anios Años que se suman a la edad actual
     */
    public static void mostrarDatos(String nombre, int edad, int anios){
        System.out.println("Nombre:"+ nombre);
        System.out.println("Edad:"+ edad);
        int aniosTotal =  edad + anios;
        System.out.println("Dentro de: " + anios + " años, " + nombre + " tendrá "+ aniosTotal + " años.");
    }

    //codigo refactorizado
    /**+
     * Imprime los datos basicos de una persona, nombre y edad actual
     * @param nombre nombre de la persona
     * @param edad edad actual
     */
    public static void mostrarDatosPersonales(String nombre, int edad){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: "+ edad);
    }

    /**
     * Imprime nombre, edad actual y edad futura de una persona pasado ciertos años
     * @param nombre nombre de la persona
     * @param edad edad actual
     * @param aniosPasan años que se suman a la edad actual
     */
    public static void calculoEdad(String nombre, int edad, int aniosPasan){
        int edadTotal = edad + aniosPasan;
        System.out.println("Dentro de: " + aniosPasan + " años, " + nombre + " tendrá " + edadTotal + " años.");
    }

    /**
     *  Imprime nombre, edad actual y edad futura de una persona pasado ciertos años
     * @param nombre nombre de la persona
     * @param edad edad actual
     * @param aniosPasan años que se suman a la edad actual
     */
    public static void sumarAnios(String nombre, int edad, int aniosPasan){
        mostrarDatosPersonales(nombre, edad);
        calculoEdad(nombre, edad, aniosPasan);

    }
    

}
