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
public class Hanged {
    
    private int n;
    private String[] palabra = new String[n];
    private int jugadasMax;
    private int contador = 0;
    private String letra;

    public Hanged() {
    }

    public Hanged(int n, int jugadasMax, int contador, String letra) {
        this.n = n;
        this.jugadasMax = jugadasMax;
        this.contador = contador;
        this.letra = letra;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
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

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }
  
}
