
/**
 * Write a description of class Corriente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Corriente extends Cuenta{
    private int minimo;

    public Corriente(String nombre, int importe,int recarga)
    {
        super(nombre, importe);
        minimo= 5;
    }

    public double recargo(double retiro){
        if (getSaldo() < minimo)
            return minimo-getSaldo();
        return 0;
    }
}
