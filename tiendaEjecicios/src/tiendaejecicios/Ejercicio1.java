package tiendaejecicios;
//1. crear la clase

import java.util.Scanner;

public class Ejercicio1 {
//2. crear Atributos
String saludoCliente = "Hola cliente....";
//3. Crear constructor 
// da el estado inicial objeto
    public Ejercicio1(){
        
    }
    
    //4. crear metodos
    public boolean tomarDatos(){
        System.out.println(saludoCliente);
        Scanner objTeclado = new Scanner(System.in);
        System.out.println("escriba el nombre del cliente");
        String nombreCliente = objTeclado.nextLine();
        System.out.println("escriba el apellido del cliente");
        String apellidoCliente = objTeclado.nextLine();
        
       Ejercicio1.calcularDatos(nombreCliente, apellidoCliente);
        
        return true;        
    }
    private static void calcularDatos(String datoNombre, String datoApellodo){
        System.out.println("nombre cliente: " + datoNombre);
        System.out.println("apellido cliente: " + datoApellodo);
        
        
        
    }
    public void mortarResultados(){
        System.out.println(saludoCliente);
        
    }
  
    
    
    
}
