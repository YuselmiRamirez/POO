import java.util.Scanner;

public class DIAFUTURO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] semana = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};

        System.out.println("Fecha futura en tres años");

        System.out.print("Ingrese mes (numero): ");
        int mes = sc.nextInt();

        int dias = 0;

        if (mes == 2) {
            dias = 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias = 30;
        } else if (mes >= 1 && mes <= 12) {
            dias = 31;
        } else {
            System.out.println("Mes no valido.");
            return;
        }

        System.out.print("Ingrese el dia (1-" + dias + "): ");
        int dia = sc.nextInt();

        if (dia < 1 || dia > dias) {
            System.out.println("El mes " + mes + " no tiene el dia " + dia);
            return;
        }

        System.out.print("¿Qué dia de la semana es esa fecha hoy? (1:Dom, 2:Lun, 3:Mar, 4:Mie, 5:Jue, 6:Vie, 7:Sab): ");
        int fecha = sc.nextInt();

        if (fecha < 1 || fecha > 7) {
            System.out.println("Índice de día de la semana no valido.");
            return;
        }

        int indice3 = (fecha + 3) % 7;

        System.out.println("Fecha: " + dia + " del mes " + mes);
        System.out.println("Día ingresado: " + semana[fecha]);
        System.out.println("En tres años será: " + semana[indice3]);

        sc.close();
    }
}