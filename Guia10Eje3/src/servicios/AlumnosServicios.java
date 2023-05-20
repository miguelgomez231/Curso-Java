/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class AlumnosServicios {
    
    private Scanner leer = new Scanner(System.in);
    private ArrayList<Alumno> alum = new ArrayList();
    
    public void cargarAlumnos(){
        boolean salir = true;
        
        do {
            Alumno alumno = new Alumno();
            
            System.out.println("Ingrese el nombre del alumno");
            alumno.setNombre(leer.next()) ;
            System.out.println("Igrese su nota 1: ");
            alumno.getNotas().add(leer.nextInt());
            System.out.println("Igrese su nota 2: ");
            alumno.getNotas().add(leer.nextInt());
            System.out.println("Igrese su nota 3: ");
            alumno.getNotas().add(leer.nextInt());    
            
            alum.add(alumno);
            
            System.out.println("Desea seguir agregando alumnos? S/N");
            String respuesta = leer.next();
            if (!respuesta.equalsIgnoreCase("S")) {
                salir = false;
            }
        } while (salir);
        
        System.out.println(alum.toString());
    }
    
//    public void buscarAlumnol(){
//        System.out.println("Que alumno desea buscar?: ");
//        String aux = leer.next();
//        Iterator it = alum.iterator();
//        while (it.hasNext()){
//            if (it.next().equals(aux)) {
//                notaFinal();
//            } 
//        }
//    }
    
    public void notaFinal(){
        System.out.println("Ingrese el nombre a buscar: ");
        String aux = leer.next();
        
        for (Alumno alumno : alum) {
            if (alumno.getNombre().equalsIgnoreCase(aux)) {
                double n1= alumno.getNotas().get(0);
                double n2 = alumno.getNotas().get(1);
                double n3 = alumno.getNotas().get(2);
                double promedio = (n1 + n2 + n3) / 3;
                System.out.println("El promedio de la persona " + aux + " es: " + promedio);
            } else {
                System.err.println("No se encontro ese nombre");
            }
            
        }
       
        
    }
}
