class Notificacion {
    protected String emisor;
    protected String mensaje;

    public Notificacion(String emisor, String mensaje) {
        this.emisor = emisor;
        this.mensaje = mensaje;
    }

    public void mostrar() {
        System.out.println(emisor + ": " + mensaje);
    }
}

class Log extends Notificacion {
    private int puntosExperiencia;

    public Log(String emisor, String mensaje, int puntosExperiencia) {
        super(emisor, mensaje);
        this.puntosExperiencia = puntosExperiencia;
    }

    @Override
    public void mostrar() {
        System.out.println("LOGRO DESBLOQUEADO!! " + emisor +
                " dice: " + mensaje +
                ". Recompensa: mas " + puntosExperiencia + " pts");
    }
}

class AlertaMision extends Notificacion {
    private String nivelDificultad;

    public AlertaMision(String emisor, String mensaje, String nivelDificultad) {
        super(emisor, mensaje); 
        this.nivelDificultad = nivelDificultad;
    }

    @Override
    public void mostrar() {
        System.out.println("NUEVA MISION de " + emisor +
                ": " + mensaje +
                ". Dificultad: " + nivelDificultad);
    }
}

public class JuegoRol {
    public static void main(String[] args) {
        
        Log logro = new Log("Kirby", "Has derrotado al dragón", 500);
        AlertaMision mision = new AlertaMision("Rey", "Salva al reino", "Alta");

        logro.mostrar();
        mision.mostrar();
    }
}
