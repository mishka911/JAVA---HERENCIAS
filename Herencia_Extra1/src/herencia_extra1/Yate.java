/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Vane Proaño
 */
public class Yate extends Barco {
    
     protected int potenciaCV;
     protected int numCamarotes;


    public Yate(int potenciaCV, int numCamarotes, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public Yate() {
       
    }


    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }
    
    public Yate crearYate(){
         System.out.println("Ingrese los datos del Yate de Lujo");
       Barco b = super.crearBarco();
        System.out.print("Potencia en CV: ");
        int potenciaCV = leer.nextInt();
        System.out.print("Número de camarotes: ");
        int numCamarotes = leer.nextInt();
        return new Yate(potenciaCV, numCamarotes, b.getMatricula(), b.getEslora(), b.getAnioFabricacion());
    }
    
 
  public double calcularModulo() {
        return super.calcularModulo1() + potenciaCV + numCamarotes;
    }
 

    @Override
    public String toString() {
        return "Yate{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion +"potenciaCV=" + potenciaCV + ", numCamarotes=" + numCamarotes + '}';
    }
     
     
    
}
