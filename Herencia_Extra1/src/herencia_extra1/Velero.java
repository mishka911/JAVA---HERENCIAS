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
public class Velero extends Barco {

protected int numVeleros;

    public Velero(int numVeleros, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numVeleros = numVeleros;
    }

    Velero() {
    }

    public int getNumVeleros() {
        return numVeleros;
    }

    public void setNumVeleros(int numVeleros) {
        this.numVeleros = numVeleros;
    }

public Velero crearVelero(){
     System.out.println("\nIngrese los datos del Velero:");
       Barco b2 = super.crearBarco();
        System.out.print("Número de mástiles: ");
        int numVeleros = leer.nextInt();
        return new Velero (numVeleros, b2.getMatricula(), b2.getEslora(), b2.getAnioFabricacion());
    
}

  
  public double calcularModulo() {
        return super.calcularModulo1() + numVeleros;
    }
 

    @Override
    public String toString() {
        return "Velero{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion +"numVeleros=" + numVeleros + '}';
    }
        
    
    
}
