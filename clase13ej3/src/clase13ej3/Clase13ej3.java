/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase13ej3;

import entidad.Operacion;


/**
 *
 * @author Miguel Ángel
 */
public class Clase13ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Traemos el objeto operacion
        Operacion nums = new Operacion();
        // Lamamos al metodo crearOperacion
        nums.crearOperacion();
        int resultadoSuma = nums.sumar();
        int resultadoResta = nums.restar();
        int resultadoMulti = nums.multiplicar();
        double resultadoDivision = nums.dividir();
        System.out.println("---------------------");
        System.out.println("La suma de los números es: " + resultadoSuma);
        System.out.println("---------------------");
        System.out.println("La resta de los números es: " + resultadoResta);
        System.out.println("---------------------");
        System.out.println("La multiplicación de los números es: " + resultadoMulti + nums.multiplicar());
        
        System.out.println("La divición de los números es: " + resultadoDivision + nums.dividir());
        
        
    }

}
