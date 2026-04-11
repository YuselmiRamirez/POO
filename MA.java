import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class MA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n 1.- Escribir");
            System.out.println(" 2.- Leer");
            System.out.println(" 3.- Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {

                System.out.print("Escribe una frase: ");
                String frase = sc.nextLine();

                try (FileWriter fw = new FileWriter("ranking_final.txt", true);
                     PrintWriter pw = new PrintWriter(fw)) {

                    pw.println(" " + frase);
                    pw.println("---------------------------");

                    System.out.println("¡Datos guardados con éxito!");

                } catch (IOException e) {
                    System.out.println("Error al escribir: " + e.getMessage());
                }

            }

            else if (opcion == 2) {

                String nombreArchivo = "ranking_final.txt";

                try (FileReader fr = new FileReader(nombreArchivo);
                     BufferedReader br = new BufferedReader(fr)) {

                    String linea;
                    System.out.println("--- CONTENIDO DEL ARCHIVO ---");

                    while ((linea = br.readLine()) != null) {
                        System.out.println(linea);
                    }

                } catch (IOException e) {
                    System.out.println("No se pudo leer el archivo: " + e.getMessage());
                }

            }

            else if (opcion == 3) {
                System.out.println("Hasta luego.");
            }

            else {
                System.out.println("Opción no válida");
            }

        } while (opcion != 3);

        sc.close();
    }
}
