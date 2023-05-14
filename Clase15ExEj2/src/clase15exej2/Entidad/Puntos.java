/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15exej2.Entidad;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Puntos {
    // Creamos los atributos
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    // Constructores

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    // Creamos el metodo para rellenar
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        // Pedimos los puntos
        System.out.println("Ingrese el eje X del primer punto");
        int auX1 = leer.nextInt();
        System.out.println("Ingrese el eje Y del primer punto");
        int auY1 = leer.nextInt();
        System.out.println("Ingrese el eje X del segundo punto");
        int auX2 = leer.nextInt();
        System.out.println("Ingrese el eje Y del segundo punto");
        int auY2 = leer.nextInt();
        this.x1 = auX1;
        this.y1 = auY1;
        this.x2 = auX2;
        this.y2 = auY2;
    }
    
    public double calcDistancia(){
        
        return Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2 - y1,2));
        
        
    }
}
