
package cinetienda;

import java.util.Scanner;


public class Silla {
    private String codigoPuesto;
    private String estadoSilla;
    private Sala objSala = new Sala(null);
    
    
    public Silla(){
        this.codigoPuesto = " ";
        this.estadoSilla = "libre";
    }
    public String getEstado(){
        return this.codigoPuesto;
    }
    public void setEstado(String datoEstado){
        this.estadoSilla = datoEstado;
    }

    public void setCodigo(String fila) {
        this.codigoPuesto = fila;
    }

    public String getCodigo() {
        return codigoPuesto;
    }
    
    public void crearReserva(){
        Scanner objTeclado = new Scanner(System.in);
        System.out.println("Digite el codigo del puesto: ");
        String datoPuesto = objTeclado.nextLine();
        System.out.println("Confirme la Reserva: ");
        String datoEstado = objTeclado.nextLine();
        this.setCodigo(datoPuesto);
        this.setEstado(datoEstado);
    }

    public void validarSilla(Silla datoObj_silla){
        
        if(!"libre".equals(datoObj_silla.getEstado())){
            
            System.out.println("No se puede reservar...");
        }
        else{
            System.out.println("silla libre");
        }
    }
    public void imprimirSilla(){        
        String textoObj = "Puesto Silla: " + this.codigoPuesto +" - Estado silla: " + this.estadoSilla;
        System.out.println(textoObj);
    }
    public void asignacionSala(){
        this.objSala.tomarDatos_sala();
    }
    
}
