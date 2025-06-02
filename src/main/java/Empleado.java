public class Empleado {
    private String nombre;
    private int horas;
    private int horasextra;
    private TipoEmpleado tipo;

    public Empleado(String nombre, int horas, int horasextra, TipoEmpleado tipo) {
        this.nombre = nombre;
        this.horas = horas;
        this.horasextra = horasextra;
        this.tipo = tipo;
    }

    // Constructor


    public double getSueldo() {
        return tipo.getHoraBase() * tipo.calculoHoras(horas, horasextra);
    }
}
