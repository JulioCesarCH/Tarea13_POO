package Tarea13;

public class Main {
    public static void main(String[] args) {
        Trabajador t1 = new Trabajador(12345678,"julio","Cueva",28,1500);

        Distribucion distAlex = new Distribucion(321456789,"Alex","Cusqui",26,2000);
        distAlex.setRegion("Huanuco");
        distAlex.setActividad("Distribucion de Productos de Limpieza");


        Produccion prodFrancis= new Produccion(321456789,"Francis","Matos",20,1500);
        prodFrancis.setTurno("Diurno");
        prodFrancis.setActividad("Mantenimiento");

        //trabajador
        System.out.println("Trabajador----------------------");
        System.out.println("DNI: "+ t1.getDni());
        System.out.println("Nombres: "+ t1.getNombres());
        System.out.println("Apellidos: "+ t1.getApellidos());
        System.out.println("Edad: "+ t1.getEdad());
        System.out.println("Salario: "+ t1.getSalario());
        t1.clasificacion(t1.getEdad());
        System.out.println("Salario Neto: "+ t1.salarioNeto(10, t1.getSalario()));
        System.out.println("-------------------------------------");
        //Trabajador en Distribucion
        System.out.println("Trabajador Distribucion----------------------");
        System.out.println("DNI: "+ distAlex.getDni());
        System.out.println("Nombres: "+ distAlex.getNombres());
        System.out.println("Apellidos: "+ distAlex.getApellidos());
        System.out.println("Edad: "+ distAlex.getEdad());
        System.out.println("Salario: "+ distAlex.getSalario());
        t1.clasificacion(distAlex.getEdad());
        System.out.println("Salario Neto: "+ distAlex.salarioNeto(20, distAlex.getSalario()));
        System.out.println("---------");
        System.out.println("Region: "+ distAlex.getRegion());
        System.out.println("Actividad: "+ distAlex.getActividad());
        System.out.println("-------------------------------------");
        //Trabajador Produccion
        System.out.println("Trabajador Produccion----------------------");
        System.out.println("DNI: "+ prodFrancis.getDni());
        System.out.println("Nombres: "+ prodFrancis.getNombres());
        System.out.println("Apellidos: "+ prodFrancis.getApellidos());
        System.out.println("Edad: "+ prodFrancis.getEdad());
        System.out.println("Salario: "+ prodFrancis.getSalario());
        t1.clasificacion(prodFrancis.getEdad());
        System.out.println("Salario Neto: "+ prodFrancis.salarioNeto(20, prodFrancis.getSalario()));
        System.out.println("---------");
        System.out.println("Turno: "+ prodFrancis.getTurno());
        System.out.println("Actividad: "+ prodFrancis.getActividad());
        System.out.println("-------------------------------------");



    }
}
