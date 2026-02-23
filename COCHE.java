public class COCHE {
    String color;
    String modelo;
    int velocidad;

    public COCHE(String color, String modelo) {
        this.color = color;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public void ACELERAR(int incremento) {
        this.velocidad += incremento;
        System.out.println("El coche ahora va a " + this.velocidad + " KM/H.");
    }

    public void FRENAR(int decremento) {
        this.velocidad -= decremento;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
        System.out.println("El coche ahora va a " + this.velocidad + " KM/H.");
    }

    public String OBTENERDESCRIPCION() {
        return "Este es un " + this.modelo + " de color " + this.color + ".";
    }

    public static void main(String[] args) {
        COCHE COCHE1 = new COCHE("Rojo", "Ford Mustang");
        COCHE COCHE2 = new COCHE("Azul", "Tesla Model S");

        System.out.println(COCHE1.OBTENERDESCRIPCION());
        COCHE1.ACELERAR(50);
        COCHE1.FRENAR(10);

        System.out.println("\n" + COCHE2.OBTENERDESCRIPCION());
        COCHE2.ACELERAR(100);
    }
}