package ec.edu.ups.clases;

/**
 * Menu
 * 
 * clase que permite saber informacion del menu
 * 
 * @version 1.0
 * @since 2019
 * @author Byron Godoy
 * @see http://ups.edu.ec
 */

public class Menu 
{

    @Override
    public String toString() 
    {
        return "Menu{" + "nombreSeccion=" + nombreSeccion + ", nombreComida=" + nombreComida + ", costoComida=" + costoComida + '}';
    }
    
    
    private String nombreSeccion;
    private String nombreComida;
    private double costoComida;
    
    
    public void setnombreSeccion(String nombreSeccion)
    {
        this.nombreSeccion=nombreSeccion; 
    }
    
    public void setnombreComida(String nombreComida)
    {
        this.nombreComida=nombreComida; 
    }
    
    public void setcostoComida(double costoComida)
    {
        this.costoComida=costoComida;
    } 
    
    public String getnombreSeccion()
    {
        return nombreSeccion; 
    }
    
    public String getnombreComida()
    {
        return nombreComida; 
    }
    
    public double getcostoComida()
    {
        return costoComida;
    } 
}
