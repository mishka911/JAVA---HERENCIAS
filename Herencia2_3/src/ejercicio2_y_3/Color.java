/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio2_y_3;

/**
 *
 * @author Vane Proaño
 */
public enum Color {

    BLANCO("Blanco"),
    NEGRO("Negro"),
    ROJO("Rojo"),
    AZUL("Azul"),
    GRIS("Gris");

    private final String color;

    private Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Color{" + "color=" + color + '}';
    }

}
