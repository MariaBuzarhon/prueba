package objetos.ejercicio3;

public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {
        NumeroInteligente numero = new NumeroInteligente(28);
        System.out.printf("El valor inicial es: %d\n", numero.getValor());
        numero.incrementar();
        System.out.printf("Tras incrementar: %d\n", numero.getValor());
        numero.decrementar(2);
        System.out.printf("Tras decrementar 2: %d\n", numero.getValor());
        System.out.printf("%d es primo? %b\n", numero.getValor(), numero.esPrimo());
        System.out.printf("%d es perfecto? %b\n", numero.getValor(), numero.esPerfecto());
        System.out.println("Números primos del 1 al 100:");
        NumeroInteligente iterador = new NumeroInteligente();

        for(int i = 1; i <= 100; ++i) {
            iterador.setValor(i);
            if (iterador.esPrimo()) {
                System.out.printf("%d ", i);
            }
        }

        System.out.println();
        System.out.println("Primeros 100 números primos:");
        NumeroInteligente primoFinder = new NumeroInteligente(2);

        for(int encontrados = 0; encontrados < 100; primoFinder.incrementar()) {
            if (primoFinder.esPrimo()) {
                System.out.printf("%d ", primoFinder.getValor());
                ++encontrados;
            }
        }

        System.out.println();
    }
}
