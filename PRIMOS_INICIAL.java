// Realizar una impresion de numeros primos usando while-do y do-while
import java.util.Scanner;

public class PRIMOS_INICIAL{
    static int contador = 2, y;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor limite de numeros primos a mostrar");
        int numero = sc.nextInt();

        for(int x = 1; x <= numero; x++){
            boolean a = false;

            while(!a){
                int y = 2;
                boolean b = true;

                while ((b) && (y < contador)){
                    if(contador % y == 0)
                        b = false;
                    else
                        y = y + 1;
                }

                if(b){
                    System.out.println(contador);
                    a = true;
                }

                contador++;
            }
        }
        sc.close();
    }
}
