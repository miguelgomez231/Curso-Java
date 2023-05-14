/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase20ejr1amarillo;

import Servicios.PersonaServicio;
import entidades.Persona;

/**
 *
 * @author Miguel Ángel
 */
public class Clase20ejr1amarillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //TODO code application logic here
        PersonaServicio serv = new PersonaServicio();
        Persona per1 = new Persona();
        Persona per2 = new Persona();
        Persona per3 = new Persona();
        Persona per4 = new Persona();
        //Creamos los arrays
        double[] bajoPeso = {0.0, 0.0, 0.0, 0.0};
        double[] sobrePeso = {0.0, 0.0, 0.0, 0.0};
        double[] buenPeso = {0.0, 0.0, 0.0, 0.0};
        double[] mayorEdad = {0.0, 0.0, 0.0, 0.0};
        double[] menorEdad = {0.0, 0.0, 0.0, 0.0};
        // Llamar métodos per1
        serv.crearPersona(per1);
        
        if (serv.calcularIMC(per1)== 1) {
            System.out.println(per1.getNombre()+ " tiene sobrepeso");
            sobrePeso[0]=1;
        } else if (serv.calcularIMC(per1)== -1) {
            System.out.println(per1.getNombre()+ " tiene peso bajo");
            bajoPeso[0]=1;
        } else if (serv.calcularIMC(per1)== 0) {
            System.out.println(per1.getNombre()+ " tiene peso correcto");
            buenPeso[0]=1;
        }
        
        if (serv.esMayorDeEdad(per1)) {
            System.out.println("Es mayor edad");
            mayorEdad[0]=1;
        } else {
            System.out.println("Es menor de edad");
            menorEdad[0]=1;
        }
        serv.crearPersona(per2);
        if (serv.calcularIMC(per2)== 1) {
            System.out.println(per2.getNombre()+ " tiene sobrepeso");  
            sobrePeso[1]=1;
        } else if (serv.calcularIMC(per2)== -1) {
            System.out.println(per2.getNombre()+ " tiene peso bajo");
            bajoPeso[1]=1;
        } else if (serv.calcularIMC(per2)== 0) {
            System.out.println(per2.getNombre()+ " tiene peso correcto");
            buenPeso[1]=1;
        }
        
        if (serv.esMayorDeEdad(per2)) {
            System.out.println("Es mayor edad");
            mayorEdad[1]=1;
        } else {
            System.out.println("Es menor de edad");
            menorEdad[1]=1;
        }
        serv.crearPersona(per3);
        if (serv.calcularIMC(per3)== 1) {
            System.out.println(per3.getNombre()+ " tiene sobrepeso");  
            sobrePeso[2]=1;
        } else if (serv.calcularIMC(per3)== -1) {
            System.out.println(per3.getNombre()+ " tiene peso bajo");
            bajoPeso[2]=1;
        } else if (serv.calcularIMC(per3)== 0) {
            System.out.println(per3.getNombre()+ " tiene peso correcto");
            buenPeso[2]=1;
        }
        
        if (serv.esMayorDeEdad(per3)) {
            System.out.println("Es mayor edad");
            mayorEdad[2]=1;
        } else {
            System.out.println("Es menor de edad");
            menorEdad[2]=1;
        }
        serv.crearPersona(per4);
        if (serv.calcularIMC(per4)== 1) {
            System.out.println(per4.getNombre()+ " tiene sobrepeso");
            sobrePeso[3]=1;
        } else if (serv.calcularIMC(per4)== -1) {
            System.out.println(per4.getNombre()+ " tiene peso bajo");
            bajoPeso[3]=1;
        } else if (serv.calcularIMC(per4)== 0) {
            System.out.println(per4.getNombre()+ " tiene peso correcto");
            buenPeso[3]=1;
        }
        
        if (serv.esMayorDeEdad(per4)) {
            System.out.println("Es mayor edad");
            mayorEdad[3]=1;
        } else {
            System.out.println("Es menor de edad");
            menorEdad[3]=1;
        }
        // mostramos personas
        
        // Calcular el promedio de cada vector
        double dataSobrepeso = (sobrePeso[0] + sobrePeso[1] + sobrePeso[2] + sobrePeso[3]) / 4;
        double dataBajopeso = (bajoPeso[0] + bajoPeso[1] + bajoPeso[2] + bajoPeso[3]) / 4;
        double dataBuenpeso = (buenPeso[0] + buenPeso[1] + buenPeso[2] + buenPeso[3]) / 4;
        double dataMayoredad = (mayorEdad[0] + mayorEdad[1] + mayorEdad[2] + mayorEdad[3]) / 4;
        double dataMenoredad = (menorEdad[0] + menorEdad[1] + menorEdad[2] + menorEdad[3]) / 4;

        // Calcular el porcentaje promedio de cada vector
        double promedioSobrepeso = (dataSobrepeso / 100) * 100;
        double promedioBajopeso = (dataBajopeso / 100) * 100;
        double promedioBuenpeso = (dataBuenpeso / 100) * 100;
        double promedioMayoredad = (dataMayoredad / 100) * 100;
        double promedioMenoredad = (dataMenoredad / 100) * 100;

        // Imprimir los resultados
        System.out.println("Porcentaje promedio de sobre peso es : " + promedioSobrepeso);
        System.out.println("Porcentaje promedio de peso bajo es: " + promedioBajopeso);
        System.out.println("Porcentaje promedio de peso correcto es : " + promedioBuenpeso);
        System.out.println("Porcentaje promedio de peso bajo es: " + promedioMayoredad);
        System.out.println("Porcentaje promedio de peso correcto es : " + promedioMenoredad);
    }
    
}
