package Logica;
import java.util.Scanner;
/**
 *
 * * @author Javier Vicente Mora
 * @version 1.0
 */

public class EjercicioPokemon{
public static void main(String[] args) {

        // 1. Creamos el primer Pokemon (Bulbasaur)
        Bulbasaur p1 = new Bulbasaur();
        p1.setNombre("Bulbi");
        p1.setNivel(15);

        // 2. Creamos el segundo Pokemon (Pikachu)

        Pikachu p2 = new Pikachu();
        p2.setNombre("Pika");
        p2.setNivel(20);

        System.out.println("--- COMPARACIÓN DE NIVELES ---");
        System.out.println(p1.getNombre() + " Nivel: " + p1.getNivel());
        System.out.println(p2.getNombre() + " Nivel: " + p2.getNivel());
        System.out.println("------------------------------");

        // 3. Usamos los métodos de la interfaz Relacionable

        // Probamos esMayorQue
        if (p1.esMayorQue(p2)) {
                System.out.println(p1.getNombre() + " es más fuerte que " + p2.getNombre());
        } else if (p1.esMenorQue(p2)) {
                System.out.println(p1.getNombre() + " es más débil que " + p2.getNombre());
        } else if (p1.esIgualQue(p2)) {
                System.out.println("Ambos tienen el mismo nivel");
        }

        // 4. También puedes usar los ataques que definiste como abstractos
        System.out.println("\n--- ACCIONES ---");
        p1.atacarAraniazo();
        p2.atacarPlacaje();


    }
}