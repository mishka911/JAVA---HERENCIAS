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
public class Rectangulo implements CalculosFormas {
    
   Scanner leer = new Scanner (System.in);
    double base;
    double altura;
    double area;
    double perimetro;

    @Override
    public void calcularArea() {
        System.out.println("");
        System.out.println("AREA RECTANGULO\n");
         System.out.print("base: ");
        base = leer.nextDouble();
        System.out.print("altura: ");
        altura = leer.nextDouble();
        
        area = base * altura;
        System.out.println("El area es de: " + String.format("%.2f", area));
                
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("");
        System.out.println("PERIMETRO RECTANGULO\n");
        System.out.print("base: ");
        base = leer.nextDouble();
        System.out.print("altura: ");
        altura = leer.nextDouble();
        
        perimetro = 2*(base + altura);
        System.out.println("El perimetro es: "+String.format("%.2f", perimetro));
    }
    
}
