
/**
 * Write a description of class tuCuenta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tuCuenta
{
    public static void main(String[] args)
    {
        double recargoAplicado=0;
        int recarga = 3;
        String nombre = "Carlos"; 
        int importe= 100;
        Corriente cuenta = new Corriente(nombre,importe,recarga);
        
        cuenta.ingresar(20);
        cuenta.reintegrar(10);
        recargoAplicado=cuenta.recargo(20);
        
        System.out.println(cuenta.toString());
    }
}
