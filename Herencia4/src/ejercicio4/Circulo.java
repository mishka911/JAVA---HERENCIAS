/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Vane Proaño
 */
public class Circulo implements CalculosFormas{
    
    double radio;
    double area;
    double diametro;
    double perimetro;
    Scanner leer = new Scanner (System.in);

      
    @Override
    public void calcularArea() {
        System.out.println("");
        System.out.println("AREA CIRCULO\n");
        System.out.print("Radio: ");
        radio = leer.nextDouble();
        area = pi * Math.pow(radio, 2);
        System.out.println("El area es " + String.format("%.2f", area));
    } 

    @Override
    public void calcularPerimetro() {
        System.out.println("");
        System.out.println("PERIMETRO CIRCULO\n");
      System.out.print("Diametro: ");
        diametro = leer.nextDouble();
        perimetro = 2* pi * diametro;
        System.out.println("El perimetro es " +String.format("%.2f", perimetro));
    }
    
}
