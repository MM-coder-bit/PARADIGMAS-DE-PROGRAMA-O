// package Aula1;

// Importando as entidades
import entities.Aquatico;
import entities.Mamifero;
/**
 *
 * @author Mateus Marques
 */
public class Aula1 
{
    public Aula1() // Metodo Construtor
{

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Os animais Mamiferos: "+ Mamifero.caraAnimal1 + Mamifero.caraAnimal2 + Mamifero.caraMamiferos1 + Mamifero.caraMamiferos2);
        System.out.println("Os animais Aquaticos: "+ Aquatico.caraAnimal1 + Aquatico.caraAnimal2 + Aquatico.caraAquatico1 + Aquatico.caraAquatico2);


        // TODO code application logic here
    }
}
