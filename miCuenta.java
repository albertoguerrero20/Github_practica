public class miCuenta
{
    public static void main(String[] args)
    {
        double pagar=0;
        int interes = 3;
        String nombre = "Carlos"; 
        int importe= 100;
        Ahorro cuenta = new Ahorro(interes,nombre,importe);
        
        cuenta.ingresar(20);
        cuenta.reintegrar(10);
        pagar=cuenta.aplicarIntereses();
        
        System.out.println(cuenta.toString());
    }
}
