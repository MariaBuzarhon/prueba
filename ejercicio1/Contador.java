package objetos.ejercicio1;

public class Contador {
    public static final int MAX = 100;
    public static final int MIN = 0;
    public static final int POR_DEFECTO = 50;
    public static final int PASO = 2;
    private int valor;

    public Contador() {
    }

    public void setValor(int valor) {
        if (valor < 0) {
            this.valor = 0;
        } else if (valor > 100) {
            this.valor = 100;
        } else {
            this.valor = valor;
        }

    }

    public Contador(int valor) {
        this.setValor(valor);
    }

    public void resetear() {
        this.setValor(50);
    }

    public int getValor() {
        return this.valor;
    }

    public void incrementar() {
        this.setValor(this.getValor() + 2);
    }

    public void incrementar(int cantidad) {
        this.setValor(this.getValor() + cantidad);
    }

    public void decrementar() {
        this.decrementar(2);
    }

    public void decrementar(int cantidad) {
        this.setValor(this.getValor() - cantidad);
    }
}
