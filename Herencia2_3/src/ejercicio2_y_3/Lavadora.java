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
public class Lavadora extends Electrodomestico {

    protected Scanner leer = new Scanner(System.in);

    protected double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public Lavadora creaLavadora() {
        System.out.println("");
        System.out.println("lavadora");
        System.out.println("");
        Electrodomestico el = super.crearElectrodomestico();
        System.out.println("Carga: ");
        double carga = leer.nextDouble();
        return new Lavadora(carga, el.getPrecio(), el.getColor(), el.getConsumoEnergetico(), el.getPeso());
    }

    public double precioFinalL() {
//        double precioFinal = super.precioFinal();
//        if (carga > 30) {
//            precioFinal += 500;
//        }

        return  carga>30 ?  this.precio = 500 + super.precioFinal():super.precioFinal();
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
