/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra4;

/**
 *
 * @author Vane Proaño
 */
public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected String estadoCivil;

    public Persona(String nombre, String apellido, int dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

public void nuevoEstado(String cambioEstado){
    this.estadoCivil = cambioEstado;
}
        

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona");
        sb.append("\nnombre=").append(nombre);
        sb.append("\napellido=").append(apellido);
        sb.append("\ndni=").append(dni);
        sb.append("\nestadoCivil=").append(estadoCivil);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
