class Poligono {
    public double area() {
        return 0d;
    }
    public double perimetro() {
        return 0d;
    }
    public String toString() {
        return "Poligono";
    }
}

class Cuadrilatero extends Poligono {
    private int alfa, beta;
    private float a, b;
    private float base, altura;

    public void setBase(){}

    public void setAltura(){}

    public String toString() {
        return "Cuadrilatero";
    }
}
class Triangulo extends Poligono {
    private int alfa, beta, gama;
    private float a, b, c;
    private float base, altura;

    public void setBase(){}

    public void setAltura(){}

    public String toString(){
        return "Triangulo";
    }
}

public class MetodoPolimorfico {
    public static void main (String [] arg){
        Poligono poligono = new Poligono();
        getPoligono(poligono);
        poligono = new Triangulo();
        getPoligono(poligono);
        poligono = new Cuadrilatero();
        getPoligono(poligono);
    }

    public static void getPoligono(Poligono p){
        if (p instanceof Triangulo){
            System.out.println("El objeto es un triangulo");
        } else {
            if (p instanceof Cuadrilatero){
                System.out.println("El objeto es un cuadrilatero");
            } else {
                System.out.println("El objeto es un poligono");
            }
        }
    }
}
