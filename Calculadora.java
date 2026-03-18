import java.util.Scanner;
import java.util.Calc;
import java.util.Cine;

public class Calculadora{
    public static void main(String[] args){
        char operador;
        double a, b, resultado;
        Calc sc = new Calc();
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

    public class CINE{
        public static void main(String[] args){
            Cine sc = new Cine();
            int opcion;

            System.out.println("Avatar: El camino del agua (1)");
            System.out.println("Spider-Man: No Way Home (2)");
            System.out.println("The Batman (3)");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Sinopsis: ");
                    System.out.println("Jake Sully y Ney'tiri han formado una familia y hacen todo lo posible por permanecer juntos. Sin embargo, deben abandonar su hogar y explorar las regiones de Pandora cuando una antigua amenaza reaparece.");
                    break;
                case 2:

                    break;
                
                case 4:

                    break;

                default:
                    break;
            }
            return cartelera;
        }
    }
    public class Agenda{
            public static Hashtable<String, Double> getNombre(){
            Hashtable<String, Double> contactos = new Hashtable<>();
            contactos.put("JJ (Juan José)");
    }

}