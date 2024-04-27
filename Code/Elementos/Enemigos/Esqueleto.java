package Elementos.Enemigos;

public class Esqueleto extends Enemigo{

    // PUBLIC ESQUELETO //
    public Esqueleto(String Nombre, String Tipo, String Arma, int Vida){
        super(Nombre,Tipo,Arma,Vida);
    }
    int seleccionDeDialogo;
    int vidaCurada;
    int DanyoE;



    // ATACAR //
    @Override
    public int Atacar() {
        seleccionDeDialogo = (int) (Math.random() * ((5 - 1) + 1)) + 1;
        vidaCurada = (int) (Math.random() * ((2 - 1) + 1)) + 1;
        DanyoE = (int) (Math.random() * ((10 - 5) + 1)) + 5;

        // Ataque con espada
        if (Arma == "Espada" && seleccionDeDialogo == 1) {
            System.out.println("Con tajo diagonal corta tu piel haciendo un \nDaño: " + DanyoE);
        }

        // Ataque para los epicos
        else if (Tipo == "Epico" && seleccionDeDialogo == 2) {
            System.out.println("Tras el traqueteo de sus dientes el esqueleto brilla");
            DanyoE = DanyoE - 1;
            Vida = Vida + vidaCurada;
            System.out.println("Daño: " + DanyoE + "\nVida curada: +" + vidaCurada);
        }
        else if (Tipo == "Epico" && seleccionDeDialogo == 3) {
            System.out.println("Sujetando bien su arma realiza un ¡¡¡¡¡TAJO PERFECTO!!!!");
            DanyoE = DanyoE + 2;
            System.out.println("Daño: " + DanyoE);
        }

        // Ataque con espadón
        else if (Arma == "Espadon" && seleccionDeDialogo == 1) {
            System.out.println("De manera tambaleante te pega un espadazo con un total de \nDaño: " + DanyoE);
        }
        else if (Arma == "Espadon" && seleccionDeDialogo == 2) {
            System.out.println("Dandote con el mango te hace \nDaño: " + DanyoE);
        }
        else if (Arma == "Espadon" && seleccionDeDialogo == 3) {
            System.out.println("Sujetando con ambas manos hace un chin de \nDaño: " + DanyoE);
        }

        // Ataque con lanza
        else if (Arma == "Lanza" && seleccionDeDialogo == 1) {
            System.out.println("Con la punta de su lanza te hace \nDaño: " + DanyoE);
        }
        else if (Arma == "Lanza" && seleccionDeDialogo == 2) {
            System.out.println("Te perfora con su lanza \nDaño: " + DanyoE);
        }
        else if (Arma == "Lanza" && seleccionDeDialogo == 3) {
            System.out.println("Te clavo su larga lanza \nDaño: " + DanyoE);
        }
        return DanyoE;
    }
}