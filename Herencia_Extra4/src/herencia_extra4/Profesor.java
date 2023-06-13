/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra4;

/**
 *
 * @author Vane Proaño
 */
public class Profesor extends Persona{
    
    protected String departamento;

    public Profesor(String departamento, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void cambioDepartamento (String nuevoDepartamento){
        this.departamento= nuevoDepartamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nProfesor");
        sb.append("\ndepartamento=").append(departamento);
        sb.append('}');
        return super.toString()+sb.toString();
    }
    
    
    
    
}
