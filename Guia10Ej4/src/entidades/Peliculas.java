/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Miguel Ángel
 */
public class Peliculas {
    
    private String tilulo;
    private String director;
    private Double duración;

    public Peliculas() {
    }

    public Peliculas(String tilulo, String director, Double duración) {
        this.tilulo = tilulo;
        this.director = director;
        this.duración = duración;
    }

    public String getTilulo() {
        return tilulo;
    }

    public void setTilulo(String tilulo) {
        this.tilulo = tilulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuración() {
        return duración;
    }

    public void setDuración(Double duración) {
        this.duración = duración;
    }

    
    
//    public Double comparador(){
//        Peliculas pelicula = new Peliculas();
//        
//        Collections.sort(pelicula.getDuración());
//        
//        return Comparator
//    }

    @Override
    public String toString() {
        return "Peliculas{" + "tilulo=" + tilulo + ", director=" + director + ", duraci\u00f3n=" + duración + '}';
    }

    
    
    
}
