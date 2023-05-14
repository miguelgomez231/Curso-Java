/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/**
 *
 * @author Miguel Ángel
 */

import Entidades.Hanged;
import java.util.Arrays;
import java.util.Scanner;
public class HangedService {
    
    Scanner leer = new Scanner(System.in);
    Hanged ah = new Hanged();
    
    public void juego() {
        
        crearJuego();
        longitud();
        
        do {
            buscar();
        } while (ah.getContador() != ah.getPalabra().length && ah.getJugadasMax() != 0);
        
        if (ah.getContador() == ah.getPalabra().length) {
            System.out.println("Adivinaste la palabra.");
            System.out.println("----------------------------------------");
        } else {
            System.out.println("Te quedaste sin intentos.");
            System.out.println("----------------------------------------");
        }
        
        
    }
    
    public void crearJuego() {
        
        System.out.println("Ingrese la palabra: ");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad máxima de jugadas: ");
        ah.setJugadasMax(leer.nextInt());
        
        ah.setN(palabra.length());
        String[] aux = new String[palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
            
            aux[i] = palabra.substring(i,i+1).toUpperCase();
            
        }
        
        ah.setPalabra(aux);
        
        System.out.println(Arrays.toString(ah.getPalabra()));
        
    }
    
    public void longitud() {
        
        System.out.println("La longitud de la palabra es: " + ah.getPalabra().length);
        
    }
    
    public void buscar() {
        
        int contSi = 0;
        int contNo = 0;
        
        System.out.println("Ingrese una letra: ");
        ah.setLetra(leer.next());

        for (String palabra : ah.getPalabra()) {
            
            if (ah.getLetra().equalsIgnoreCase(palabra)) {
                contSi++;
                ah.setContador(ah.getContador() + 1); 
            } else {
                contNo++;
            }
        }

        System.out.println(ah.getContador());
        
        if (contNo > 0 && contSi == 0) {
            ah.setJugadasMax(ah.getJugadasMax() - 1);
        }
        
        if (contSi > 0) {
            System.out.println("La letra fue encontrada.");
            System.out.println("----------------------------------------");
        } else {
            System.out.println("La letra no fue encontrada.");
            System.out.println("----------------------------------------");
        }
        
        encontradas();
        
    }
    
    public void encontradas() {
        
        System.out.println("Letras encontradas: (" + ah.getContador() + "/" + ah.getPalabra().length + ")");
        
        intentos();
        
    }
    
    public void intentos() {

        System.out.println("Intentos restantes: " + ah.getJugadasMax());
  
    }
    
}
