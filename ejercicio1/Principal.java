package objetos.ejercicio1;

import objetos.ejercicio2.Contador;

public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {
        Contador c = new Contador();
        new Contador(50);
        new Contador();
        c.resetear();

        int i;
        for(i = 0; i < 10; ++i) {
            c.incrementar();
            System.out.printf("El contador vale %d\n", c.getValor());
        }

        c.incrementar(5);
        System.out.printf("El contador vale %d\n", c.getValor());

        for(i = 0; i < 5; ++i) {
            c.decrementar();
            System.out.printf("El contador vale %d\n", c.getValor());
        }

        c.decrementar(5);
        System.out.printf("El contador vale %d\n", c.getValor());
    }

    public static class ContadorEj1 {
        public static final int MAX = 100;
        public static final int MIN = 0;
        public static final int POR_DEFECTO = 50;
        public static final int PASO = 2;
        private int valor;

        public ContadorEj1() {
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

        public void Contador(int valor) {
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
}
