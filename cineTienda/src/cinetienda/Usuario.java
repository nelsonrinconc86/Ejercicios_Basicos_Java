
package cinetienda;


public class Usuario extends Persona{
    private String tipoCliente;
    
    public Usuario(String datoNombre, String datoApellido, String datoTipo){
        super(datoNombre, datoApellido);
        this.tipoCliente = datoTipo;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
       
    
    public Silla hacerReserva(){
        Silla objSilla = new Silla();
        objSilla.crearReserva();
        objSilla.imprimirSilla();
        objSilla.asignacionSala();
        System.out.println("Reserva exito...");
        return objSilla;
        
        
    }   
}
