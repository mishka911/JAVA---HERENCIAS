/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_y_3.main;

import ejercicio2_y_3.Electrodomestico;
import ejercicio2_y_3.Lavadora;
import ejercicio2_y_3.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Vane Proaño
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Electrodomestico> electro = new ArrayList();

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        Lavadora lav = new Lavadora();
        Lavadora lav1 = new Lavadora();
        lav = lav.creaLavadora();
        lav1 = lav1.creaLavadora();

        electro.add(lav);
        electro.add(lav1);

        System.out.printf("Precio de lavadora es de: %.2f%n", lav.precioFinalL());
        System.out.println(lav);
        System.out.printf("Precio de lavadora es de: %.2f%n", lav1.precioFinalL());
        System.out.println(lav1);

        Televisor tele = new Televisor();
        Televisor tele1 = new Televisor();
        tele = tele.crearTelevisor();
        tele1 = tele1.crearTelevisor();

        electro.add(tele);
        electro.add(tele1);

        System.out.printf("Precio de televisor es de: %.2f%n", tele.precioFinalT());
        System.out.println(tele);
        System.out.printf("Precio de televisor es de: %.2f%n", tele1.precioFinalT());
        System.out.println(tele1);

        for (Electrodomestico electrodomestico : electro) {
            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += electrodomestico.getPrecio();
            }

            if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += electrodomestico.getPrecio();

            }

        }
        System.out.println("lavadoras: " +String.format("%.2f", precioTotalLavadoras));
        System.out.println("televisores: " + String.format("%.2f", precioTotalTelevisores));
        precioTotalElectrodomesticos = precioTotalLavadoras + precioTotalTelevisores;
        System.out.println("Precio Total de electrodomesticos: " + String.format("%.2f", precioTotalElectrodomesticos));

//        Lavadora lav = new Lavadora();
//           lav = lav.creaLavadora();
//           
//           System.out.printf("Precio de lavadora es de: %.2f%n", lav.precioFinal());
//           System.out.println(lav);
//        Televisor tele = new Televisor();
//        tele = tele.crearTelevisor();
//        
//         System.out.printf("Precio de televisor es de: %.2f%n", tele.precioFinal());
//         System.out.println(tele);
    }

}
