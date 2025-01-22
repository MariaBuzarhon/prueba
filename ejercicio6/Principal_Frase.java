package objetos.ejercicio6;

import java.util.Scanner;

public class Principal_Frase {
    public static void main(String[] args) {
        // Crear objetos Frase usando diferentes constructores
        Frase frase1 = new Frase();
        Frase frase2 = new Frase("Hola mundo");
        Frase frase3 = new Frase(3, "hola");

        // Probar métodos
        System.out.println("Frase 1: " + frase1); // Debería estar vacía
        System.out.println("Frase 2: " + frase2); // "Hola mundo"
        System.out.println("Frase 3: " + frase3); // "hola hola hola"

        // Probar caracterEn
        System.out.println("Carácter en posición 1 de frase 2: " + frase2.caracterEn(1)); // "o"

        // Probar longitud
        System.out.println("Longitud de frase 3: " + frase3.longitud()); // 13

        // Probar anexar
        frase1.anexar("Primera");
        frase1.anexar("palabra");
        System.out.println("Frase 1 tras anexar: " + frase1); // "Primera palabra"

        // Probar recortar
        frase3.recortar(5);
        System.out.println("Frase 3 tras recortar: " + frase3); // "hola hola"

        // Probar equals
        Frase frase4 = new Frase("Hola mundo");
        System.out.println("frase2 es igual a frase4: " + frase2.equals(frase4)); // true

        // Probar clone
        Frase fraseClonada = frase3.clone();
        System.out.println("Frase clonada: " + fraseClonada); // "hola hola"
    }
}