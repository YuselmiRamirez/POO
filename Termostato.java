public class Termostato {
    private double temperaturaActual;
    public Termostato() {
        this.temperaturaActual = 20.0;
        }

public void setTemperatura(double nuevaTemperatura) {
    if (nuevaTemperatura >= -50.0 && nuevaTemperatura <= 100.0) {
        this.temperaturaActual = nuevaTemperatura;
        System.out.println("Temperatura inicial: 20.0 grados celsius");
        System.out.println("Temperatura ajustada a: " + this.temperaturaActual + " grados celsius");
    } else {
        System.out.println("Error: " + nuevaTemperatura + " está fuera del rango operativo (-50 a 100).");
    }
}
public static void main(String[] args) {
    Termostato sala1 = new Termostato(); 
    Termostato sala2 = new Termostato();

    sala1.setTemperatura(25.5);
    sala2.setTemperatura(150.0);
    }
}