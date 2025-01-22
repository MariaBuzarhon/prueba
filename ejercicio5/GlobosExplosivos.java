package objetos.ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class GlobosExplosivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenidos a Globos Explosivos, jugaremos 5 rondas, por favor, elige tú globo ");

        //Establecer la dificultad
        System.out.println("\033[1mLos globos situados delante de ti son de 4 colores: rojo, amarillo, verde y uno negro con una calavera. Tienes que elegir uno para empezar la partida, ¿cuál eliges?\033[0m");

        System.out.println("1. Verde.\n2. Amarillo.\n3. Rojo.\n4. Negro con la calavera.");
        int dificultad = scanner.nextInt();

        if (dificultad < 1 || dificultad > 4) {
            System.out.println("Dificultad no válida. Inicia el juego nuevamente.");
            scanner.close();
            return;
        }

        // Puntuaciones y rondas
        int puntuacion_jugador1 = 0;
        int puntuacion_jugador2 = 0;
        int rondas_jugadas = 0;

        while (rondas_jugadas <= 5 && puntuacion_jugador1 < 3 && puntuacion_jugador2 < 3) {
            System.out.println("\033[1m\nRonda: " + (rondas_jugadas + 1) + ".\033[0m");

            // Crear un globo con capacidad aleatoria
            Globo globo = new Globo(dificultad);
            boolean turnoJugador1 = true;

            while (!globo.explotado()) {
                if(dificultad == 1){
                    System.out.println("Globo actual: " + globo);
                    System.out.print((turnoJugador1 ? "Jugador 1" : "Jugador 2") + ", ¿cuánto aire quieres soplar?: ");
                } else {
                    System.out.print((turnoJugador1 ? "Jugador 1" : "Jugador 2") + ", ¿cuánto aire quieres soplar?: ");
                }
                int aire_soplado = scanner.nextInt();

                if (aire_soplado < 1 || aire_soplado > 10) {
                    System.out.println("Solo puedes soplar entre 1 y 10 unidades de aire. Intenta de nuevo.");
                    continue;
                }

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
            System.out.println("¡Jugador 1 gana el juego!");
        } else {
            System.out.println("¡Jugador 2 gana el juego!");
        }

        scanner.close();
    }
}

