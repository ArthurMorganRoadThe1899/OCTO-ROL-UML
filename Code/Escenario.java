import Elementos.Personaje;
import java.util.Scanner;
import java.util.Objects;

public class Escenario {
    public static void main(String[] args) {
        int intResponse;
        char charResponse;

        Scanner in = new Scanner(System.in);
        Personaje PJ = new Personaje();

        // ASIGNAR DATOS DEL JUGADOR + PREGUNTARLE SI ESTA CONFORME CON LOS DATOS
        do {
            PJ.setNombre("i");
            PJ.setTrabajo("i");
            PJ.setArma("i");
            PJ.setVida(5);

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

        System.out.println("\nMi nombre es " + PJ.getNombre() + ", y mi primo Manolo me ha pedido algo extraño.\n" +
                           "Quiere que me adentre en una mazmorra en busca de un colgante el cuál el le llama 'Colgante del alma'.\n" +
                           "No se que se traera entre manos esta vez, pero aún le debo una, así que vamos allá...\n");
    }
}
