/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_y_3;

import java.util.Scanner;

/**
 *
 * @author Vane Proaño
 */
public class Televisor extends Electrodomestico {
    
    protected int pulgadas;
    protected boolean sintonizadorTDT;
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    

    public Televisor() {
    }


    public Televisor(int pulgadas, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public Televisor crearTelevisor(){
        System.out.println("");
        System.out.println("televisor");
        System.out.println("");
        Electrodomestico el1 = super.crearElectrodomestico();
        System.out.println("Resolucion: ");
        int pulgadas = leer.nextInt();
        
        System.out.println("Tiene sintonizador? \nsi/no");
        boolean sTDT = leer.next().equalsIgnoreCase("si");
         
        
        return new Televisor ( pulgadas, sTDT, el1.getPrecio(), el1.getColor(), el1.getConsumoEnergetico(), el1.getPeso());
    }
    
    public double precioFinalT(){
    double precioFinal=  super.precioFinal();
        
        if (pulgadas > 40) {
          
            precioFinal*=1.3;
        }
        if(sintonizadorTDT ){
            precioFinal += 500;
        }
        
        return precioFinal;
        }

    @Override
    public String toString() {
        return "Televisor{" + "pulgadas=" + pulgadas + ", sintonizadorTDT=" + sintonizadorTDT + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso +  '}';
    }
    
    
    
}
