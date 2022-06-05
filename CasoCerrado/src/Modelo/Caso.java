
package Modelo;

import java.util.Arrays;

public class Caso {
    private int numCaso;
    private String descripcionC;
    private String codPrioridad;
    private String nombreC;
    private Detective detective;
    private Sospechoso[] sospechoso;
    private Bitacora informacion;
    
    public Caso() {
          
    }

    public Caso(int numCaso, String descripcionC, String codPrioridad, String nombreC, Detective detective, Sospechoso[] sospechoso, Bitacora informacion) {
        this.numCaso = numCaso;
        this.descripcionC = descripcionC;
        this.codPrioridad = codPrioridad;
        this.nombreC = nombreC;
        this.detective = detective;
        this.sospechoso = sospechoso;
        this.informacion = informacion;
    }


    public int getNumCaso() {
        return numCaso;
    }

    public void setNumCaso(int numCaso) {
        this.numCaso = numCaso;
    }

    public String getDescripcionC() {
        return descripcionC;
    }

    public void setDescripCase(String descripcionC) {
        this.descripcionC = descripcionC;
    }

    public String getCodPrioridad() {
        return codPrioridad;
    }

    public void setCodPrioridad(String codPrioridad) {
        this.codPrioridad = codPrioridad;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public Detective getDetective() {
        return detective;
    }

    public void setDetective(Detective detective) {
        this.detective = detective;
    }

    public Sospechoso[] getSospechoso() {
        return sospechoso;
    }

    public void setSospechoso(Sospechoso[] sospechoso) {
        this.sospechoso = sospechoso;
    }

    public Bitacora getInfor() {
        return informacion;
    }

    public void setInfor(Bitacora informacion) {
        this.informacion = informacion;
    }

    
    
    @Override
   public String toString (){
       return "\n\n----------------------------------------------------"+"\nDatos del Caso: "+"\nID: "+this.getNumCaso()+"\nDescripción: "+this.getDescripcionC()
               +"\nCódigo de prioridad: "+this.getCodPrioridad()+"\n\nDetective Asignado: "+this.getDetective()
               +"\n\nNombre Clave: "+this.getNombreC()+"\nLista de Sospechosos: "+Arrays.toString(this.getSospechoso())
               +this.getInfor();
   }
    
}
