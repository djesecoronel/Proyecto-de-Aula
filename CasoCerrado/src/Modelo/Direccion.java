
package Modelo;

public class Direccion extends Caso{
    
    public String direccion;
    private int numCasa;
    private String localidad;
    private String ciudad;
    private String departamento; 
    private String pais;

    public Direccion() {
    }

    public Direccion(String direccion, int numCasa, String localidad, String ciudad, String departamento, String pais) {
        this.direccion = direccion;
        this.numCasa = numCasa;
        this.localidad = localidad;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    
    
    @Override
    public String toString(){
        return "Direccion conocida" + this.getDireccion() + "Numero de vivienda: " + 
                this.getNumCasa()+"Localidad: "+this.getLocalidad() + "\nCiudad: " +
                this.getCiudad() +"\nDepartamento: "+this.getDepartamento()+"\nPaís: "+this.getPais();
    }
}
