
/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego extends Articulo
{
    private int numeroJugadores;

    /**
     * Constructor for objects of class Juego
     */
    public Juego(int duracion, String titulo,int numJugadores)
    {
        super(duracion, titulo);
        numeroJugadores=numJugadores;
    }
}
