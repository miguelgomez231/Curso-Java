/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class PooEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia circunferencia = new Circunferencia();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        circunferencia.setRadio(leer.nextDouble());
        double area = circunferencia.area();
        double perimetro = circunferencia.perimetro();
        System.out.println("-----------------");
        System.out.println("El área de la circunferencia es: " + area + " y el perímetro es: " + perimetro);
        
        
        
    }

   

    

}
