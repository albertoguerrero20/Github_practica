
/**
 * Write a description of class Cuenta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuenta
{
    // instance variables - replace the example below with your own
    private double importe;
    private String nombre;
    
    public Cuenta(String nombre, int importe)
    {
        this.importe = importe;
        this.nombre = nombre;
    }

    public double getSaldo()
    {
        return importe;
    }
    
    public void ingresar(int ingreso){
        importe += ingreso;
    }
    
    public void reintegrar(int reintegro){
        importe -= reintegro;
    }
    
    public String toString(){
        return "Nombre y prueba para el ejercicio de git y github " + nombre + "   Saldo " + importe;
    }
}
