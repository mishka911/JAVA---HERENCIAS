/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edificio.
 */
package entidades;

/**
 *
 * @author lorena
 */
//SUPERCLASS/CLASE MAMA
public abstract class Edificio {

    //ATRIBUTOS PROTECTED
    //El modificador de acceso protected en las superclases permite que las subclases puedan acceder a los 
    //atributos sin la necesidad de getters y setters.
    protected double ancho, largo,alto;

    //CONSTRUCTORES
    //Una diferencia entre los constructores y los métodos es que los constructores no se heredan, pero
    //los métodos sí. 
    //Todos los constructores definidos en una superclase pueden ser usados desde constructores de las 
    //subclases a través de la palabra clave SUPER. En los constructores de las subclases utilizando la palabra 
    //super podemos utilizar el contructor de la superclase y agregar los atributos propios de la subclase.
    public Edificio() {
    }

    public Edificio(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

   
   

    //METODOS
    //La palabra clave super tambien nos sirve para llamar a los métodos de la superclase en las subclases.
    //Todos los métodos accesibles o visibles de una superclase se heredan a sus subclases. 
    //Los métodos heredados pueden ser redefinidos en las clases hijas. Este mecanismo se lo llama
    //sobreescritura. Esto se logra poniendo la anotación @Override arriba del método que queremos 
    //sobreescribir.
    //Una subclase sobreescribe un método de su superclase cuando define un método con las mismas
    //características (nombre, número y tipo de argumentos) que el método de la superclase; agregando o 
    //modificando la funcionalidad del método heredado de la clase padre.
    public abstract double calcularSuperficie();

    public abstract double calcularVolumen();

    //METODOS ABSTRACTOS
    //Un método abstracto es un método declarado, pero no implementado, es decir, es un método del
    //que solo se escribe su nombre, parámetros, y tipo devuelto, pero no su código de implementación. 
    //Estos métodos se heredan y se sobreescriben por las clases hijas quienes son las responsables de 
    //implementar sus funcionalidades.
}
