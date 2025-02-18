
package tiendaejecicios;

//1. crear la clase
public class TiendaEjecicios {
    
    public static void main(String[] args) {
        //5. llamar objeto
        Ejercicio1 objEjercicio1 = new Ejercicio1();
        //7. llmar metodos
        boolean aux=objEjercicio1.tomarDatos();
        System.out.println("Estado del cliente: "+ aux);
    }
    
}
