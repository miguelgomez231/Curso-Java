/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Servicios.FechaService;
import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class PersonaService {
     
    private Scanner leer = new Scanner(System.in, "ISO-8859-1");
    private FechaService fecha = new FechaService();
//  a)  Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
      //Retornar el objeto Persona creado.
    
    public Persona crearPersona(){
        System.out.print("Ingrese el nombre de la pesona:");
        String nombre = leer.nextLine();
        Date FechaNac = fecha.fechaNacimiento();
        
        return new Persona(nombre, FechaNac);
    }
    
//    b) Método calcularEdad que calcule la edad del usuario 
//       utilizando el atributo de fecha de nacimiento y la fecha actual.
    public int calcularEdad(Date FechaNac){
        
        return  fecha.diferencia(FechaNac, fecha.fechaActual());
    }
    
//    c) Método menorQue recibe como parámetro una Persona y una edad. 
//    Retorna true si la persona es menor que la edad 
//    consultada o false en caso contrario.
    
    public boolean menorQue(Persona persona, int edad){
        return calcularEdad(persona.getFechaNacimiento()) < edad;
    }
    
//    d) Método mostrarPersona que muestra la información de la persona deseada.
    
    public void mostrarPersona(Persona persona){
        System.out.println("La persona se llama " + persona.getNombre());
        System.out.println("---------------------------------");
        System.out.println("La fecha de nacimiento de " + persona.getNombre() + " es " + persona.getFechaNacimiento() );
        System.out.println("Tiene " + calcularEdad(persona.getFechaNacimiento()) + " años");
        System.out.println("Podra votar: " + !menorQue(persona, 16));
    }
    
}
