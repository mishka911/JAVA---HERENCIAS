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
public class Barco {
    
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected String matricula;
    protected double eslora;
    protected int anioFabricacion;

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public Barco() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double calcularModulo1() {
        return eslora * 10;
    }
    
     public Barco crearBarco() {
        System.out.println("\nIngrese los datos del Barco");
        System.out.print("Matrícula: ");
        String matricula = leer.next();
        System.out.print("Eslora en metros: ");
        double eslora = leer.nextDouble();
        System.out.print("Año de fabricación: ");
        int anioFabricacion = leer.nextInt();

        return new Barco(matricula, eslora, anioFabricacion);
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + '}';
    }
    
     
    
}
