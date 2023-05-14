/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6ej4;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Clase6Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leerNum = new Scanner(System.in);
        // Pedimos el valor
        int num ;
        String rom = "A";
        do {
            System.out.println("Ingrese un número entre el 1 y 10 ");
            num = leerNum.nextInt();
            switch (num){
            case 1: 
                rom = "I";
                break;
            case 2:
                rom = "II";
                break;
            case 3: 
                rom = "III";
                break;
            case 4:
                rom = "IV";
                break; 
            case 5: 
                rom = "V";
                break;
            case 6:
                rom = "VI";
                break;
            case 7: 
                rom = "VII";
                break;
            case 8:
                rom = "VIII";
                break;  
            case 9: 
                rom = "IX";
                break;
            case 10:
                rom = "X";
                break; 
            default : System.out.println("Número ingresado incorrecto \n ");
          }
        
        } while (num<1 || num > 10);
        
        System.out.println("El equivalente en números romanos es: " + rom ); 
        
        
    }
    
}
