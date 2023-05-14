/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import clase20eje2.Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class CafeteraServicio {
    
    public Scanner leer = new Scanner(System.in);
    //a)
    public Cafetera llenarCafetera(){
        System.out.println("Llenando Cafetera");
        int capacidadMaxima = 100;
        int cantidadActual = capacidadMaxima;
        System.out.println("La capacidad máxima es: " + capacidadMaxima + " y la cantidad Actual es: " + cantidadActual);
        return new Cafetera(capacidadMaxima , cantidadActual);
    }
    //b)
    public void servirTaza(Cafetera cafetera, int cantidadActual){
        System.out.println("Ingrese el tamaño de la taza a llenar:");
        int taza = leer.nextInt();
        if (taza>cafetera.getCantidadActual()) {
            System.out.println("Se sirvio la taza pero no se llenó porque excede la cantidad que había en la cafetera");
            taza = cafetera.getCantidadActual();
            System.out.println("La taza quedó con una cantidad de: " + taza + " de café");
        } else {
            System.out.println("La taza se llenó correctamente");
            int cant = cafetera.getCantidadActual() - taza;
            cafetera.setCantidadActual(cant) ; 
            System.out.println("En la cafetera quedó: " + cafetera.getCantidadActual());
        }
    }
    
    // c)
    
    public void vaciarCafetera(Cafetera cafetera, int cantidadActual){
        cafetera.setCantidadActual(0);
        System.out.println("Se vació la cafetera");
    }
    
    // d)
    public void agregarCafe(Cafetera cafetera, int cantidadActual){
        System.out.println("Ingrese una cantidad de café");
        int cant = leer.nextInt();
        if (cant>cafetera.getCantidadMaxima()) {
            do { 
            System.err.println("La cantidad ingresada supera la capaicidad máxima"); 
            System.out.println("Ingrese una cantidad de café");
            int cantNueva = leer.nextInt();
            cant = cantNueva;
           
        } while (cant>cafetera.getCantidadMaxima());
        }

        
        
        cafetera.setCantidadActual(cant);
   
        
    }
    
//    public void agregarCafe(Cafetera cafetera, double cantidadActual){
//        boolean bandera = false;
//        do {
//            System.out.println("Ingrese una cantidad de café");
//            double cant = leer.nextDouble();
//            if (cant>cafetera.getCantidadMaxima()) {
//            System.err.println("La cantidad ingresada supera la capaicidad máxima");  
//            } else {
//            bandera = true;
//            break;
//            }
//        } while (bandera=true);
//        
//        cafetera.setCantidadActual(cant);
//   
//        
//    }
}
