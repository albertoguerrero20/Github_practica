
/**
 * Write a description of class Videojuegos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Videojuegos extends Juego
{
    private String plataforma;

    /**
     * Constructor for objects of class Videojuegos
     */
    public Videojuegos(int duracion, String titulo,int numJugadores,String plataforma)
    {
        super(duracion,titulo,numJugadores);
        this.plataforma = plataforma;
    }

}
