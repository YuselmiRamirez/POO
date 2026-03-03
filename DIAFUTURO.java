import java.util.Scanner;

public class DIAFUTURO{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] semana = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};

        System.out.print("Ingrese el año actual: ");
        int año = sc.nextInt();
        
        System.out.print("Ingrese mes (1-12): ");
        int mes = sc.nextInt();
        
        System.out.print("Ingrese el día: ");
        int dia = sc.nextInt();

        int m = mes;
        int a = año;
        if (m < 3) {
            m += 12;
            a -= 1;
        }

        int k = a % 100; 
        int j = a / 100;
        
        int h = (dia + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        
        int fecha = (h + 6) % 7; // domingo empezando en 0

        int indiceFuturo = (fecha + 3) % 7;
        int añoFuturo = año + 3;

        System.out.println("Fecha ingresada: " + dia + "/" + mes + "/" + año);
        System.out.println("Ese dia cae en: " + semana[fecha]);
        System.out.println("En tres años (" + añoFuturo + ") sera: " + semana[indiceFuturo]);

        sc.close();
    }
}