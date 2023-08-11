
package entity;

import java.util.Scanner;

public class Hombre {
    
    public void JugarConRobot(Robot robot) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese la acción (1-Avanzar, 2-Retroceder, 3-Bateria Actual , 4-Cargar , 5-Despertar , 6-Dormir ):");
            int accion = scanner.nextInt();

            switch (accion) {
                case 1:
                    System.out.println("Ingrese la cantidad de pasos:");
                    int pasosAvanzar = scanner.nextInt();
                    robot.Avanzar(pasosAvanzar);
                    break;

                case 2:
                    System.out.println("Ingrese la cantidad de pasos:");
                    int pasosRetroceder = scanner.nextInt();
                    robot.retroceder(pasosRetroceder);
                    break;

                case 3:
                    System.out.println("La beteria actual es: "+ robot.BateriaActual() );

                    break;

                case 4:
                    System.out.println("Batería restante: " + robot.BateriaActual());
                    break;

                case 5:

                    robot.Despierto();
                    break;


                case 6:

                    robot.Dormir();
                    break;

                default:
                    System.out.println("Acción inválida.");
                    break;
            }
        }
    }
    
}
