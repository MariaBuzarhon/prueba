package objetos.ejercicio2;

public class Contador {
    public static final int MAX = 20;
    public static final int MIN = 0;
    public static final int POR_DEFECTO = 8;
    public static final int PASO = 1;
    private int valor;

    public Contador() {
    }

    public void setValor(int valor) {
        if (valor < 0) {
            this.valor = 0;
        } else if (valor > 20) {
            this.valor = 20;
        } else {
            this.valor = valor;
        }

    }

    public Contador(int valor) {
        this.setValor(valor);
    }

    public String toString(){
        return String.format("¡Valgo %d!", valor);
    }

    public void resetear() {
        this.setValor(8);
    }

    public int getValor() {
        return this.valor;
    }

    public void incrementar() {
        this.setValor(this.getValor() + 1);
    }

    public void incrementar(int cantidad) {
        this.setValor(this.getValor() + cantidad);
    }

    public void decrementar() {
        this.decrementar(1);
    }

    public void decrementar(int cantidad) {
        this.setValor(this.getValor() - cantidad);
    }
}
