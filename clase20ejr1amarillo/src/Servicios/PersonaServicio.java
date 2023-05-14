/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *  char sexo=sc.next().charAt(0); funcion para char
 * @author Miguel Ángel
 */
public class PersonaServicio {
    public Scanner leer = new Scanner(System.in);
    
    //a)
    public boolean esMayorDeEdad(Persona persona){
        return persona.getEdad() >=18;
    }
    
    //b)
    public void crearPersona(Persona persona){
        System.out.println("Ingrese el Nombre: ");
        String nombre = leer.next();
        persona.setNombre(nombre);
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        persona.setEdad(edad);
        System.out.println("Ingrese el sexo: H , M u O: ");
        char sexo = leer.next().charAt(0);

        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo incorrecto. Ingrese H, M u O.");
            sexo = leer.next().charAt(0);
        //
        }
        persona.setSexo(sexo);
        System.out.println("Ingrese el peso: ");
        double peso= leer.nextDouble();
        persona.setPeso(peso);
        System.out.println("Ingrese altura: ");
        double altura = leer.nextDouble();
        persona.setAltura(altura);
//       return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    //c)
    public int calcularIMC(Persona persona){
        //int calIMC ;
        double alturaEnMetros = persona.getAltura() / 100.0; // Convertimos altura de centímetros a metros
        double imc = persona.getPeso() / (alturaEnMetros * alturaEnMetros);
        if (imc < 20) {
            return -1; // Por debajo del peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // Peso ideal
        } else {
            return 1; // Sobrepeso
        }
     }

//    public void mostrarResultado(Persona persona1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
   
}
