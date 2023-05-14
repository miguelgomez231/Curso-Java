/*○
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.integrador;

import Entidades.Estudiantes;
import Servicios.EstudiantesServices;
import java.util.Arrays;

/**
 *
 * @author Miguel Ángel
 */
public class EjercicioIntegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiantes[] estudiantes = new Estudiantes[8];
        
        // Crear los estudiantes con sus respectivas notas
        estudiantes[0] = new Estudiantes("Estudiante 1", 8.5);
        estudiantes[1] = new Estudiantes("Estudiante 2", 7.0);
        estudiantes[2] = new Estudiantes("Estudiante 3", 6.8);
        estudiantes[3] = new Estudiantes("Estudiante 4", 9.2);
        estudiantes[4] = new Estudiantes("Estudiante 5", 7.5);
        estudiantes[5] = new Estudiantes("Estudiante 6", 8.0);
        estudiantes[6] = new Estudiantes("Estudiante 7", 6.5);
        estudiantes[7] = new Estudiantes("Estudiante 8", 9.0);
        
        EstudiantesServices servicios = new EstudiantesServices();

        // Calcular y mostrar el promedio de notas de todo el curso
        double promedio = servicios.promedio(estudiantes);
        System.out.println("Promedio del curso: " + promedio);
        
        String[] alumPromedioSup = servicios.obtenerAlumnosPromedioSuperior(estudiantes, promedio);
        System.out.println("Los alumnos de promedio superior son: " + Arrays.toString(alumPromedioSup));
        servicios.mostrarEstudiantesPromedioSuperior(alumPromedioSup);
    
    }
    
     
}
