package Elementos;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Personaje {
    String Nombre;
    String Trabajo;
    String Arma;
    int maxVida;
    int Vida = maxVida;
    int Pociones = 5;
    Scanner in = new Scanner(System.in);

    // GET | SET - NOMBRE //
    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        System.out.println("INSERTA TU NOMBRE:");
        Nombre = in.nextLine();

        this.Nombre = Nombre;
    }



    // GET | SET - TRABAJO //
    public String getTrabajo(){
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        int select;
        boolean Pasa;

        do {
            System.out.println("¿Qué trabajo te gustaría elegir?\n" +
                    "========================\n" +
                    "==== 1. GUERRERO =======\n" +
                    "==== 2. MAGO ===========\n" +
                    "==== 3. ARQUERO ========\n" +
                    "==== 4. INFORMACIÓN ====\n" +
                    "========================");

            do {
                select = 1;
                Pasa = true;

                // Le pedimos al usuario cuál de las opciones del menu quiere
                try {
                    select = parseInt(in.nextLine());
                } catch (Exception ignored) {
                    System.out.println("Introduce un valor valido por favor");
                    Pasa = false;
                }
                if(select > 4 || select < 1){
                    System.out.println("Introduce un valor dentro del rango esperado por favor");
                    Pasa = false;
                }

            }while(!Pasa);

            // Switch que hará referencia a la variable select
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



    // INFO DE LOS TRABAJOS //
    public void infoTrabajos(){
        System.out.println("Esta es la información de los trabajos:\n\n" +
                "Guerrero: Hábil espadachín curtido en el campo de batalla, obtienes una espada con la que combatir contra tus enemigos.\n\n" +
                "Mago: Erudito que ha dedicado buena suma de su vida a aprender el noble arte de la magia, obtienes un bastón con el que combatir contra tus enemigos.\n\n" +
                "Arquero: Intrépido cazador de los bosques, ágil como el solo y un dominio sin igual con el arco, obtienes un arco con el que combatir contra tus enemigos\n");
    }



    // GET | SET - ARMA //
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



    // POCIONES //
    public void Pocion(){
        int vidaCurada = (int) (Math.random() * ((6 - 1) + 1)) + 1;
        System.out.println("Pociones restantes: " + Pociones);

        if(Pociones > 0){
            System.out.println("Te bebes una poción, esta te cura " + vidaCurada);
            Pociones = Pociones - 1;
            Vida = Vida + vidaCurada;
            if (Vida > maxVida){
                Vida = maxVida;
            }
        }else if(Pociones <= 0){
            System.out.println("Parece que no te quedan pociones, solo te queda atacar...");
            Atacar();
        }
    }



    // ATACAR //
    public int Atacar (){
        int seleccionDeDialogo = (int) (Math.random() * ((5 - 1) + 1)) + 1;
        int vidaCurada = (int) (Math.random() * ((2 - 1) + 1)) + 1;
        int Danyo = (int) (Math.random() * ((10 - 5) + 1)) + 5;
        int danyoExtraArquero = (int) (Math.random() * ((7 - 1) + 1)) + 1;


        // TEXTOS DEL GUERRERO //
        if(Trabajo == "Guerrero" && seleccionDeDialogo == 1){
            System.out.println("Te abalanzas con tu espada y asestas un golpe que podrías haber partido en 2 al enemigo\nDaño: " + Danyo + "\n");
        }
        else  if(Trabajo == "Guerrero" && seleccionDeDialogo == 2){
            System.out.println("Te embistes con el enemigo, este ha salido volando por los aires\nDaño: " + Danyo + "\n");
        }
        else  if(Trabajo == "Guerrero" && seleccionDeDialogo == 3){
            System.out.println("Rajas al enemigo, y en el proceso parece que le has roto una mini poción que te ha salpicado");
            Vida = Vida + vidaCurada;
            System.out.println("Daño: " + Danyo + "\nVida curada: +" + vidaCurada + "\n");
        }
        else  if(Trabajo == "Guerrero" && seleccionDeDialogo == 4){
            System.out.println("Decides lanzarle tu espada al enemigo, no fue tu mejor ataque, pero le diste");
            Danyo = Danyo - 1;
            System.out.println("Daño: " + Danyo + "\n");
        }
        else  if(Trabajo == "Guerrero" && seleccionDeDialogo == 5){
            System.out.println("Te aprovechas del entorno haciendo acrobacias, le das un patadote al enemigo para después embestirlo con fiereza con tu espada!");
            Danyo =  Danyo + 3;
            System.out.println("Daño: " + Danyo + "\n");
        }


        // TEXTOS DEL MAGO //
        if(Trabajo == "Mago" && seleccionDeDialogo == 1){
            System.out.println("Invocas una descarga de fuego con la que haces daño al enemigo\nDaño: " + Danyo + "\n");
        }
        else if(Trabajo == "Mago" && seleccionDeDialogo == 2){
            System.out.println("Con tus conocimientos arcanos, invocas un rayo de escarcha contra el enemigo\nDaño: " + Danyo + "\n");
        }
        else if(Trabajo == "Mago" && seleccionDeDialogo == 3){
            System.out.println("Lanzas al enemigo un rayo con el que lo fulminas\nDaño: " + Danyo + "\n");
        }
        else if(Trabajo == "Mago" && seleccionDeDialogo == 4){
            System.out.println("Decides empujar al enemigo con una descarga sobrenatural no muy potente para aprovecharte y curarte");
            Danyo = Danyo - 1;
            Vida = Vida + vidaCurada;
            System.out.println("Daño: " + Danyo + "\nVida curada: +" + vidaCurada + "\n");
        }
        else if(Trabajo == "Mago" && seleccionDeDialogo == 5){
            System.out.println("Invocas una bola de fuego al enemigo para calcinarlo con todo tu poder mágico!");
            Danyo =  Danyo + 2;
            System.out.println("Daño: " + Danyo + "\n");
        }


        // TEXTOS DEL ARQUERO //
        if(Trabajo == "Arquero" && seleccionDeDialogo == 1){
            System.out.println("Disparas al enemigo y le aciertas con éxito\nDaño: " + Danyo + "\n");
        }
        else if(Trabajo == "Arquero" && seleccionDeDialogo == 2){
            System.out.println("Le disparas en la rodilla, causas daños notorios");
            Danyo = Danyo + 1;
            System.out.println("Daño: " + Danyo + "\n");
        }
        else if(Trabajo == "Arquero" && seleccionDeDialogo == 3){
            System.out.println("Le disparas al enemigo, pero fallas tu golpe...");
            Danyo =  0;
            System.out.println("Daño: " + Danyo + "\n");
        }
        else if(Trabajo == "Arquero" && seleccionDeDialogo == 4){
            System.out.println("Aprovechas tu posición y le disparas 3 flechas en un turno al enemigo");
            Danyo = Danyo + danyoExtraArquero;
            System.out.println("Daño: " + Danyo + "\n");
        }
        else if(Trabajo == "Arquero" && seleccionDeDialogo == 5){
            System.out.println("Te escondes hábilmente sin que el enemigo se percate, y le asestas un letal golpe en la cabeza");
            Danyo = Danyo + danyoExtraArquero + 2;
            System.out.println("Daño: " + Danyo + "\n");
        }

        // Esto lo hago para que cuando se cure, no se pase del limite de vida establecido
        if (Vida > maxVida){
            Vida = maxVida;
        }

        return Danyo;
    }



    // MENU //
    public int Menu(){
        int danyo = 0;
        int Response = 0;
        boolean Pasa;
        String BarraHP = BarraHP();

        Vida = Vida - 1;
        // Hago el menu dentro de un do while para que el usuario no eliga un número que no corresponda
        do {
            Pasa = true;
        System.out.println("\nHP: \u001B[31m" + BarraHP + "\u001B[0m\n" +
                "======================\n" +
                "==== 1. ATACAR =======\n" +
                "==== 2. POCIÓN =======\n" +
                "======================\n");

        try {
            Response = parseInt(in.nextLine());
        }catch (Exception ignored){}

            switch (Response) {
                case 1:
                    danyo = Atacar();
                    break;
                case 2:
                    Pocion();
                    break;
                default:
                    Pasa = false;
                    System.out.println("Elige una de las opciones");
                    break;
            }
        }while(!Pasa);

        return danyo;
    }



    // BARRA DE HP //
    public String BarraHP(){
        StringBuilder Value = new StringBuilder("|");
        for (int i = 1; i < Vida; i++){
            Value.append("|");
        }
        return Value.toString();
    }
}
