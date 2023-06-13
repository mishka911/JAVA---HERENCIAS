/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author lorena
 */
public class Service {

    ArrayList<Edificio> edificios = new ArrayList<>();

    public void crearPolideportivo() {
        Polideportivo Poli1 = new Polideportivo("Superman", "techado", 2, 4, 3);
        Polideportivo Poli2 = new Polideportivo("Batman", "abierto", 5, 6, 7);
        edificios.add(Poli1);
        edificios.add(Poli2);
    }

    public void crearOficina() {
        EdificioDeOficinas Ofi1 = new EdificioDeOficinas(10, 10, 30);
        EdificioDeOficinas Ofi2 = new EdificioDeOficinas(20, 20, 60);
        Ofi1.cantPersonas();
        Ofi2.cantPersonas();
        edificios.add(Ofi1);
        edificios.add(Ofi2);
    }
    
    public void mostrarEdificios(){
        
        int i = 0;
        for (Edificio edificio : edificios) {

            if (edificio instanceof Polideportivo) {
                System.out.println("Polideportivo " + (i + 1));
                System.out.println(edificio.toString());
                i += 1;
            }
            System.out.println(" ");

            if (edificio instanceof EdificioDeOficinas) {
//                i=0;
                System.out.println("Edificio de Oficinas " + (i + 1));
                System.out.println(edificio.toString());
                i += 1;
            }
        }
        System.out.println(" ");
    }
    
    public void crearSuperficie(){
        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                int i=0;
                System.out.println("Polideportivo: " + (i+1));
                System.out.println("La superficie es: " + edificio.calcularSuperficie());
                System.out.println("El volumen es: " + edificio.calcularVolumen());
                i+=1;
            }
            System.out.println(" ");
            if (edificio instanceof EdificioDeOficinas){
                int i=0;
                System.out.println("Edificio de Oficina: " +(i+1));
                System.out.println("La superficie es: " + edificio.calcularSuperficie());
                System.out.println("El volumen es: " + edificio.calcularVolumen());
                i+=1;
                
            }
            
        }
    }
}

    
    
   


