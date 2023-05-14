/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej6;

import Entidades.Curso;

/**
 *
 * @author Miguel Ángel
 */
public class Guia9Ej6 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
                Curso curso = new Curso();
                curso.crearCurso();
                System.out.println("El curso "+ curso.getNombreCurso() +" dejará una ganancia de $ "+ curso.calcularGananciaSemanal());
        }
    
}