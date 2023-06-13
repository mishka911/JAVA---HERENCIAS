/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra4;

/**
 *
 * @author Vane Proaño
 */
public class Estudiante extends Persona {
    
    protected String curso;

    public Estudiante(String curso, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void nuevoCurso(String nuevoCurso){
        this.curso= nuevoCurso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEstudiante");
        sb.append("\ncurso=").append(curso);
        sb.append('}');
        return super.toString()+sb.toString();
    }
    
    
    
}
