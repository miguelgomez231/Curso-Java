/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15exej3;

import clase15exej3.Entidad.Juego;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Clase15ExEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego partida = new Juego("Pepe", "Luis",0 ,0);
        Scanner leer = new Scanner(System.in);
        // Bucle
        String opcion;
        do {
            partida.iniciar_juego();
            System.out.println("Desea continuar otra partida? S/N");
            opcion = leer.next();
        } while (opcion.equals("S"));
        
        
        System.out.println("----------------------");
        System.out.println("El jugador N°1 ganó: " + partida.getJugador1() + partida.getVictoriaJ1() + " veces");
        System.out.println("----------------------");
        System.out.println("El jugador N°2 ganó: " + partida.getJugador2() + partida.getVictoriaJ2() + " veces");
    }
    
}
