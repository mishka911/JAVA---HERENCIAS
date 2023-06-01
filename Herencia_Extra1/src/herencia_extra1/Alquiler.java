/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra1;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.format.DateTimeFormatter.ofPattern;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Vane Proaño
 */
public class Alquiler {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    protected String nombre;
    protected int dni;
    protected LocalDate fechaAlquiler;
    protected LocalDate fechaDevolucion;
    protected double amarre;
    
    protected Barco barco;

   
    public Alquiler(String nombre, int dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, double amarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.amarre = amarre;
        this.barco = barco;
    }

    public Alquiler() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getAmarre() {
        return amarre;
    }

    public void setAmarre(double amarre) {
        this.amarre = amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
      public double calcularPrecioAlquiler() {
        int diasOcupacion = (int) ChronoUnit.DAYS.between(fechaAlquiler,fechaDevolucion);
        double modulo = barco.calcularModulo1();
        return diasOcupacion * modulo;
      }
      
 

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", amarre=" + amarre + ", barco=" + barco + '}';
    }
      

     
}
