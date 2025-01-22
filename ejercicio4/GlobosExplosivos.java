package objetos.ejercicio4;
import java.util.Scanner;
import java.util.Random;

public class GlobosExplosivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenidos a Globos Explosivos!");

        // Puntuaciones y rondas
        int puntuacion_jugador1 = 0;
        int puntuacion_jugador2 = 0;
        int rondas_jugadas = 0;

        while (rondas_jugadas <= 5 && puntuacion_jugador1 < 3 && puntuacion_jugador2 < 3) {
            System.out.println("\033[1m\nRonda: " + (rondas_jugadas + 1) + ".\033[0m");

            // Crear un globo con capacidad aleatoria
            Globo globo = new Globo();
            boolean turnoJugador1 = true;

            while (!globo.explotado()) {
                System.out.println("Globo actual: " + globo);
                System.out.print((turnoJugador1 ? "Jugador 1" : "Jugador 2") + ", ¿cuánto aire quieres soplar?: ");
                int aire_soplado = scanner.nextInt();

                globo.inflar(aire_soplado);
                turnoJugador1 = !turnoJugador1;
            }

            System.out.println("\nResultados: " + globo);

            if (turnoJugador1) {
                System.out.println("¡Jugador 1 gana la ronda!");
                puntuacion_jugador1++;
            } else {
                System.out.println("¡Jugador 2 gana la ronda!");
                puntuacion_jugador2++;
            }

            rondas_jugadas++;
            System.out.println("Puntuación: \nJugador 1: " + puntuacion_jugador1 + " \nJugador 2: " + puntuacion_jugador2);
        }

        System.out.println("\n\033[1mResultado final.\033[0m");
        if (puntuacion_jugador1 > puntuacion_jugador2) {
            System.out.println("Jugador 1 gana el juego!");
        } else {
            System.out.println("Jugador 2 gana el juego!");
        }

        scanner.close();
    }
}
