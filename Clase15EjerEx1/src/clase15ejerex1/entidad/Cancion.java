/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15ejerex1.entidad;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Cancion {
    private String titulo ;
    private String autor ;
    // Creamos los constructores

    public Cancion() {
        titulo ="";
        autor ="";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
}
