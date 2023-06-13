/*
Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package entidades;

/**
 *
 * @author lorena
 */
public class Polideportivo extends Edificio {
    
    //ATRIBUTOS
    private String nombre, tipoInstalacion;
    
    //CONTRUCTORES
    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

   
    
    //METODOS
    @Override
    public double calcularSuperficie() {//area
        double superficie = largo * ancho;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen = largo * ancho * alto;
        return volumen;
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre + "\nTipo de Instalacion: " + tipoInstalacion;
    }
    
    
}
