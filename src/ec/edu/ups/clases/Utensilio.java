package ec.edu.ups.clases;

/**
 * Utensilios
 * 
 * clase que permite saber informacion sobre utencilios del restautrante 
 * 
 * @version 1.0
 * @since 2019
 * @author Byron Godoy
 * @see http://ups.edu.ec
 */

public class Utensilio 
{

    @Override
    public String toString() 
    {
        return "Utensilio{" + "numeroMesa=" + numeroMesa + ", numeroPlato=" + numeroPlato + ", numeroCuchara=" + numeroCuchara + '}';
    }
    
    
    private int numeroMesa;
    private int numeroPlato;
    private int numeroCuchara;
    
    
    public void setnumeroMesa(int numeroMesa)
    {
        this.numeroMesa=numeroMesa; 
    }
    
    public void setnumeroPlato(int numeroPlato)
    {
        this.numeroPlato=numeroPlato; 
    }
    
    public void setnumeroCuchara(int numeroCuchara)
    {
        this.numeroCuchara=numeroCuchara;
    }
    public int getnumeroMesa()
    {
        return this.numeroMesa; 
    }
    public int getnumeroPlato()
    {
        return this.numeroPlato; 
    }
    public int getnumeroCuchara()
    {
        return this.numeroCuchara; 
    }
}
