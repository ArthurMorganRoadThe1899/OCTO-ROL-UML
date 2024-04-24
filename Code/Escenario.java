import Elementos.Personaje;

public class Escenario {
    public static void main(String[] args) {
        Personaje PJ = new Personaje();

        // ASIGNAR DATOS DEL JUGADOR
        PJ.setNombre("i");
        PJ.setTrabajo("i");

        // Esto es una prueba para probar que se pillar correctamente los trabajos
        System.out.println(PJ.getNombre());
        System.out.println(PJ.getTrabajo());
    }
}
