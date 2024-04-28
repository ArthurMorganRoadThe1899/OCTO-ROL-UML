import Elementos.Enemigos.Esqueleto;
import Elementos.Enemigos.Orco;
import Elementos.Personaje;
import Elementos.Enemigos.Enemigo;
import java.util.Scanner;
import java.util.Objects;

public class Escenario {
    public static void main(String[] args) {
        int danyoEnemigo;
        int danyoPersonaje;
        char charResponse;

        Scanner in = new Scanner(System.in);
        Personaje PJ = new Personaje();

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


        // Combate 1
        Esqueleto esqueleto = new Esqueleto("Brook", "Common", "Lanza", 22, 22);
        System.out.println("Vaya, un esqueletito, vamos a ver que tan enclenque es\n-- EMPIEZA EL COMBATE --");

        do {
            esqueleto.setVida(esqueleto.getVida() - PJ.Menu());
            PJ.setVida(PJ.getVida() - esqueleto.Atacar());
        }while (esqueleto.getVida() > 0 && PJ.getVida() > 0);


        if(esqueleto.getVida() < 0){
            System.out.println("victoria");
        }else if(PJ.getVida() < 0){
            System.out.println("derrota");
        }

        System.out.println("\nJum, maldito esqueleto, pero no supuso demasiado problema, sigamos...");
        // Combate 2

        //System.out.println("\nMaldito orco ¿donde me mandas a ir  Manolo?\nMe pregunto que se traera entre manos con ese grupito de exploradores.");
        // Combate de jefe

        /*System.out.println("\nEse goblin a dado guerra..\n" +
                           "¿Hm? ¿Qué es esto?\n" +
                           "-- Encuentras Papel arrugado x1 --\n" +
                           "-- " + PJ.getNombre() + " Leyo el contenido del Papel Arrugado --\n" +
                           "La madre que te parío Manolo, como que...");*/


        /*System.out.println("\nCONTENIDO DEL Papel Arrugado:" +
                                "El Colgante del Alma es un poderoso artefacto que habeis de custodiar con vuestra vida.\n" +
                                "Este es un Colgante capaz de manipular y doblegar a voluntad a quien se quiera, si cae en malas manos\n" +
                                "podría ser catastrófico.");*/

    }
}
