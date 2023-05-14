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
public class Circunferencia {
    
   // agregamos los atributos
    private double radio;
    
   // Creamos el método constructor que inicializa radio

    public Circunferencia() {
    }
    
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    // método get y set para el atributo radio

    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    // Método para crear la Circunferencia
    public void crearCircunferencia(double radio) {
        setRadio(radio);
    }
    
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro(){
        return 2*Math.PI*radio;
    }
    

  
    
    
    
    
   
}
