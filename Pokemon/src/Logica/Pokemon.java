package Logica;
/**
 * Esta clase define el modelo base para todos los Pokemon del sistema.
 * * @author Javier Vicente Mora
 * @version 1.0
 */

public abstract class Pokemon implements Relacionable {
// Abstract porque no existe un "Pokémon" como tal, es un concepto
// Todos los Pokemon que utilicemos van a poder heredar de ella y van a poder implementar estos atributos y estos métodos

    // --- Atributos ---
    protected int nivel; // Protected para que Solo las hijas tienes acceso
    protected String nombre;
    protected double peso;
    protected int temporada ;

    // --- Constructores ---
    protected Pokemon() {
    }

    // --- Getters y Setters ---
    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public int getTemporada() { return temporada; }
    public void setTemporada(int temporada) { this.temporada = temporada; }


    // Implementamos los métodos de Relacionable AQUÍ para no repetirlos
    // Los métodos de la interfaz (esMayorQue, esMenorQue, etc.)
    // los programamos en la clase Pokemon porque la lógica de comparación es la misma para todos.
    @Override
    public boolean esMayorQue(Relacionable a) {
        if (!(a instanceof Pokemon)) return false;
        Pokemon pok = (Pokemon) a; // Casteo: tratamos al Relacionable como Pokemon
        return this.nivel > pok.getNivel();
    }

    @Override
    public boolean esMenorQue(Relacionable a) {
        if (!(a instanceof Pokemon)) return false;
        Pokemon pok = (Pokemon) a;
        return this.nivel < pok.getNivel();
    }

    @Override
    public boolean esIgualQue(Relacionable a) {
        if (!(a instanceof Pokemon)) return false;
        Pokemon pok = (Pokemon) a;
        return this.nivel == pok.getNivel();
    }

    // --- Métodos ---
    //Los métodos como atacarPlacaje() o atacarAraniazo() se quedan vacíos (con abstract)
    // porque cada Pokémon ataca de una manera diferente.
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
}
