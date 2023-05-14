/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        // Le pedimos al usuario que ingrese el número 1 y 2
        System.out.println("Ingrese el número 1");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el número 2");
        int numero2 = leer.nextInt();
        this.numero1 = numero1;
        this.numero2  = numero2;
    }
    
    public int sumar() {
        return numero1 + numero2;
    }
    
    public int restar() {
        return numero1 - numero2;
    }
    
    public int multiplicar() {
        if (numero1 == 0 || numero2==0){
            System.out.println("Error. No se puede multiplicar por cero");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }
    
    public double dividir() {
        if (numero1 == 0 || numero2==0){
            System.out.println("Error. No se puede dividir por cero");
            return 0;
        } else {
            double num1 = numero1;
            double num2 = numero2;
            return num1 / num2;
        }
    }
}
