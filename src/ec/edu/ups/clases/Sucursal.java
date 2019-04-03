package ec.edu.ups.clases;

/**
 * Sucursal
 * 
 * clase que permite saber todo sobre las sucursales 
 * 
 * @version 1.0
 * @since 2019
 * @author Byron Godoy
 * @see http://ups.edu.ec
 */

public class Sucursal 
{

    @Override
    public String toString() 
    {
        return "Sucursal{" + "numeroLocal=" + numeroLocal + ", nombreRes=" + nombreRes + ", direccionRes=" + direccionRes + '}';
    }
    
    
    private int numeroLocal;
    private String nombreRes;
    private String direccionRes;
    
    
    public void setnumeroLocal(int numeroLocal)
    {
        this.numeroLocal=numeroLocal; 
    }
    
    public void setnombreRes(String nombreRes)
    {
        this.nombreRes=nombreRes; 
    }
    
    public void setdireccionRes(String direccionRes)
    {
        this.direccionRes=direccionRes;
    } 
    
    public int getnumeroLocal()
    {
        return this.numeroLocal; 
    }
    
    public String getnombreRes()
    {
        return this.nombreRes; 
    }
    
    public String getdireccionRes()
    {
        return this.direccionRes; 
    }
}
