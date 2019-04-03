package ec.edu.ups.clases;

/**
 * Empleado
 * 
 * clase que permite saber informacion de los empleados
 * 
 * @version 1.0
 * @since 2019
 * @author Byron Godoy
 * @see http://ups.edu.ec
 */

public class Empleado 
{

    @Override
    public String toString() 
    {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + ", sueldoEmpleado=" + sueldoEmpleado + ", entradaEmpleado=" + entradaEmpleado + '}';
    }
    
    private String nombreEmpleado;
    private double sueldoEmpleado;
    private double entradaEmpleado;
    
    
    public void setnombreEmpleado(String nombreEmpleado)
    {
        this.nombreEmpleado=nombreEmpleado; 
    }
       
    public void setsueldoEmpleado(double sueldoEmpleado)
    {
        this.sueldoEmpleado=sueldoEmpleado; 
    }
    
    public void setentradaEmpelado(double entradaEmpleado)
    {
        this.entradaEmpleado=entradaEmpleado;
    } 
    
    public String getnombreEmpleado()
    {
        return this.nombreEmpleado; 
    }
    
    public double getsueldoEmpleado()
    {
        return this.sueldoEmpleado; 
    }
    
    public double getentradaEmpleado()
    {
        return this.entradaEmpleado; 
    }
}
