
package Modelo;

public class Homicidios extends Detective{
    
    private Detective detective2;
    
    public Homicidios() {
    }

    public Homicidios(Detective detective2) {
        this.detective2 = detective2;
    }

    public Detective getDetective2() {
        return detective2;
    }

    public void setDetective2(Detective detective2) {
        this.detective2 = detective2;
    }
}
