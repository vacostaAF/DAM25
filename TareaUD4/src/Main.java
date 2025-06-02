public class Main {
    /**
     * Refactorizamos diferenciando bien las funciones en dos metodos: uno para sumar anio con
     * los siguientes parámetros:
     * @param edad
     * @param anios
     * @return
     */
    public static int sumarAnios(int edad, int anios){
        return edad + anios;
    }

    /**
     * Y otro donde se muestren los datos. Lo ponemos en static para que se pueda usar desde
     * el main. Sus parametros son:
     * @param nombre
     * @param edad
     * @param anios
     */
    public static void mostrarDatos(String nombre, int edad, int anios){
        System.out.println("Nombre:"+ nombre+"\nEdad:"+ edad+
                "\nDentro de: " + anios + " años, " + nombre + " tendrá "+ sumarAnios(edad,anios)
                + " años.");
    }
    public static void main(String[] args) {
        mostrarDatos("Miguel",33, 10);
    }
}