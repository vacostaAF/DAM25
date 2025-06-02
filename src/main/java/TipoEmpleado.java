public class TipoEmpleado {
    private String tipo;
    private double horaBase;
    // Constructor
    TipoEmpleado(String tipo,double horaBase){
        this.tipo = tipo;
        this.horaBase = horaBase;
    }
    // Getters
    public String getTipo() {
        return tipo;
    }
    public double getHoraBase() {
        return horaBase;
    }
    public double calculoHoras(int horas, int horasextra) {
        if (tipo.equals("Supervisor")) {
            return horas + horasextra * 1.40;
        }
        if (tipo.equals("Dependiente")) {
            return horas + horasextra * 1.75;
        }
        return horas + horasextra * 1.5;
    }
}
