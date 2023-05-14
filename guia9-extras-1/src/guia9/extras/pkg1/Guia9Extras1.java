/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.extras.pkg1;

import Entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Guia9Extras1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Meses mesSecreto = new Meses();
        Scanner leer = new Scanner(System.in);
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        String mesUsuario;
        do { 
            
            mesUsuario = leer.next();
            if (mesSecreto.adivinarMes(mesUsuario)) {
                System.out.println("Ha acertado!! ");
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }
            
        } while (!mesSecreto.adivinarMes(mesUsuario));
        
    }
    
}
