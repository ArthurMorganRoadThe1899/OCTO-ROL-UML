package Elementos.Enemigos;

public class Goblin extends Enemigo {
    String Nombre;
    String Tipo;
    String Arma;
    int seleccionDeDialogo;
    int vidaCurada;
    int DanyoE;
    int maxVida;
    int Vida = maxVida;

    // PUBLIC GOBLIN //
    public Goblin(String Nombre, String Tipo, String Arma, int Vida, int maxVida) {
        super(Nombre, Tipo, Arma, Vida);
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Arma = Arma;
        this.Vida = Vida;
        this.maxVida = maxVida;
    }



    // GET | SET - VIDA //
    public int getVida(){
        return Vida;
    }

    public void setVida(int Vida){
        this.Vida = Vida;
    }



    // GET | SET - VIDA MÁXIMA
    public int getMaxVida(){
        return maxVida;
    }

    public void setMaxVida(int maxVida){
        this.maxVida = maxVida;
    }



    // ATACAR //
    @Override
    public int Atacar() {
        seleccionDeDialogo = (int) (Math.random() * ((3 - 1) + 1)) + 1;
        vidaCurada = (int) (Math.random() * ((2 - 1) + 1)) + 1;
        DanyoE = (int) (Math.random() * ((7 - 2) + 1)) + 2;

        // Ataque con Dagas
        if (Arma == "Dagas" && seleccionDeDialogo == 1) {
            System.out.println("Apuñalandote el estomago cual ratero te hace \nDaño: " + DanyoE);
        }

        // Ataque para los epicos
        else if (Tipo == "Epico" && seleccionDeDialogo == 2) {
            System.out.println("Tras robarte una pocion y empujarte");
            DanyoE = DanyoE - 1;
            Vida = Vida + vidaCurada;
            System.out.println("Daño: " + DanyoE + "\nVida curada: +" + vidaCurada);
        }
        else if (Tipo == "Epico" && seleccionDeDialogo == 3) {
            System.out.println("Usando sus dagas apuñalo tu punto debil de manera muy efectiva");
            DanyoE = DanyoE + 2;
            System.out.println("Daño: " + DanyoE);
        }

        // Ataque con espada
        else if (Arma == "Espadita" && seleccionDeDialogo == 1) {
            System.out.println("Con su oxidada espada te corta un total de \nDaño: " + DanyoE);
        }
        else if (Arma == "Espadita" && seleccionDeDialogo == 2) {
            System.out.println("Te roza con su poco filosa espada \nDaño: " + DanyoE);
        }
        else if (Arma == "Espadita" && seleccionDeDialogo == 3) {
            System.out.println("Te corta un poco de piel y ropa \nDaño: " + DanyoE);
        }

        // Ataque con ballesta
        else if (Arma == "Ballesta" && seleccionDeDialogo == 1) {
            System.out.println("Con precision descargo su perno en tu cuerpo haciendo \nDaño: " + DanyoE);
        }
        else if (Arma == "Ballesta" && seleccionDeDialogo == 2) {
            System.out.println("Golpeo el perno en tu estomago \nDaño: " + DanyoE);
        }
        else if (Arma == "Ballesta" && seleccionDeDialogo == 3) {
            System.out.println("Disparo una flecha en tu brazo \nDaño: " + DanyoE);
        }

        if (Vida > maxVida){
            Vida = maxVida;
        }

        return DanyoE;
    }
}
