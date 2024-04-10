
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends Publicacion
{
    private String autor;
    private String isbn;
    
    /**
     * Constructor for objects of class Libro
     */
    public Libro(String autor,String isbn,String titulo,String fecha)
    {
        super(titulo,fecha);
        this.autor = autor;
        this.isbn  = isbn;        
    }

}
