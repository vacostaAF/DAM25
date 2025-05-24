/**
 * Clase que contiene métodos para mostrar y calcular edad futura.
 */
public class DatosPersona {

    /**
     * Muestra el nombre y la edad actual de una persona.
     * @param nombre Nombre de la persona
     * @param edad Edad actual de la persona
     */
    public void mostrarDatos(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    /**
     * Calcula y muestra la edad futura de una persona después de ciertos años.
     * @param nombre Nombre de la persona
     * @param edad Edad actual
     * @param anios Años que se sumarán a la edad
     */
    public void sumarAnios(String nombre, int edad, int anios) {
        int edadFutura = edad + anios;
        System.out.println("Dentro de: " + anios + " años, " + nombre + " tendrá " + edadFutura + " años.");
    }

    /**
     * Método principal para probar los métodos.
     */
    public static void main(String[] args) {
        DatosPersona dp = new DatosPersona();
        dp.mostrarDatos("Guillermo", 20);
        dp.sumarAnios("Guillermo", 20, 5);
    }
}
