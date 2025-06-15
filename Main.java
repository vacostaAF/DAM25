package org.example;
public class Main {
    public static void main(String[] args) {

        System.out.println("Resultado del original:");
        org.example.CalcularEdad.mostrarDatos("Antonio", 30, 60);
        System.out.println();


        System.out.println("Resultado de los dos métodos por separado:");
        org.example.CalcularEdad.mostrarDatosPersonales("Antonio", 30);
        org.example.CalcularEdad.calculoEdad("Antonio", 30,60);
        System.out.println();


        System.out.println("Resultado de los dos individuales:");
        org.example.CalcularEdad.sumarAnios("Antonio", 30, 60);
    }
}