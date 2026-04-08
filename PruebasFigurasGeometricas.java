abstract class Poligono {
    public abstract double area();

    public abstract double perimetro();

    public String toString() {
        return "Poligono";
    }
}

class Cuadrilatero extends Poligono {
    private int alfa, beta;
    private float a, b;
    private float base, altura;

    public double area() {
        return base * altura;
    }

    public double perimetro(){
        return 2*a*b;
    }

    public String toString() {
        return "Cuadrilatero";
    }
}
class Triangulo extends Poligono {
    private int alfa, beta, gama;
    private float a, b, c;
    private float base, altura;

    public double area(){
        return (base*altura)/2;
    }

    public double perimetro(){
        return a*b*c;
    }

    public String toString(){
        return "Triangulo";
    }
}

public class PruebasFigurasGeometricas {
    public static void main(String [] args){
        Poligono poligono;

        poligono = new Triangulo();
        System.out.println(poligono);
        poligono = new Cuadrilatero();
        System.out.println(poligono);
    }
}
