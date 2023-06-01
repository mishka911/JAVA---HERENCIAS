/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra1;

import java.time.LocalDate;

/**
 *
 * @author Vane Proaño
 */
public class BarcoMotor extends Barco  {
    
    protected int potenciaCV;


    public BarcoMotor(int potenciaCV, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    BarcoMotor() {
        
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

 public BarcoMotor crearBarcoMotor(){
         System.out.println("\nIngrese los datos del Barco a Motor:");
        Barco b1 = super.crearBarco();
        System.out.print("Potencia en CV: ");
        int potenciaCV = leer.nextInt();
       
     return new BarcoMotor(potenciaCV, b1.getMatricula(), b1.getEslora(), b1.getAnioFabricacion());
 }

  public double calcularModulo() {
        return super.calcularModulo1() + potenciaCV;
    }
 

    @Override
    public String toString() {
        return "BarcoMotor{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + ", potenciaCV=" + potenciaCV + '}';
    }
    
    
    
}
