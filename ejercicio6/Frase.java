package objetos.ejercicio6;

// Clase Frase
public class Frase {
    // Campo para almacenar el texto como un StringBuilder
    private StringBuilder texto;

    // Constructor por defecto: inicializa el texto a vacío
    public Frase() {
        this.texto = new StringBuilder();
    }

    // Constructor que recibe un String y lo asigna como texto inicial
    public Frase(String cadena) {
        this.texto = new StringBuilder(cadena);
    }

    // Constructor que recibe un número de repeticiones y una cadena
    public Frase(int repeticiones, String cadena) {
        this.texto = new StringBuilder();
        for (int i = 0; i < repeticiones; i++) {
            this.texto.append(cadena);
            if (i < repeticiones - 1) {
                this.texto.append(" "); // Añade espacio entre palabras, excepto al final
            }
        }
    }

    // Método para devolver el carácter en una posición dada
    public char caracterEn(int posicion) {
        return texto.charAt(posicion);
    }

    // Método para obtener la longitud del texto
    public int longitud() {
        return texto.length();
    }

    // Método para anexar una cadena al texto
    public void anexar(String cadena) {
        if (texto.length() > 0) {
            texto.append(" "); // Añade espacio si el texto no está vacío
        }
        texto.append(cadena);
    }

    // Método para recortar caracteres desde el final
    public void recortar(int numCaracteres) {
        int nuevaLongitud = Math.max(0, texto.length() - numCaracteres);
        texto.setLength(nuevaLongitud); // Recorta el texto
        // Elimina el espacio final si quedó
        if (texto.length() > 0 && texto.charAt(texto.length() - 1) == ' ') {
            texto.setLength(texto.length() - 1);
        }
    }

    // Método toString para convertir el texto a cadena
    @Override
    public String toString() {
        return texto.toString();
    }

    // Método equals para comparar dos objetos Frase
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Frase otraFrase = (Frase) obj;
        return this.texto.toString().equals(otraFrase.texto.toString());
    }

    // Método clone para crear una copia del objeto
    @Override
    public Frase clone() {
        return new Frase(this.texto.toString());
    }}