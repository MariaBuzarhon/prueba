package objetos.ejercicio7;
import java.util.Random;

//Clase combo con las variables
public class Bombo {
    Random random = new Random();
    private boolean[] bolas;
    private int cantidadBolas;
    private int bola;

    //El constructor recibirá un parámetro cantidadBolas, que indicará el número de bolas que contendrá el bombito.
    public Bombo(int cantidadBolas){
        this.cantidadBolas = cantidadBolas;
        this.bolas = new boolean[cantidadBolas + 1];
        this.random = new Random();

        //inicializamos las bolas en true
        for(int i = 1; i <= cantidadBolas; i++){
            bolas[i] = true;
        }
    }
    //Metodo to String, muestra las bolas que quedan en el bombo y las que ya han salido.
    public String toString() {
        //StringBuilder de las bolas que están dentro
        StringBuilder bolasDentro = new StringBuilder("En el bombo \033[3m\033[1mestán\033[0m las bolas con los números: ");
        //StringBuilder de las bolas que han salido
        StringBuilder bolasFuera = new StringBuilder("Las bolas con estos números \033[3m\033[1mya han salido\033[0m: ");

        //Este bucle recorre las bolas que hay dentro del Bombito y distingue cuáles hay dentro y cuáles fuera
        for(int i = 1; i <=cantidadBolas;i++){
            if(bolas[i]){
                bolasDentro.append(i).append(" ");
            } else {
                bolasFuera.append(i).append(" ");
            }
        }
        return bolasDentro.toString() + "\n"  +bolasFuera.toString();
    }

    //Metodo para saber si la bola está dentro del Bombito
    public boolean estaLaBolaDentro (int bola){
        return bolas[bola];
    }

    //Este metodo deberá asegurarse de que la bola obtenida no haya salido previamente (puede usarse un do-while para comprobarlo).
    public int dameBola() {
        int bola;
        do{
            bola = random.nextInt(cantidadBolas) + 1;
        } while (!estaLaBolaDentro(bola));
        bolas[bola] = false;
        return bola;

    }
}
