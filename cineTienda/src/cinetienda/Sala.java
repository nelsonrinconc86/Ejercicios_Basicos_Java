
package cinetienda;

import java.util.Scanner;

public class Sala {
    public String tipoSala;
    public int cantidadSillas;

    public Sala(String datoTipo) {
        this.tipoSala = datoTipo;
    }

    public String getTipoSala() {
        return tipoSala;
    }
    
    public void setTipoSala(String datoTipo){
        this.tipoSala = datoTipo;
    }

    public String imprimirSala() {
        return "Sala{" + "tipoSala=" + tipoSala + '}';
    }
    
    public void tomarDatos_sala(){
        Scanner objTeclado = new Scanner(System.in);
        System.out.println("Digite el tipo de sala");
        String auxTipo = objTeclado.nextLine();
        
        System.out.println("Digite el numero de sillas");
        int auxCantidad = objTeclado.nextInt();
        this.setTipoSala(auxTipo);
        this.cantidadSillas = auxCantidad;
    }
    
    
    
    
    
}
