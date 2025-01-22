package objetos.ejercicio5;

import java.util.Random;

class Globo {
    private int capacidad_maxima;
    private int cantidad_aire;
    private boolean explotado;

    // Constructor random de la capacidad del globo
    public Globo(int dificultad) {
        Random random = new Random();
        switch (dificultad) {
            case 1:
                this.capacidad_maxima = random.nextInt(30) + 30;
                break;
            case 2:
                this.capacidad_maxima = random.nextInt(30) +15;
                break;
            case 3:
                this.capacidad_maxima = random.nextInt(30);
                break;
            case 4:
                this.capacidad_maxima = random.nextInt(15);
                break;
            default:
                throw new IllegalArgumentException("Dificultad no válida");

        }
        this.cantidad_aire=0;
        this.explotado=false;
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
