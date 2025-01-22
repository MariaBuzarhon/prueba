package objetos.juegoNavidad;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Game {
    static ArrayList<String> inventarioJugador = new ArrayList<>();

    public static void main(String[] args){


//LOOT





    boolean conVida = true;
    boolean buddyA = false;
    boolean buddyB =false;

//FIRST ACT

        Scanner scanner = new Scanner(System.in);
        System.out.println("\033[1mNarrador: te despiertas después de lo que parece haber sido una eternidad en una cápsula, huele...a sangre y no puedes ver bien el exterior a través de la pequeña ventana que posee. \nLa cápsula se agita y tú con ella, provocando que te golpees la cabeza y vuelvas a quedar inconsciente.\033[0m\n");
        System.out.println("\033[1mNarrador: un sol radiante hace que abras los ojos, estás en lo que parece ser una playa, a tu lado un nautiloide estrellado contra la costa. \nTe duele todo el cuerpo pero igualmente decides intentar levantarte. Antes de que consigas levantarte unos brazos te agarran desde atrás y notas un filo frío en el cuello.\033[0m");
        System.out.println("");
        System.out.println(" \033[3m- Astarion: si aprecias ese bonito cuello tuyo, yo no me movería.\033[0m");
        System.out.println("");
        System.out.println("¿Qué vas a hacer?\n");
        System.out.println("1. Darle un cabezazo y probar suerte. \n2. Obedecer y quedarte quieto. \n3. Cantar: please, please, please, don't prove 'em right...\n4. Agarrarle el brazo e intentar hacerle una llave para inmovilizarlo en el suelo.");
        String primerEncuentroAstarion = scanner.nextLine();

//LOOPS

        if(Objects.equals(primerEncuentroAstarion, String.valueOf(1))){
            System.out.println("\033[1mAstarion retrocede unos pasos sorprendido y con una mano en la nariz, dándote tiempo a poder ponerte en guardia.\033[0m");
        } else if (Objects.equals(primerEncuentroAstarion, String.valueOf(2))) {
            System.out.println("\033[3m- Astarion: así me gusta, no tener que emplear la fuerza bruta no es que me agrade pero, por lo menos, pareces sensato\033[0m.");

        } else if (Objects.equals(primerEncuentroAstarion, String.valueOf(3))){
            System.out.println("\033[1m- Astarion ríe levemente.\033[0m");
//the character dies
        } else if (Objects.equals(primerEncuentroAstarion, String.valueOf(4))){
            conVida = false;
            System.out.println("\033[1mNarrador: fallas estrepitosamente, tú cuerpo está débil debido al impacto y el tiempo encerrado en aquella cápsula. ¿De verdad pensabas que podrías tumbarle?\n\nAquí acaba tú camino.\nDescansa en paz.\033[0m");
//the character dies
        } else {
            conVida = false;
            System.out.println("\033[1mLa hoja afilada de una daga se resbala delicadamente por tu cuello, dejando tras de si una cascada de líquido carmesí. \n\nAquí acaba tú camino. \nDescansa en paz.\033[0m");
        }

        while (!conVida){
            System.out.println("\n Gracias por probar <3");
            break;
        }

        if(conVida){
            System.out.println("\n\033[1mNarrador: has salido ileso de esta. Pero no te confíes.\033[0m\n");
            if (Objects.equals(primerEncuentroAstarion, String.valueOf(1))){
                System.out.println(" \033[3m- Astarion: ¿¡Estás loco!? Casi me partes mi preciosa nariz.\033[0m");
            } else if (Objects.equals(primerEncuentroAstarion, String.valueOf(2))){
                System.out.println(" \033[3m- Astarion: parece que no eres una amenaza.\033[0m\033[1m\n\nAstarion sonríe y retrocede unos pasos, soltándote.\033[0m");
            } else {
                System.out.println(" \033[3m- Astarion: me has caído bien. No voy a matarte de momento.\033[0m\033[1m\n\nAstarion sonríe y retrocede unos pasos, soltándote.\033[0m");

            }

//END OF LOOPS 1

//SECOND ACT
        String espacios = ("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(espacios);

        System.out.println("\033[1mNarrador: tras una breve charla Astarion te cuenta que él también estaba secuestrado dentro del nautiloide. Los dos podéis sentir como algo se retuerce dentro de vuestros cráneos, serán...¿larvas de azotamentes?\033[0m\n");
        System.out.println(" \033[3m- Astarion: No esperaba encontrarme con ningún superviviente...normal, ya sabes, sin tentáculos en la cara y esas cosas de azotamentes.\n   Puede que haya más como nosotros, deberíamos buscar, ¿me acompañas?\n\033[0m");
        System.out.println("1. Si, no me parece seguro explorar por aquí en solitario.\n2. No, prefiero ir solo.");
        String seguirConAstarion = scanner.nextLine();

        if(Objects.equals(seguirConAstarion, "1")){
            buddyA = true;
            System.out.println(" \n\033[3mAstarion: Me alegra oír eso. He escuchado movimiento dentro de la nave, a lo mejor deberíamos ir a echar un vistazo, puede que haya recursos o más supervivientes.\033[0m");
        } else {
            System.out.print(" \033[3m- Astarion: Bueno, entonces nuestros caminos se separan aquí. ");
        }

        if(buddyA){
            System.out.println("\n\033[1mNarrador: tras mirar a tu alrededor por unos segundos te das cuenta de que ir al nautiloide puede que no sea la mejor opción.\nLa blanquecina arena de la playa ahora yace roja, cubierta por la sangre de aquellos desgraciados que como tú fueron secuestrados, pero, cuyo final acabó siendo incierto...\033[0m\n");
            System.out.println("¿Qué vas a hacer?\n\n1. Hablar con Astarion sobre los cadaveres de la playa.\n2. Seguir a Astarion hasta el nautiloide.\n3. Proponer ir a otro lugar.");
            String dondeIr1 =scanner.nextLine();
            if(Objects.equals(dondeIr1, "1")){
                System.out.println("\033[3m - Astarion: no quería darle mayor importancia a la cuna de cadáveres que hay a nuestro alrededor, pero puede ser importante averiguar quién es esta gente y por qué, igual que a nosotros, nos raptaron para hacer sabe dios que con nuestros cerebros.\033[0m");

            } else if (Objects.equals(dondeIr1, "2")){
                System.out.println("\033[1mNarrador: Astarion y tu os dirigís cuidadosamente hacia el nautiloide, el aire fresco de la mañana golpeando gentilmente vuestros rostros, como una bendición divina después de todo el tiempo encerrados.\nEl sonido de un craqueteo se hace cada vez más notable conforme os acercáis.\033[0m");
                System.out.println("\n\033[3m - Astarion: ¿oyes eso?\033[0m");
                System.out.println("\n1. Si\n2. No");
                int sonido = scanner.nextInt();

                if(sonido == 1){
                    System.out.println("\033[1m\nNarrador: Os encontráis lo que parece ser un cerebro con piernas correteando por toda la sala principal de la nave, parece ajeno a vuestra presencia pero algo en ello desprende...peligro.\nDentro de la nave hay numerosos cadáveres tanto de personas, como de azotamentes.\033[0m");
                    System.out.println("\033[3m\n - Astarion: creo que podemos encontrar algo útil si rebuscamos entre tantos trozos de carne casi pútrida, a lo mejor algún cuchillo o provisiones, esta nave es muy grande, tiene que haber algo...\033[0m");
                    System.out.println("\033[1m\nNarrador: mientras Astarion y tú dais vueltas intentando encontrar algo, el cerebro andante no os quita los ojos de encima, intentas ignorarlo y dislumbras un pequeñobrillo que proviene de debajo de un cadaver. Podría ser un arma.\033[0m\n\n¿Qué vas a hacer?\n");
                    System.out.println("1. Empujar el cadaver y coger lo que hay debajo.\n2. Mirar con asco el cadaver y no acercarte.\n3. Mirar a Astarion y señalar al cadaver con cara de cahorrito.");
                    int cadaver1 = scanner.nextInt();
                    if (cadaver1 == 1){
                        System.out.println("\033[1m\nNarrador: al mover el cadaver una pequeña espada sale a la luz. Astarion te mira orgulloso.\033[0m");
                        System.out.println("\n¿Vas a coger la espada?");
                        System.out.println("1. Si\n2. No");
                        int espada = scanner.nextInt();

                        if (espada == 1){
                        inventarioJugador.add("Espada");
                            System.out.println("\033[1mNarrador: has colocado la espada encontrada en tú cinturón.");
                        } else {
                            System.out.println("Narrador: no has cogido la espada.\033[0m");

                        }
                        System.out.println("¿Qué quieres hacer ahora?");
                        System.out.println("1. Continuar la historia");
                        System.out.println("2. Ver inventario");
                        int opcion = scanner.nextInt();


                    }



//a partir de aqui lo que quiero hacer es, añadir un sistema de amistad con los personajes, sistema de peleas con dados como en el juego original y mucho más lore.
                }
            }

        } else {
            System.out.print("Una pena, espero que nos volvamos a encontrar.");
            System.out.println("\033[1mNarrador: te encaminas en solitario hacia el camino que lleva al bosque cercano a la costa. El paseo está lleno de bayas con un aspecto delicioso, haciendo rugir a tú estómago como un león.\033[0m\n\n¿Qué haces?\n");
            System.out.println("1. Te comes las bayas.\n2. No te comes las bayas.");
            int comerBayas = scanner.nextInt();

            if(comerBayas == 1){
                System.out.println("\033[1mNarrador: las bayas generan una sensación única de acidez y dulzura en tú lengua, adormeciéndola un poco. El único efecto adverso que notas es que ahora tienes más hambre. Estaban deliciosas.");
            } else {
                System.out.println("Narrador: echas un ultimo vistazo a las bayas, resistiéndote a la tentación de probar al menos una. Continúas caminando\033[0m");
            }

            System.out.println("\033[1mNarrador: después de lo que parece una eternidad te encuentras con un sello de teletransporte en una roca, pero parece defectuoso, algo...raro, emana de él.\033[0m");
            System.out.println("\n\033[3m - Voz que sale del agujero: ¿una ayudita? ¿por favor?\n\033[0m");
            System.out.println("1. Ayudar a la persona. \n2. Chocarle la mano. \n3. Ignorarlo.");
            int buddyBPrimeraDecision = scanner.nextInt();
            if(buddyBPrimeraDecision == 1){
                System.out.println("\033[1mNarrador: tras tirar casi un minuto del brazo, la persona finalmente consigue salir del agujero cayendo al suelo.\033[0m");
                System.out.println("\n\033[3m - Gale: ¡gracias!, de verdad, pensaba que iba a estar ahí atrapado de por vida. ¿Dónde están mis modales? Mi nombre es Gale.\033[0m");

            } else if (buddyBPrimeraDecision ==2 ){
                System.out.println("\033[1mNarrador: tú mano provoca un sonido casi ensordecedor, proseguido de un incómodo silencio.\033[0m");
                System.out.println("\n\033[3m - Gale:...a lo mejor tendría que haber especificado, dame la mano por favor, ¡tengo que salir de aquí ya!\033[0m");
                System.out.println("\033[1m\nNarrador: tras tirar casi un minuto del brazo, la persona finalmente consigue salir del agujero cayendo al suelo.\033[0m");
                System.out.println("\n\033[3m - Gale: ¡gracias!, de verdad, pensaba que iba a estar ahí atrapado de por vida. ¿Dónde están mis modales? Mi nombre es Gale.\033[0m");

            } else {
                System.out.println("\033[1m\nNarrador: tras unos segundos el portal se cierra automáticamente, cercenándole el brazo a la persona que estaba atrapada en su interior.\nEsperas que un grito inunde el ambiente pero solo te responde el sonido del brazo al caer al suelo y un silencio incómodo en el aire. \033[0m");

            }





        }

    }
}
class Inventrario {
    public ArrayList<String> items = new ArrayList<>();

    public void agregarItem(String item){
        items.add(item);
        System.out.println("\033[1mNarrador: has agregado: \033[0m" + item);
    }
    public void mostrarInventario(){
        if (items.isEmpty()){
            System.out.println("\033[1mNarrador: echas un vistazo a tu mochila, pero la nada te devuelve la mirada.\033[0m");
        } else {
            System.out.println("\033[1mNarrador: tu mochila contiene: " + items);

        }
    }
    public boolean usarItems(String item){
        if(items.contains(item)){
            items.remove(item);
            System.out.println("\033[1mNarrador: has utilizado: \\033[0m" + item);
            return true;
        } else {
            System.out.println("\033[1mNarrador: " + item + "ha sido eliminado de tu inventario.");
            return false;
        }
    }}
}
