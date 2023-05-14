/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15exej3.Entidad;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Juego {
    
    private String jugador1;
    private String jugador2;
    private int victoriaJ1;
    private int victoriaJ2;

    public Juego() {
    }

    public Juego(String jugador1, String jugador2, int victoriaJ1, int victoriaJ2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.victoriaJ1 = victoriaJ1;
        this.victoriaJ2 = victoriaJ2;
    }

    

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public int getVictoriaJ1() {
        return victoriaJ1;
    }

    public void setVictoriaJ1(int victoriaJ1) {
        this.victoriaJ1 = victoriaJ1;
    }

    public int getVictoriaJ2() {
        return victoriaJ2;
    }

    public void setVictoriaJ2(int victoriaJ2) {
        this.victoriaJ2 = victoriaJ2;
    }
    
    // Creamos el método
    public void iniciar_juego(){
        Scanner leer = new Scanner(System.in);
        // Le pedimos al J1 que ingrese el número
        System.out.println("Jugador N°1 ingrese un número: ");
        int numAdivinar = leer.nextInt();
        System.out.println("Ingrese la cantidad de oportunidades para adivinarlo:");
        int oportunidades = leer.nextInt();
        // Creamos el bucle
        boolean bandera= false;
        int i;
        
        for ( i = 0; i < oportunidades && bandera==false ; i++) {
            System.out.println("Adivine el número: ");
            int intento = leer.nextInt();
            if (intento > numAdivinar) {
                System.out.println("Más bajo");
                
            } else if (intento < numAdivinar) {
                System.out.println("Mas alto");
            } else if (intento == numAdivinar){
                bandera = true;   
            }
        }
        if (bandera==true) {
            System.out.println("Ganaste en: " + (i) + " intentos");
            victoriaJ2++;
        } else if (bandera==false){
            System.out.println("Perdiste en: " + (i) + " intentos");
            victoriaJ1++;
        }
    }
    
}
