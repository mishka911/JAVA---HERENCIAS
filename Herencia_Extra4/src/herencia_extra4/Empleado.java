/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra4;

/**
 *
 * @author Vane Proaño
 */
public class Empleado extends Persona {
    protected int anioIncorp;
    protected int numDespacho;

    public Empleado(int anioIncorp, int numDespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIncorp = anioIncorp;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorp() {
        return anioIncorp;
    }

    public void setAnioIncorp(int anioIncorp) {
        this.anioIncorp = anioIncorp;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }
    
    public void cambioDespacho(int despachoNuevo){
        this.numDespacho = despachoNuevo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEmpleado{");
        sb.append("\naño incorporacion=").append(anioIncorp);
        sb.append("\nnumDespacho=").append(numDespacho);
        sb.append('}');
        return super.toString()+sb.toString();
    }
    
    
}
