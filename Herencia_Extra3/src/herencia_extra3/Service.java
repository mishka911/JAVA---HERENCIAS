/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Vane Proaño
 */
public class Service {

    ArrayList<Alojamiento> alojamiento = new ArrayList();

    public void creacion() {
        double x = 0;
        double y = 0;

        Hotel4estrella h4 = new Hotel4estrella("B", "Katari", 11, 20, 7, 4, y, "Hotel4", "Bolivia", "miraflores", "sakura");
        y = h4.calcularPrecioH();
        h4.setPrecio(y);

        Hotel4estrella h42 = new Hotel4estrella("A", "Bellavista", 10, 5, 7, 7, y, "Hotel4.2", "Quito", "La Gasca", "Goku");
        y = h42.calcularPrecioH();
        h4.setPrecio(y);

        Hotel5estrella h5 = new Hotel5estrella("Pepudo1", "Crustaceo Cascarudo", 10, 5, 7, 7,8, 9, 10, x, "Hotel5", "Shyris", "Quito", "Pepe");
        x = h5.calcularPrecioH();
        h5.setPrecio(x);

        Hotel5estrella h51 = new Hotel5estrella("Pepudo2", "Crustaceo Cascarudo2", 11, 3, 8, 5, 6, 7, 8, x, "Hotel5.2", "Republica del Salvador", "Quito", "Pepa");
        x = h51.calcularPrecioH();
        h5.setPrecio(x);

        Camping camp1 = new Camping(5, 3, true, true, 20.23, "campi1", "el bosque", "narnia", "el oso yogi");
        Camping camp2 = new Camping(4, 6, true, false, 50.45, "camp2", "el bosque", "narnia", "bambi");

        Residencia r1 = new Residencia(7, true, true, true, 40.15, "resi1", "la china", "el bosque magico", "Homero");
        Residencia r2 = new Residencia(9, false, true, true, 78.89, "resi2", "los jardines", "el bosque magico", "tambor");

        alojamiento.add(h4);
        alojamiento.add(h42);
        alojamiento.add(h5);
        alojamiento.add(h51);
        alojamiento.add(camp1);
        alojamiento.add(camp2);
        alojamiento.add(r1);
        alojamiento.add(r2);

    }

    public void mostrarAlojamientos() {
        System.out.println("todos los alojamientos");
        for (Alojamiento alojamiento1 : alojamiento) {
            System.out.println(alojamiento1.toString());
            System.out.println("");
        }

    }

    public void ordenarHoteles() {
        System.out.println("hoteles de acuerdo al precio");
        List<Hotel> hotel = new ArrayList();
        for (Alojamiento alojamiento1 : alojamiento) {
            if (alojamiento1 instanceof Hotel) {
                hotel.add((Hotel) alojamiento1);

            }

        }
        hotel.sort(Comparator.comparingDouble(Hotel::calcularPrecioH).reversed());
               
       System.out.println("Hotel   -    Precio");
        System.out.println("-------------------");
            for (Hotel hotel1 : hotel) {
           System.out.println(hotel1.nombre + "    -   " + hotel1.precio);  
            System.out.println("");
        }
 

    }
    
    public void campingRestaurante(){
         System.out.println("campings con restaurantes");
           System.out.println("Nombre    -    Restaurante");
        System.out.println("---------------------------");
        for (Alojamiento alojamiento : alojamiento) {
            if (alojamiento instanceof Camping) {
                if (((Camping) alojamiento).isTienerestaurante()) {
                    System.out.println(((Camping) alojamiento).nombre
                            + "  -   " + ((Camping) alojamiento).trueToDisp());
                }

            }

        }
    }
    
       public void residenciaDescuentos() {
           System.out.println("residencias con descuentos");

        for (Alojamiento alojamiento : alojamiento) {
            if (alojamiento instanceof Residencia) {
                if (((Residencia) alojamiento).descuentosGremios()) {
                    System.out.println(alojamiento);
                }

            }

        }
    }
    }
        
        


