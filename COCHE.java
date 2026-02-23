public class COCHE{
    string color;
    string modelo;
    string velocidad;
    public COCHE(string color, string modelo) {
        this.color = color;
        this.modelo = modelo;
        this.velocidad = 0;
    }
    public void ACELERAR(int incremento){
        this.velocidad += incremento;
        system.out.println("El coche ahora va a " + this.velocidad + "KM/H.");
    }
    public void FRENAR(int decremento){
        this.velocidad -= decremento;
        if(this.velocidad < 0){
            this.velocidad = 0;
        }
        system.out.println("El coche ahora va a " + this.velocidad + "KM/H.");
    }
    public string OBTENERDESCRIPCION(){
        return "Este es un " + this.modelo + " de color " + this.color + ".";
    }
    public static void main(string[] args){
        COCHE COCHE1 = new COCHE("Rojo", "Ford Mustang");
        COCHE COCHE2 = new COCHE("Azul", "Tesla Model S");
        system.out.println(COCHE1.OBTENERDESCRIPCION());
        COCHE1.ACELERAR(50);
        COCHE1.FRENAR(10);
        system.out.println("\n" + COCHE2.OBTENERDESCRIPCION());
        COCHE2.ACELERAR(100);
    }
}
