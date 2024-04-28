import Elementos.Enemigos.Esqueleto;
import Elementos.Enemigos.Goblin;
import Elementos.Enemigos.Orco;
import Elementos.Personaje;
import java.util.Scanner;

public class Escenario {
    public static void main(String[] args) {
        char charResponse;

        Scanner in = new Scanner(System.in);
        Personaje PJ = new Personaje();
        Esqueleto esqueleto = new Esqueleto("Brook", "Common", "Lanza", 23, 23);
        Goblin goblin = new Goblin("Clin Clak", "Epico", "Ballesta", 20, 20);
        Orco orco = new Orco("Gustavo el orco", "Common", "Mazo", 34, 34);

        // ASIGNAR DATOS DEL JUGADOR + PREGUNTARLE SI ESTA CONFORME CON LOS DATOS //
        do {
            PJ.setNombre("i");
            PJ.setTrabajo("i");
            PJ.setArma("i");
            PJ.setVida(20);
            PJ.setMaxVida(PJ.getVida());

            System.out.println("¿Este eres tu?\n" +
                    "NOMBRE: " + PJ.getNombre() +
                    "\nTRABAJO: " + PJ.getTrabajo() +
                    "\nARMA: " + PJ.getArma() +
                    "\nVIDA: " + PJ.getVida() +
                    "\n/////////////////////////" +
                    "\n// Responde con Y | N //" +
                    "\n///////////////////////");

            charResponse = in.next().charAt(0);
            charResponse = Character.toUpperCase(charResponse);
        }while(charResponse != 'Y');

        // HISTORIA //
        System.out.println("\nMi nombre es " + PJ.getNombre() + ", y mi primo Manolo me ha pedido algo extraño.\n" +
                           "Quiere que me adentre en una mazmorra en busca de un colgante el cuál el le llama 'Colgante del alma'.\n" +
                           "No se que se traera entre manos esta vez, pero aún le debo una, así que vamos allá...\n");


        // Planta 1
        System.out.println("\n[PLANTA 1]\nVaya, un esqueletito, vamos a ver que tan enclenque es\n-- EMPIEZA EL COMBATE --");

        // Combate 1
        do {
            esqueleto.setVida(esqueleto.getVida() - PJ.Menu());

            // Esto lo hago dentro de un if para que si matas al enemigo, el turno en el que va a morir ya no haga un último ataque
            if(esqueleto.getVida() > 0){
                PJ.setVida(PJ.getVida() - esqueleto.Atacar());
            }
        }while (esqueleto.getVida() > 0 && PJ.getVida() > 0);

        // Victoria contra el esqueleto
        if(esqueleto.getVida() < 0){
            System.out.println("\n-- Derrotaste al esqueleto " + esqueleto.getNombre() + "--" +
                               "\nJum, maldito esqueleto, pero no supuso demasiado problema, sigamos...\n\n" +
                               "[PLANTA 2]");

            // Planta 2
            System.out.println("\n" + PJ.getNombre() + ": Bien, siguiente pis-\n" +
                               "Goblin: Nyeheheheheehehe, ¡ALEJATE DEL COLGANTE!\n" +
                               PJ.getNombre() + ": Nah, le debo un favor a mi primo ¡¡PREPARATE!!");

            // Combate 2
            do {
                goblin.setVida(goblin.getVida() - PJ.Menu());

                if(goblin.getVida() > 0){
                    PJ.setVida(PJ.getVida() - goblin.Atacar());
                }

            }while (goblin.getVida() > 0 && PJ.getVida() > 0);

            // Victoria contra el goblin
            if(goblin.getVida() < 0){
                System.out.println("\n-- Derrotaste al goblin " + goblin.getNombre() + " --\n\n" +
                        "Ese goblin a dado guerra..\n" +
                        "¿Hm? ¿Qué es esto?\n\n" +
                        "-- Encuentras Papel arrugado x1 --\n" +
                        "-- " + PJ.getNombre() + " Leyo el contenido del Papel Arrugado --\n\n" +
                        "La madre que te parío Manolo, como que...\n" +
                        "Espero que esos exploradores no les hagas salir mal parados.\n\n" +
                        "[PLANTA 3]");

                // Planta 3
                System.out.println(orco.getNombre() + ": Buscando el colgante, ¿huh?\n" +
                                   PJ.getNombre()  + ": Seh... Y espero no tener que arrepentirme de ello.\n" +
                                   orco.getNombre() + ": Bien, pues veamos si eres capaz de llevártelo con vida de aquí.\n");

                // Combate 3
                do {
                    orco.setVida(orco.getVida() - PJ.Menu());

                    if(orco.getVida() > 0){
                        PJ.setVida(PJ.getVida() - orco.Atacar());
                    }

                }while (orco.getVida() > 0 && PJ.getVida() > 0);

                // Victoria contra el orco
                if(orco.getVida() < 0) {
                    System.out.println("\n-- Derrotaste a " + orco.getNombre() + " --\n\n" +
                                       "...fiu, en fin, vamos por el colgante...\n\n" +
                                       "-- Atraviesas la puerta que custodiaba el orco --\n" +
                                       "-- Lo ves... es el colgante del que te hablo Manolo --\n" +
                                       "...Espero no arrepentirme de esto\n\n" +
                                       "-- Te llevas el Colgante del Alma --\n\n" +
                                       "¿Cuál sería el contenido de la nota del goblin que preocupo de golpe a " + PJ.getNombre() + "?");
                }
                // Derrota contra el orco
                else if(PJ.getVida() < 0){
                    System.out.println("-- " + orco.getNombre() + " te hizo fosfatina a base de sus mazazos... --");
                }

            }
            // Derrota contra el goblin
            else if(PJ.getVida() < 0){
                System.out.println("-- " +goblin.getNombre() + " te hundió sus dagas en tu pecho, y te robo todo lo que tenías... --");
            }
        }
        // Derrota contra el esqueleto
        else if(PJ.getVida() < 0){
            System.out.println("-- " +esqueleto.getNombre() + "agarro, y te clavo su huesudo brazo en el pecho... --");
        }
    }
}

// ! AÚN HAY UN ERROR QUE SOLVENTAR, A VECES SE CIERRA EN MEDIO DEL COMBATE EL PROGRAMA