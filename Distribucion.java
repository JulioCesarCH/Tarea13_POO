package Tarea13;

public class Distribucion extends Trabajador{
    protected String region;
    protected String actividad;

    public Distribucion(int dni, String nombres, String apellidos, int edad, double salario) {
        super(dni,nombres,apellidos,edad,salario);
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

}
