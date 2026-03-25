class Empleado {
    private String nombre;
    private int numEmpleado, sueldo;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNumEmpleado(int numEmpleado){
        this.numEmpleado = numEmpleado;
    }
    public int getNumEmpleado(){
        return this.numEmpleado;
    }
    public void setSueldo(int sueldo){
        if (sueldo >= 0) {
            this.sueldo = sueldo;
        }
    }
    public int getSueldo(){
        return this.sueldo;
    }
    public void aumentarSueldo(int porcentaje){
        sueldo += (int)(sueldo * porcentaje / 100);
    }
}

class Gerente extends Empleado {
    private int presupuesto;
    public void setPresupuesto(int presupuesto){
        this.presupuesto = presupuesto;
    }
    public int getPresupuesto(){
        return this.presupuesto;
    }
    void asignarPresupuesto(int p){
        presupuesto = p;
    }
}

public class PruebaEmpleado {
    public static void main (String[] args){
        Gerente gerente = new Gerente();
        gerente.setNombre("Luis Aguilar");
        gerente.setNumEmpleado(8524);
        gerente.setSueldo(16000);
        System.out.println("Nombre: " + gerente.getNombre());
        System.out.println("Número de Empleado: " + gerente.getNumEmpleado());
        System.out.println("Sueldo: " + gerente.getSueldo());
        grente.aumentarSueldo(10);
        System.out.println("Nuevo sueldo: " + gerente.getSueldo());
        gerente.setPresupuesto(50000);
        System.out.println("Presupuesto: " +gerente.getPresupuesto());
        gerente.asignarPresupuesto(65000);
        System.out.println("Nuevo presupuesto: " + gerente.getPresupuesto());
    }
}