package Elementos.Enemigos;

import java.util.Random;

public abstract class Enemigo {
    protected String Nombre;
    protected String Tipo;
    protected String Arma;
    protected int Vida;



    // PUBLIC ENEMIGO //
    public Enemigo(String Nombre, String Tipo, String Arma, int Vida) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Arma = Arma;
        this.Vida = Vida;
    }
    public abstract int Atacar();
}
