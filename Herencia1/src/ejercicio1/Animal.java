/*
 *Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package ejercicio1;

/**
 *
 * @author Vane Proaño
 */
public abstract class Animal {
    
    protected String especie;
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal(String especie, String nombre, String alimento, int edad, String raza) {
        this.especie = especie;
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }


    
    public String alimentarseAnimal(){
      return   "El animal " + especie+ " "+nombre + " come " + alimento + ", su edad es de "+edad +" años y su raza es " + raza;
    }

     
}
