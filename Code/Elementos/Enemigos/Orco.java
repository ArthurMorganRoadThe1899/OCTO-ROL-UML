package Elementos.Enemigos;

public class Orco extends Enemigo {

    // PUBLIC ORCO//
    public Orco(String Nombre, String Tipo, String Arma, int Vida) {
        super(Nombre, Tipo, Arma, Vida);
    }
    int seleccionDeDialogo;
    int vidaCurada;
    int DanyoE;



    // ATACAR //
    @Override
    public int Atacar() {
        seleccionDeDialogo = (int) (Math.random() * ((3 - 1) + 1)) + 1;
        vidaCurada = (int) (Math.random() * ((2 - 1) + 1)) + 1;
        DanyoE = (int) (Math.random() * ((8 - 3) + 1)) + 3;

        // Ataque con hacha
        if(Arma == "Hacha" && seleccionDeDialogo == 1){
            System.out.println("Te pegaron tremendo hachazo que casi te parte en 2 con un total de \nDaño: " + DanyoE);
        }

        // Ataque para los epicos
        else if(Tipo == "Epico" && seleccionDeDialogo == 2){
            System.out.println("Tras un grito ensordecedor te aturde brevemente tomando un breve respiro");
            DanyoE = DanyoE - 1;
            Vida = Vida + vidaCurada;
            System.out.println("Daño: " + DanyoE + "\nVida curada: +" + vidaCurada);
        }
        else if(Tipo == "Epico" && seleccionDeDialogo == 3){
            System.out.println("En un estado de frenesi carga contra ti destrozandote con todas sus fuerzas");
            DanyoE =  DanyoE + 2;
            System.out.println("Daño: " + DanyoE);
        }

        // Ataque con espada
        else if(Arma == "Espada" && seleccionDeDialogo == 1){
            System.out.println("Con un swing de su espada te realiza un tajo vertical con un total de \nDaño: " + DanyoE);
        }
        else if(Arma == "Espada" && seleccionDeDialogo == 2){
            System.out.println("Con su recta y afilada espada tras un corte \nDaño: " + DanyoE);
        }
        else if(Arma == "Espada" && seleccionDeDialogo == 3){
            System.out.println("Usando su espada afilada te hizo \nDaño: " + DanyoE);
        }

        // Ataque con arco
        else if(Arma == "Arco" && seleccionDeDialogo == 1){
            System.out.println("Con precision descargo su flecha en tu cuerpo haciendo \nDaño: " + DanyoE);
        }
        else if(Arma == "Arco" && seleccionDeDialogo == 2){
            System.out.println("Soltando la cuerda la flecha golpeo tu cuerpo \nDaño: " + DanyoE);
        }
        else if(Arma == "Arco" && seleccionDeDialogo == 3){
            System.out.println("Tras un disparo preciso te hizo \nDaño: " + DanyoE);
        }
        return DanyoE;
    }



}
