
package Modelo;

public class Cibercrimen extends Caso{
    
    private String linea;

    public Cibercrimen() {
    }
    public Cibercrimen(String linea) {
        this.linea = linea;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
 
}
