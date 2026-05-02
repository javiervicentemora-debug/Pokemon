package Logica;

public class Pikachu extends Pokemon implements IElectrico {
    // ATRIBUTOS
    // No se declaran atributos aquí porque ya se heredan de la clase padre (Pokemon).
    // Bulbasaur ya posee nombre, peso, sexo, etc., gracias a la herencia.

    // CONSTRUCTORES
    public Pikachu(){}
    public Pikachu(String nombre){
        this.nombre = nombre;
    }

    // MÉTODOS
    // Se usa @Override porque estamos dando cuerpo a métodos
    // definidos en la clase padre (Pokemon) y en la interfaz (IElectrico).

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Pikachu y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Pikachu y este es mi ataque Placaje");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Pikachu y este es mi ataque Placaje");
    }



    @Override
    public void atacarImpactTrueno() {
        System.out.println("Soy Pikachu y este es mi ataque Impact Trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y este es mi Puño Trueno");
    }



}
