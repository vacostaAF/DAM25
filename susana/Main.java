package org.example;
public class Main {
    public static void main(String[] args) {

        //llamando al metodo original
        System.out.println("Impresión del método original:");
        Ejercicio2.mostrarDatos("Susana", 42, 20);
        System.out.println();

        //llamando a los dos metodos individualmente
        System.out.println("Impresión con los dos métodos por separado:");
    Ejercicio2.mostrarDatosPersonales("Susana", 42);
    Ejercicio2.calculoEdad("Susana", 42,20);
        System.out.println();

    // llamando al metodo que auna los dos
        System.out.println("Impresión con el método que auna los dos individuales:");
    Ejercicio2.sumarAnios("susana", 42, 20);

    }
}