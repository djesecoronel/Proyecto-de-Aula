
package Modelo;


public class Sospechoso extends Direccion{
    
    private int id;
    private String nombre;
    private String alias;
    private int edad;
    private String descripcion;
    
    
     public Sospechoso() {
        
    }

    
    public Sospechoso(int id, String nombre, String alias, int edad, String descripcion, String direccion, int numCasa, String localidad, String ciudad, String departamento, String pais) {
        super(direccion, numCasa, localidad, ciudad, departamento, pais);
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
        this.edad = edad;
        this.descripcion = descripcion;
    }
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    @Override
    public String toString(){
        return "\n\nDatos del Sospechoso:"+"\nID: "+this.getId()+"\nNombre: "+this.getNombre()
              +"\nAlias: "+this.getAlias()+"\nEdad: "+this.getEdad()+"\nDescripcion: "+this.getDescripcion()+""
                + "\nDireccion: "+this.getDireccion()+this.getLocalidad()+"Casa # "+this.getNumCasa()+this.getCiudad()+this.getDepartamento()+this.getPais();
    }

}
