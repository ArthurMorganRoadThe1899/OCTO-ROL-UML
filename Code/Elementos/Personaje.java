package Elementos;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Personaje {
    String Nombre;
    String Trabajo;
    String Arma;
    int Vida;
    Scanner in = new Scanner(System.in);

    // GET | SET - NOMBRE
    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        System.out.println("¿Cuál es tu nombre?\n" +
                           "\nINSERTA TU NOMBRE:");
        Nombre = in.nextLine();

        this.Nombre = Nombre;
    }



    // GET | SET - TRABAJO
    public String getTrabajo(){
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        int select;

        do {
            System.out.println("¿Qué trabajo te gustaría elegir?\n" +
                    "========================\n" +
                    "==== 1. GUERRERO =======\n" +
                    "==== 2. MAGO ===========\n" +
                    "==== 3. ARQUERO ========\n" +
                    "==== 4. INFORMACIÓN ====\n" +
                    "========================");

            select = parseInt(in.nextLine());

            switch (select) {
                case 1:
                    Trabajo = "Guerrero";
                    break;
                case 2:
                    Trabajo = "Mago";
                    break;
                case 3:
                    Trabajo = "Arquero";
                    break;
                case 4:
                    infoTrabajos();
                    break;
            }

        }while (select == 4) ;

        // Establezco aquí el trabajo del PJ
        this.Trabajo = Trabajo;
    }



    // INFO DE LOS TRABAJOS
    public void infoTrabajos(){
        System.out.println("Esta es la información de los trabajos:\n\n" +
                "Guerrero: Habil espadachin curtido en el campo de batalla, obtienes una espada con la que combatir contra tus enemigos.\n\n" +
                "Mago: Erudito que ha dedicado buena suma de su vida a aprender el noble arte de la magia, obtienes un bastón con el que combatir contra tus enemigos.\n\n" +
                "Arquero: Intrépido cazador de los bosques, ágil como el solo y un dominio sin igual con el arco, obtienes un arco con el que combatir contra tus enemigos\n");
    }



    // GET | SET - ARMA

    public String getArma(){
        return Arma;
    }

    public void setArma(String Arma){
        switch (Trabajo) {
            case "Guerrero":
                Arma = "Espada";
                break;
            case "Mago":
                Arma = "Bastón";
                break;
            case "Arquero":
                Arma = "Arco";
                break;
        }
        this.Arma = Arma;
    }



    // GET | SET - VIDA
    public int getVida(){
        return Vida;
    }

    public void setVida(int Vida){
        this.Vida = Vida;
    }
}
