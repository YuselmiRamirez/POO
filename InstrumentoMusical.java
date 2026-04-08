public interface InstrumentoMusical {
    void tocar();

    void afinar();

    String tipoInstrumento();
}

public class InstrumentoViento extends InstrumentoMusical {
    public void tocar() {
        System.out.println("Tocando instrumento de viento");
    }

    public void afinar() {
        System.out.println("Afinando el instrumento de viento");
    }

    public String tipoInstrumento() {
        return "Instrumento de viento";
    }
}

public class Flauta extends InstrumentoViento {
    public String tipoInstrumento(){
        return "Flauta";
    }
}

public class PruebaInstrumento {
    public static void main(String[] args){
        instrumento = new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
    }
}
