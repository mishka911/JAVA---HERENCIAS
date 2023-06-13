/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra3;

import java.util.Scanner;

/**
 *
 * @author Vane Proaño
 */
public class Menu {

    Scanner leer = new Scanner(System.in);
    Service s = new Service();

    public void menuTotal() {
        s.creacion();
        int opcion;

        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    s.mostrarAlojamientos();
                    break;
                case 2:
                    s.ordenarHoteles();
                    break;
                case 3:
                    s.campingRestaurante();
                    break;
                case 4:
                   s.residenciaDescuentos();
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro sistema");
                    break;
                default:
                    System.out.println("Ingrese un opción válida");
            }
        } while (opcion != 5);

    }

    public int menu() {

        System.out.println("----------Menu---------");
        System.out.println("1.Todos los alojamientos");
        System.out.println("2.Hoteles de más caro a más barato");
        System.out.println("3.Camping con restaurantes");
        System.out.println("4.Residencias con descuentos");
        System.out.println("5.Salir");
        System.out.println("Elija una opción");

        return leer.nextInt();

    }

}
