/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_extra4.main;

import herencia_extra4.Empleado;
import herencia_extra4.Estudiante;
import herencia_extra4.Persona;
import herencia_extra4.Personal_Servicio;
import herencia_extra4.Profesor;

/**
 *
 * @author Vane Proaño
 */
public class Herencia_Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Estudiante estudiante = new Estudiante("biologia", "vanessa", "acebo", 123456789,"soltera");
       Estudiante estudiante1 = new Estudiante("psicologia", "andres", "tixi", 44554, "casado");
       
       Profesor profesor = new Profesor("ciencias de magia", "voldemort", "slytherin", 557788, "divorciado");
             
      Personal_Servicio ps1 = new Personal_Servicio("B", 2, 4, "milton","perez", 22233, "divorciado");
       
       Empleado em = new Empleado(2021, 400, "pepe", "suarez", 852963, "viudo");
       
         System.out.println("*************** Datos Iniciales ***************");
        System.out.println();
        System.out.println("Estudiante 1:");
        printTable(estudiante);
        System.out.println();
        System.out.println("Estudiante 2:");
        printTable(estudiante1);
        System.out.println();
        System.out.println("Profesor:");
        printTable(profesor);
        System.out.println();
        System.out.println("Personal de Servicio:");
        printTable(ps1);
        System.out.println();
        System.out.println("Empleado:");
        printTable(em);
        System.out.println();
        System.out.println("*************************************************");
        System.out.println("*************** Datos Cambiados *****************");
        System.out.println();
        System.out.println("Cambio de estado civil de una persona");
        estudiante.nuevoEstado("Casada");
        System.out.println("Estudiante 1:");
        printTable(estudiante);
        System.out.println();
        System.out.println("Reasignación de despacho a un empleado");
        em.cambioDespacho(5000);
        System.out.println("Empleado:");
        printTable(em);
        System.out.println();
        System.out.println("Matriculación de un estudiante en un nuevo curso");
        estudiante1.nuevoCurso("Francés");
        System.out.println("Estudiante 2:");
        printTable(estudiante1);
        System.out.println();
        System.out.println("Cambio de departamento de un profesor");
        profesor.cambioDepartamento("Departamento de Magia Oscura");
        System.out.println("Profesor:");
        printTable(profesor);
        System.out.println();
        System.out.println("Traslado de sección de un empleado del personal de servicio");
        ps1.trasladoSeccion("C");
        System.out.println("Personal de Servicio:");
        printTable(ps1);
    }
    
        public static void printTable(Persona persona) {
        System.out.println("+----------------------+");
        System.out.println("| Nombre: " + persona.getNombre());
        System.out.println("| Apellidos: " + persona.getApellido());
        System.out.println("| Identificación: " + persona.getDni());
        System.out.println("| Estado Civil: " + persona.getEstadoCivil());
        if (persona instanceof Empleado) {
            Empleado empleado = (Empleado) persona;
            System.out.println("| Año de incorporación: " + empleado.getAnioIncorp());
            System.out.println("| Número de despacho: " + empleado.getNumDespacho());
        }
        if (persona instanceof Estudiante) {
            Estudiante estudiante = (Estudiante) persona;
            System.out.println("| Curso matriculado: " + estudiante.getCurso());
        }
        if (persona instanceof Profesor) {
            Profesor profesor = (Profesor) persona;
            System.out.println("| Departamento: " + profesor.getDepartamento());
        }
        if (persona instanceof Personal_Servicio) {
            Personal_Servicio ps1 = (Personal_Servicio) persona;
            System.out.println("| Sección asignada: " +ps1.getSeccion());
        }
        System.out.println("+----------------------+");
    }

    }
    

