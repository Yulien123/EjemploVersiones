
package entity;

/**
 *
 * @author julan
 */
public class Robot {

    private int bateria;
    private boolean dormido;

    public Robot() {
        bateria = 10000;
        dormido = false;

    }
    public void Avanzar(int pasos) {
        if (dormido == true) {
            bateria -= pasos / 100 * 100;
            System.out.println("Avanzando " + pasos + " pasos.");
        } else {
            System.out.println("No puedo avanzar, estoy dormido.");
        }
    }

    public void retroceder(int pasos) {
        if (dormido == true) {
            bateria -= pasos / 100 * 100;
            System.out.println("Retrocedio " + pasos + " pasos.");
        } else {
            System.out.println("No puedo retroceder mas , estoy dormido.");
        }
    }

    public void Despierto() {

        dormido = true;
        System.out.println("El robot se desperto");

    }

    public void Dormir() {

        dormido = false;

        System.out.println("El robot se durmio");

    }

    public void Recargar() {

        bateria = 1000;

        System.out.println("La bateria se recargo");
    }

    public boolean Bateriallena() {

        return bateria == 1000;

    }

    public boolean BateriaVacia() {

        return bateria == 0;

    }

    public int BateriaActual() {

        return bateria;

    }
}
