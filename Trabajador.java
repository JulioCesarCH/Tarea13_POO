package Tarea13;

public class Trabajador {
    protected int dni;
    protected String nombres;
    protected String apellidos;
    protected int edad;
    protected double salario;

    public Trabajador(int dni, String nombres, String apellidos, int edad, double salario) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    public void clasificacion(int edad){
        if (this.edad<=21)
            System.out.println("No Calificado");
        else if (this.edad>=22 && this.edad<=35)
            System.out.println("Semi-calificado");
        else
            System.out.println("Calificado");

    }
    public double salarioNeto(double porcentaje,double salario){
       return this.salario = salario * (1 + porcentaje/100);
    }
    public int getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }
}
