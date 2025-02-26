
package cinetienda;

import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        String opcion="";
        Scanner objTeclado = new Scanner(System.in);
        
         do {
            System.out.println("1. Hacer Reserva silla");
            System.out.println("0. Salir");
            System.out.println("Seleccione Opcion");
            opcion = objTeclado.nextLine();
            
            switch(opcion){
            case "1":
                System.out.println("Digite el nombre cliente: ");
                String nombreCliente = objTeclado.nextLine();
                System.out.println("Digite el apellido cliente: ");
                String apellidoCliente = objTeclado.nextLine();
                System.out.println("Digite el tipo Cliente: ");
                String tipoCliente = objTeclado.nextLine();
                Usuario objUsuario = new Usuario(nombreCliente, apellidoCliente, tipoCliente);
                Silla objSilla = objUsuario.hacerReserva();
                objSilla.validarSilla(objSilla);
                break;                
                
            case "0":
                opcion="0";
                System.out.println("Saliendo del sistema....");
                break;   
            }
        }/*fin del DO */ while (!"0".equals(opcion));
         
         
          
            
        }//fin del MAIN
}//fin de la clase Principal