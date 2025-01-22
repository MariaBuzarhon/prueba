package objetos.ejercicio2;


public class Principal {

    public static void main(String[] args) {
        Contador c1 = new Contador(10);
        Contador c2 = new Contador();
        System.out.printf("Inicialmente, c1 vale: %s\n", c1);
        c1.incrementar();
        System.out.printf("Tras incrementar, c1 vale: %d\n", c1.getValor());
        c1.decrementar(5);
        System.out.printf("Tras decrementar 5, c1 vale: %d\n", c1.getValor());
        c1.resetear();
        System.out.printf("Tras resetear, c1 vale: %d\n", c1.getValor());
        System.out.printf("Inicialmente, c2 vale: %d\n", c2.getValor());
        c2.setValor(15);
        System.out.printf("Tras setValor(15), c2 vale: %d\n", c2.getValor());

        int i;
        for(i = 0; i < 5; ++i) {
            c2.incrementar();
            System.out.printf("Incremento %d, c2 vale: %d\n", i + 1, c2.getValor());
        }

        c2.incrementar(10);
        System.out.printf("Tras incrementar 10, c2 vale: %d\n", c2.getValor());

        for(i = 0; i < 3; ++i) {
            c2.decrementar();
            System.out.printf("Decremento %d, c2 vale: %d\n", i + 1, c2.getValor());
        }

        c2.decrementar(7);
        System.out.printf("Tras decrementar 7, c2 vale: %d\n", c2.getValor());
    }
}
