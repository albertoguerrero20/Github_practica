
/**
 * Write a description of class Articulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Articulo
{
    private int duracion;
    private String titulo;
    private boolean loTengo;
    private String comentario;

    public Articulo(int duracion, String titulo)
    {
        this.duracion = duracion;
        this.titulo = titulo;
        this.loTengo = false;
        this.comentario = "";
    }
}
