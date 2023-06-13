/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra4;

/**
 *
 * @author Vane Proaño
 */
public class Personal_Servicio extends Empleado{
    
    protected String seccion;

    public Personal_Servicio(String seccion, int anioIncorp, int numDespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(anioIncorp, numDespacho, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }


 

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void trasladoSeccion (String nuevaSeccion){
        this.seccion= nuevaSeccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPersonal_Servicio");
        sb.append("\nseccion=").append(seccion);
        sb.append('}');
        return super.toString()+sb.toString();
    }

    
}
