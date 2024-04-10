
/**
 * Write a description of class Ahorro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ahorro extends Cuenta
{
    private int interes;

    public Ahorro(int interes,String nombre, int importe)
    {
        super(nombre, importe);
        this.interes = interes;
    }

    public double aplicarIntereses()
    {
        return getSaldo()*interes;
    }
}