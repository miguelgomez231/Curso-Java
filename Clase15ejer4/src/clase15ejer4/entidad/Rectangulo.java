/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15ejer4.entidad;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Rectangulo {
    // Creamos los atributos
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo() {
      Scanner leer = new Scanner(System.in);
      // Pedimos al usuario los datos
      System.out.println("Ingrese la base del rectángulo");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura del rectángulo");
        int altura = leer.nextInt();
        this.base = base;
        this.altura  = altura;
    }
    
    public int supRectangulo(){
        return base * altura;
    }
    
    public int perimRectangulo(){
        return (base * altura)*2;
    }
    
    public void dibujarRectangulo(){
        
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i ==0 || j == 0 || j==altura-1 || i==base-1) {
                    
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
