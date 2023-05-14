/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class RaicesServicio {
    
    public Scanner leer = new Scanner(System.in);
    
    // crear ecuación
    
    public Raices crearEc(){
        System.out.print("Igrese el valor del coeficiente cuadrático: ");
        float a = leer.nextFloat();
        System.out.print("Igrese el valor del coeficiente simple: ");
        float b = leer.nextFloat();
        System.out.print("Igrese el valor del coeficiente independiente: ");
        float c = leer.nextFloat();
        
        return new Raices(a, b, c);
        
    }
    
    //a)
    
    public double getDiscriminante(Raices raices){
        return Math.pow(raices.getB() , 2)- 4 * raices.getA() * raices.getC();
    }
    
    //b)
    public boolean tieneRaices(Raices raices){
        
        return (getDiscriminante(raices) >= 0);
           
    }
    
    //C)
    public boolean tieneRaiz(Raices raices){
        
        return (getDiscriminante(raices) == 0);
           
    }
    
    // D)
    public void obtenerRaices(Raices raices){
        if (tieneRaices(raices)) {
            System.out.print("La primer solución sería: ");
            System.out.println(((-1*raices.getB())+ (Math.sqrt(getDiscriminante(raices))))/(2*raices.getA()));
           //
           System.out.print("La segunda solución sería: ");
           System.out.println(((-1*raices.getB())- (Math.sqrt(getDiscriminante(raices))))/(2*raices.getA()));
        } 
    }
    
    //e)
    public void obtenerRaiz(Raices raices){
        if (tieneRaiz(raices)) {
            System.out.println("Tiene una única solución posible");
            System.out.println(((-1*raices.getB())- (Math.sqrt(getDiscriminante(raices))))/(2*raices.getA()));
        }
    }
    
    // f)
    public void calcular(Raices raices){
        if (tieneRaices(raices)) {
            if (tieneRaiz(raices)) {
                obtenerRaiz(raices);
            } else {
                obtenerRaices(raices);
            }
        } else {
            System.out.println("No existe solución");
        }
    }
}
