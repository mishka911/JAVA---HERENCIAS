/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.main;

import ejercicio1.Caballo;
import ejercicio1.Gato;
import ejercicio1.Perro;


/**
 *
 * @author Vane Proaño
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro perro = new Perro("perro", "firulais", "croquetas", 5, "husky");
        System.out.println(perro.alimentarseAnimal());   
       
        Gato gato = new Gato("gato","copo", "ratones", 3, "angora");
        System.out.println(gato.alimentarseAnimal());
        
        Caballo caballo = new Caballo("caballo","spirit", "pasto", 7, "pura sangre");
        System.out.println(caballo.alimentarseAnimal());
        

    }
    
}
