
package cinetienda;

public class Cine {
    public int cantidadSalas;
    
    public Cine(int datoSala){
    this.cantidadSalas= datoSala;
    }
    
    public String imprimirSala(){
    String aux = "la sala tiene una cantidad de Salas: "+this.cantidadSalas;
    return aux;
    }
    
}
