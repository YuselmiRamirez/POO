import java.util.Hashtable;
import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        char operador;
        double a, b, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que operación deseas realizar? (Suma "+", Resta "-", Multiplicación "*", División "/")");
        operador = sc.next().charAt(0);

        System.out.println("Ingrese el primer valor (a): ");
        a = sc.nextDouble();
        System.out.println("Ingrese el segundo valor (b): ");
        b = sc.nextDouble();

        switch (operador){
            case '+':
                resultado = a + b;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operador no válido.");
        }
    }

    static class Hojas{


    }

    public class Cine{
        public static Hashtable<String, Double> getCartelera(){
            Hashtable<String, Double> cartelera = new Hashtable<>();

            cartelera.put("Avatar: El camino del agua", horario = 13:45);
            list.put("")
        }
    }

}