/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Miguel Ángel
 */
public class Libro {
    // atributos
    public int ISBN;
    public String titulo;
    public String autor;
    public int npagina;
    // constructores
    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int npagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.npagina = npagina;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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

    public int getNpagina() {
        return npagina;
    }

    public void setNpagina(int npagina) {
        this.npagina = npagina;
    }

    
    
    
    

    
    
}
