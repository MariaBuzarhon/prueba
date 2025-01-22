package objetos.ejercicio7;

public class BomboPrincipal {
    public static void main(String[] args) {
        Bombo bombito = new Bombo(10); // Crear un bombito pequeñito con 10 bolas

        for (int i = 0; i < 10; i++) {
            int bola = bombito.dameBola(); // Sacar una bola del bombito
            System.out.println("\n\033[1mBola sacada: " + bola + "\033[0m.\n");
            System.out.println(bombito); // Mostrar el estado (del bombito) después de sacar la bola random
        }
    }
}