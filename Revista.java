
/**
 * Write a description of class Revista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Revista extends Publicacion
{
    private int periodicidad;

    /**
     * Constructor for objects of class Revista
     */
    public Revista(String titulo,String autor,String isbn,String fecha,int periodicidad)
    {
        super(titulo,fecha);
        this.periodicidad = periodicidad;
    }

}
