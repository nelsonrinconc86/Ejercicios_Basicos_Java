
package cinetienda;


public class Persona {
    //declaro atributos
    private String nombrePersona;
    private String apellidoPersona;
    
    public Persona(){
        this.nombrePersona = " ";
        this.apellidoPersona =" ";
    }
    
    public Persona(String datoNombre, String datoApellido){
        this.nombrePersona = datoNombre;
        this.apellidoPersona = datoApellido;
    }
    public void setNombre(String nombre) {
        this.nombrePersona = nombre;
    }

    public String getNombre() {
        return this.nombrePersona;
    }

    public String getApellido() {
        return apellidoPersona;
    }

    public void setApellido(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }
    
}
