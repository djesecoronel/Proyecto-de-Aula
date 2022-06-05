 
package Modelo;

public class Bitacora extends Caso{
    
    private String ingreso;
    private String informacion;
    
    public Bitacora(){
        
    }

    public Bitacora(String ingreso, String informacion) {
        this.ingreso = ingreso;
        this.informacion = informacion;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
    
    @Override
    public String toString(){
        return "\n\nBitácora de la investigación: "+this.getIngreso()+"\nInformacion "
                + "correspondiente: "+this.getInformacion();
    }
    
}
