
package entity;


public class Bateria {

    private double carga = 1000 ;

    public Bateria(double carga) {
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
}
