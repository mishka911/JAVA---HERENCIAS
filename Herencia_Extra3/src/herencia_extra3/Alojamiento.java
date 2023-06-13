/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra3;

/**
 *
 * @author Vane Proaño
 */
public class Alojamiento {
    
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getGerente() {
        return gerente;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alojamiento{");
        sb.append("\nnombre=").append(nombre);
        sb.append("\ndireccion=").append(direccion);
        sb.append("\nlocalidad=").append(localidad);
        sb.append("\ngerente=").append(gerente);
        sb.append('}');
        return sb.toString();
    }


    
    
}
