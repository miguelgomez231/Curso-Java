/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Miguel Ángel
 */
public class Ahorcado {
    private int n ;
    private String[] palabra = new String[n];
    private int cantidadLetras;
    private int cantidadJugasMx; 
    
    // contructores

    public Ahorcado() {
    }

    public Ahorcado(int n, int cantidadLetras, int cantidadJugasMx) {
        this.n = n;
        this.cantidadLetras = cantidadLetras;
        this.cantidadJugasMx = cantidadJugasMx;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getCantidadJugasMx() {
        return cantidadJugasMx;
    }

    public void setCantidadJugasMx(int cantidadJugasMx) {
        this.cantidadJugasMx = cantidadJugasMx;
    }
    
    
}
