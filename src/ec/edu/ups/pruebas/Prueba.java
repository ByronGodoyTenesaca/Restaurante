package ec.edu.ups.pruebas;
import ec.edu.ups.clases.Empleado;
import ec.edu.ups.clases.Menu;
import ec.edu.ups.clases.Reservacion;
import ec.edu.ups.clases.Sucursal;
import ec.edu.ups.clases.Utensilio;
import java.util.Scanner;

/**
 * Prueba
 * 
 * clase que permite llamar y traer la informacion de las clases 
 * 
 * @version 1.0
 * @since 2019
 * @author Byron Godoy
 * @see http://ups.edu.ec
 */

public class Prueba 
{
    public static void main(String []args)
    {
        Menu Lista=new Menu();
        Empleado Nombre=new Empleado();
        Sucursal Local=new Sucursal();
        Utensilio Objeto=new Utensilio();
        Reservacion Reserva=new Reservacion();
        Scanner x=new Scanner(System.in);
        
       String nomcomida, comida;
        double precio;
        System.out.print("Ingrese el nombre de la seccion de comida: ");
        nomcomida=x.next();
        System.out.print("Ingrese el nombre de la comida: ");
        comida=x.next();
        System.out.print("Ingrese el costo de "+comida+": ");
        precio=x.nextDouble();
        Lista.setnombreSeccion(nomcomida);
        Lista.setnombreComida(comida);
        Lista.setcostoComida(precio);
        
        
        
        
        String nombEm;
        double entrada, sueldo;
        System.out.print("Ingrese el nombre del empledo: ");
        nombEm=x.next();
        System.out.print("Ingrese la hora de entrada: ");
        entrada=x.nextDouble();
        System.out.print("Ingrese el sueldo: ");
        sueldo=x.nextDouble();
        Nombre.setnombreEmpleado(nombEm);
        Nombre.setentradaEmpelado(entrada);
        Nombre.setsueldoEmpleado(sueldo);
        
       
        
        int numL;
        String nombL, direc;
        System.out.print("Ingrese el nùmero del local: ");
        numL=x.nextInt();
        System.out.print("Ingrese el nombre del local: ");
        nombL=x.next();
        System.out.print("Ingrese la direccion del local: ");
        direc=x.next();
        Local.setnumeroLocal(numL);
        Local.setnombreRes(nombL);
        Local.setdireccionRes(direc);
       
        
        
        
        int pla, mes, cuc;
        System.out.print("Ingrese el numero de platos: ");
        pla=x.nextInt();
        System.out.print("Ingrese el numero de mesas: ");
        mes=x.nextInt();
        System.out.print("Ingrese el numero de cucharas: ");
        cuc=x.nextInt();
        Objeto.setnumeroPlato(pla);
        Objeto.setnumeroMesa(mes);
        Objeto.setnumeroCuchara(cuc);
        
        
        
        
        
        int mesR, codR;
        double horR;
        System.out.print("Ingrese la mesa de la reservacion: ");
        mesR=x.nextInt();
        System.out.print("Ingrese el codigo de la reservacion: ");
        codR=x.nextInt();
        System.out.print("Ingrese la hora de la reservacion: ");
        horR=x.nextDouble();
        Reserva.setnumeroMesaReservacion(mesR);
        Reserva.setcodigoReservacion(codR);
        Reserva.sethorarioReservacion(horR);
        
        System.out.println(Lista);
        System.out.println("Seccion: "+Lista.getnombreSeccion()); 
        System.out.println("Comida: "+Lista.getnombreComida());
        System.out.println("Costo: "+Lista.getcostoComida());
        
        System.out.println(Nombre);
        System.out.println("Empleado: "+Nombre.getnombreEmpleado());
        System.out.println("Sueldo: "+Nombre.getsueldoEmpleado());
        System.out.println("Entrada: "+Nombre.getentradaEmpleado());
        
        System.out.println(Local);
        System.out.println("Local: "+Local.getnumeroLocal());
        System.out.println("Nombre: "+Local.getnombreRes());
        System.out.println("Direcciion: "+Local.getdireccionRes());
        
        System.out.println(Objeto);
        System.out.println("Platos: "+Objeto.getnumeroPlato());
        System.out.println("Mesa: "+Objeto.getnumeroMesa());
        System.out.println("Cucharas: "+Objeto.getnumeroCuchara());
        
        System.out.println(Reserva);
        System.out.println("Mesa reservada: "+Reserva.getnumeroMesaReservacion());
        System.out.println("Codigo de reserva: "+Reserva.getcodigoReservacion());
        System.out.println("Hora de reserva: "+Reserva.gethorarioReservacion());
    }
}
