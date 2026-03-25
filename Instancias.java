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

public class Instancias {
    public static void main(String [] args){
        Gerente gerente = new Gerente();
        if (gerente instanceof Gerente){
            System.out.println("Instancia de Gerente");
        }
        if (gerente instanceof Empleado){
            System.out.println("Instancia de Empleado");
        }
        if (gerente instanceof Object){
            System.out.println("Instancia de Object");
        }
    }
}