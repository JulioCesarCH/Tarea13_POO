package Tarea13;

public class Produccion extends Trabajador{
    protected String turno;
    protected String actividad;

    public Produccion(int dni, String nombres, String apellidos, int edad, double salario) {
        super(dni,nombres,apellidos,edad,salario);
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

}
