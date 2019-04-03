package ec.edu.ups.clases;

/**
 * Reservacion
 * 
 * clase que permite saber la recervacion de los clientes
 * 
 * @version 1.0
 * @since 2019
 * @author Byron Godoy
 * @see http://ups.edu.ec
 */


public class Reservacion 
{

    @Override
    public String toString() 
    {
        return "Reservacion{" + "codigoReservacion=" + codigoReservacion + ", numeroMesaReservacion=" + numeroMesaReservacion + ", horarioReservacion=" + horarioReservacion + '}';
    }
    
    
    private int codigoReservacion;
    private int numeroMesaReservacion;
    private double horarioReservacion;
    
    
    public void setcodigoReservacion(int codigoReservacion)
    {
        this.codigoReservacion=codigoReservacion; 
    }
    
    public void setnumeroMesaReservacion(int numeroMesaReservacion)
    {
        this.numeroMesaReservacion=numeroMesaReservacion; 
    }
    
    public void sethorarioReservacion(double horarioReservacion)
    {
        this.horarioReservacion=horarioReservacion;
    }  
    
    public int getcodigoReservacion()
    {
        return this.codigoReservacion; 
    }
    
    public int getnumeroMesaReservacion()
    {
        return this.numeroMesaReservacion; 
    }
    
    public double gethorarioReservacion()
    {
        return this.horarioReservacion; 
    }
}
