/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4.main;

import ejercicio4.Circulo;
import ejercicio4.Rectangulo;

/**
 *
 * @author Vane Proaño
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo ();
        
        c.calcularPerimetro();
        c.calcularArea();
        
        r.calcularPerimetro();
        r.calcularArea();
        
    }
    
}
