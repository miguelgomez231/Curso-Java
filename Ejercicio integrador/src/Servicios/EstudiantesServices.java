/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Entidades.Estudiantes;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class EstudiantesServices {
    
   
    private Scanner leer = new Scanner(System.in, "ISO-8859-1");
    
    public double promedio(Estudiantes[] estudiantes){
        // Calcular y mostrar el promedio de notas de todo el curso
        double sumaNotas = 0;
        
        for (Estudiantes estudiante : estudiantes) {
            sumaNotas += estudiante.getNota();
        }
        
        return sumaNotas / estudiantes.length;
        
    }
    
    public String[] obtenerAlumnosPromedioSuperior(Estudiantes[] estudiantes, double promedio) {
        String[] alumnosPromedioSuperior = new String[estudiantes.length];
        int contador = 0;
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                alumnosPromedioSuperior[contador] = estudiante.getNombre();
                contador++;
            }
        }
        return Arrays.copyOfRange(alumnosPromedioSuperior, 0, contador);
    }
    
    public void mostrarEstudiantesPromedioSuperior(String[] alumPromedioSup) {
        System.out.println("Estudiantes con nota mayor al promedio:");
        for (String alumno : alumPromedioSup) {
            System.out.println(alumno);
        }
        
        for (int i = 2; i <= 128; i *=2) {
            System.out.println("i " + i);
            
        }
    }
    
}
