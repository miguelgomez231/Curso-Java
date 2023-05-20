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
public class Libros {
    
    private String[] titulos = {"lobo", "perro", "zorro"};

    public Libros() {
    }

    public String[] getTitulos() {
        return titulos;
    }

    public void setTitulos(String[] titulos) {
        this.titulos = titulos;
    }
    

    @Override
    public String toString() {
        return "Libros{" + "titulos=" + titulos + '}';
    }
    
}
