package Elementos.Enemigos;

public class Orco extends Enemigo {
    String Nombre;
    String Tipo;
    String Arma;
    int seleccionDeDialogo;
    int vidaCurada;
    int DanyoE;
    int maxVida;
    int Vida = maxVida;


    // PUBLIC ORCO//
    public Orco(String Nombre, String Tipo, String Arma, int Vida, int maxVida) {
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



    // GET | SET - NOMBRE //
    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }



    // ATACAR //
    @Override
    public int Atacar() {
        int letalRate = (int) (Math.random() * ((2 - 1) + 1)) + 1;
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

        // Ataque con maza
        else if(Arma == "Mazo"){
            System.out.println(getNombre() + ": CATAPLOM CON MAZO");
            DanyoE =  DanyoE + 2;
            System.out.println("Daño: " + DanyoE);
        }
        else if(Arma == "Mazo" && seleccionDeDialogo == 1 && letalRate == 2){
            System.out.println(getNombre() + ": CATAPLOM CON MAZO");
            DanyoE =  DanyoE + 9;
            System.out.println("Daño: " + DanyoE);
        }
        else if(Arma == "Mazo" && seleccionDeDialogo == 1){
            System.out.println("El orco te pega un mazazo durísimo\nDaño: " + DanyoE);
        }
        else if(Arma == "Mazo" && seleccionDeDialogo == 2){
            System.out.println("El orco se pone a hacer un kaitengiri con su mazo sobre ti y te estampa sobre la pared\nDaño: " + DanyoE);
        }
        else if(Arma == "Mazo" && seleccionDeDialogo == 3){
            System.out.println("El orco te golpea con su maza con mucho empeño de alejarte de la siguiente sala\nDaño: " + DanyoE);
        }

        if (Vida > maxVida){
            Vida = maxVida;
        }

        return DanyoE;
    }



    // BARRA DE HP  Y MOSTRARLO //
    public String BarraHP(){
        StringBuilder Value = new StringBuilder("|");
        for (int i = 1; i < Vida; i++){
            Value.append("|");
        }
        return Value.toString();
    }


    public void mostrarHPEnemy(){
        String BarraHP = BarraHP();
        System.out.println("\n" + getNombre() +"\nHP: \u001B[35m" + BarraHP + "\u001B[0m\n");
    }



}
