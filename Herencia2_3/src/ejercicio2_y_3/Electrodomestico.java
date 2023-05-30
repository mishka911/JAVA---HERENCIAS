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
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    protected Color letra;
    protected Scanner leer = new Scanner(System.in);

    public Electrodomestico() {
        this.precio = 1000;
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this();
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double comprobarConsumoEnergetico(char letra) {

        for (LetraConsumo letra1 : LetraConsumo.values()) {
            if (letra1.getLetra() == letra) {
                return this.precio += letra1.getPreciol();
            }

        }
        return this.precio += LetraConsumo.F.getPreciol();
    }

    public String comprobarColor(String color) {

        for (Color c : Color.values()) {

            if (c.getColor().equalsIgnoreCase(color)) {
                return c.getColor();
            }
        }

        return Color.BLANCO.getColor();
    }

    public static void tablaColor() {
        System.out.println("estas son los colores que estan disponibles de electrodomesticos: ");
        System.out.printf("%-18s%n", "Colores");
        System.out.println("----------------------");
        for (Color c : Color.values()) {
            System.out.printf("%-18s%n", c.getColor());
        }
    }

    public double precioPeso() {

        if (peso >= 1 && peso <= 19) {
            return precio += 100;
        } else if (peso > 20 && peso <= 49) {
            return precio += 500;
        } else if (peso > 50 && peso <= 79) {
            return precio += 800;
        } else {
            return precio += 1000;
        }

    }

    public double precioFinal() {
//        double precioFinal = precioPeso();
        precioPeso();
        comprobarConsumoEnergetico(consumoEnergetico);
//        int precioConsumo = comprobarConsumoEnergetico(consumoEnergetico);
        return this.precio;
    }

    public static void mostrarTablaConsumoEnergetico() {
        System.out.println("Estas son las letras disponibles de acuerdo al consumo de energía por cada electrodoméstico:");
        System.out.printf("%-18s %-18s%n", "Letras", "Precios");
        System.out.println("-------------------------------");
        for (LetraConsumo letra : LetraConsumo.values()) {
            System.out.printf("%-18s %-18s%n", letra.getLetra(), letra.getPreciol());
        }
    }

    public static void mostrarTablaPeso() {
        System.out.println("Estas son las pesos en kg con su respectivo precio por cada electrodoméstico:");
        System.out.printf("%-18s %-20s%n", "Peso", "Precios");
        System.out.println("-------------------------------");
        System.out.printf("%-18s %-18s%n", "Entre 1 y 19 kg", "$100");
        System.out.printf("%-18s %-18s%n", "Entre 20 y 49 kg", "$500");
        System.out.printf("%-18s %-18s%n", "Entre 50 y 79 kg", "$800");
        System.out.printf("%-18s %-20s%n", "Mayor que 80 kg", "$1000");

    }

    public char comprobarLetras(char letra) {

        for (LetraConsumo letra1 : LetraConsumo.values()) {
            if (letra1.getLetra() == letra) {
                return letra1.getLetra();
            }

        }
        return LetraConsumo.F.getLetra();
    }

    public Electrodomestico crearElectrodomestico() {

        System.out.println("Ingrese los datos de su electrodomestico");
        tablaColor();

        System.out.println("color: ");
        String color = comprobarColor(leer.next().toLowerCase());
        System.out.println(" ");

        mostrarTablaConsumoEnergetico();
        System.out.println("consumo energetico: ");
        char letra = comprobarLetras(leer.next().toUpperCase().charAt(0));

        System.out.println("");

        mostrarTablaPeso();
        System.out.println("peso: ");
        this.peso = leer.nextDouble();

       return new Electrodomestico(precio, color,  letra, peso);
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", letra=" + letra + '}';
    }

}
