// Realizar una impresion de numeros primos usando while-do y do-while
import java.util.Scanner;

public class PRIMOS{
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor limite de numeros primos a mostrar");
        int tope = sc.nextInt();

        int contador = 0;
        int numero = 2;

        while(contador < tope){
            int divisor = 2;
            boolean primo = true;

            do{
                if(numero % divisor == 0){
                    primo = false;
                    break;
                }
                divisor++;
            } while(divisor < numero && primo);
            if(primo){
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
        sc.close();
    }
}
