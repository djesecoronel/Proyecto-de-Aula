
package Modelo;

public class Detective extends Caso{
    private int nId;
    private String nombre;
    private String apellido;
    private int experiencia;
    private String capacitacion;

    public Detective() {
        
    }
    
    public Detective(int nId, String nombre, String apellido, int experiencia, String capacitacion) {
        this.nId = nId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.experiencia = experiencia ;
        this.capacitacion = capacitacion;
    }

    public int getNId() {
        return nId;
    }

    public void setNId(int nId) {
        this.nId = nId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(String capacitacion) {
        this.capacitacion = capacitacion;
    }

    @Override
    public String toString(){
        return ""+"\nID: "+this.getNId()+"\nNombre: "+this.getNombre()
                +" "+this.getApellido()+"\nAños de Experiencia: "+this.getExperiencia();
    }
    
}
