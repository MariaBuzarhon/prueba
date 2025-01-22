package objetos.ejercicio4;

import java.util.Random;

//po
class Globo {
    private int capacidad_maxima;
    private int cantidad_aire;
    private boolean explotado;

    // Constructor del globo
    public Globo(int capacidadMaxima) {
        this.capacidad_maxima = capacidadMaxima;
        this.cantidad_aire = 0; //Los globos obviamente estarán vacíos al principio.
        this.explotado = false;
    }

    // Constructor random de la capacidad del globo
    public Globo() {
        Random random = new Random();
        this.capacidad_maxima = random.nextInt(41) + 10; // Capacidad entre 10 y 50
        this.cantidad_aire = 0;
        this.explotado = false;
    }

    // Método para inflar.
    public void inflar(int cantidad) {
        if (!explotado) {
            cantidad_aire += cantidad;
            if (cantidad_aire > capacidad_maxima) {
                explotado = true;
            }
        }
    }

    // Método para el explotado
    public boolean explotado() {
        return explotado;
    }

    // Método para representar el llenado de los globos toString
    public String toString() {
        StringBuilder representacion = new StringBuilder();
        if (explotado) {
            representacion.append("¡Cuidado, el globo ha explotado!");
        } else {
            for (int i = 0; i < cantidad_aire; i++) {
                representacion.append("*");
            }
            for (int i = cantidad_aire; i < capacidad_maxima; i++) {
                representacion.append("O");
            }
        }
        return representacion.toString();
    }
}
