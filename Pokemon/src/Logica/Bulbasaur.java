package Logica;
/**
 * Clase que representa a Bulbasaur.
 * Debe implementar obligatoriamente los métodos de la clase abstracta Pokemon
 * y de la interfaz IPlanta (Contrato de Implementación).
 * * @author Javier Vicente Mora
 */
public class Bulbasaur extends Pokemon implements IPlanta {


    // ATRIBUTOS
        // No se declaran atributos aquí porque ya se heredan de la clase padre (Pokemon).
        // Bulbasaur ya posee nombre, peso, sexo, etc., gracias a la herencia.

    // CONSTRUCTORES
    public Bulbasaur(){}

    public Bulbasaur(String nombre){
        this.nombre = nombre;
    }

    // MÉTODOS GET Y SET
        // No es necesario definirlos aquí. Bulbasaur los hereda automáticamente de la clase Pokemon.
        // Al ser métodos públicos en la clase padre, podemos usarlos directamente desde el Main.


    // MÉTODOS
        // Se usa @Override porque estamos dando cuerpo a métodos
        // definidos en la clase padre (Pokemon) y en la interfaz (IPlanta).
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Bulbasour y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Bulbasour y este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Bulbasour y este es mi ataque Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasour y este es mi ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy " + this.getNombre() + " y este es mi ataque Paralizar");
    }
}
