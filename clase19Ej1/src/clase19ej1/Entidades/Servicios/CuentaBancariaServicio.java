/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase19ej1.Entidades.Servicios;

import clase19ej1.Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class CuentaBancariaServicio {
    
    private Scanner leer = new Scanner(System.in);
    
    //a)
    public CuentaBancaria crearCuenta(){
       
        System.out.println("Ingrese Número de Cuenta");
        int numeroCuenta = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese DNI");
        long dniCliente = leer.nextLong();
        leer.nextLine();
        System.out.println("Ingrese Saldo actual");
        double saldoCuenta = leer.nextDouble();
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoCuenta);
        
            
    }
    //b)
    public void ingresar(CuentaBancaria cuenta, double cantidad){
        System.out.println("Ingrese la cantidad de dinero que desea ingresar");
        cantidad = leer.nextDouble();
        cuenta.setSaldoCuenta(cuenta.getSaldoCuenta() + cantidad);
        System.out.println("Se ha ingresado " + cantidad + " a la cuenta.");
    }
    //c)
    public void retirar(CuentaBancaria cuenta, double cantidad) {
        System.out.println("Ingrese la cantidad de dinero que desea retirar");
        cantidad = leer.nextDouble();
        if (cantidad > cuenta.getSaldoCuenta()) {
            cantidad = cuenta.getSaldoCuenta(); // Retira el máximo posible para dejar la cuenta en 0
            cuenta.setSaldoCuenta(0);
            System.out.println("No se puede retirar la cantidad solicitada. Se ha retirado el máximo posible (" + cantidad + ").");
        } else {
            cuenta.setSaldoCuenta(cuenta.getSaldoCuenta() - cantidad);
            System.out.println("Se ha retirado " + cantidad + " de la cuenta.");
        }
    }
    
    //d)
    public void extraccionRapida(CuentaBancaria cuenta) {
        
        double limite = cuenta.getSaldoCuenta() * 0.2;
        System.out.print("¿Qué cantidad desea retirar? (límite: " + limite + "): ");
        double cantidad = leer.nextDouble();
        leer.nextLine(); // Limpia el buffer del scanner
        if (cantidad > limite) {
            System.err.println("No se puede retirar más del 20% del saldo actual.");
        } else {
            retirar(cuenta, cantidad);
        }
    }
    // e)
    public void consultarSaldo(CuentaBancaria cuenta) {
        
        System.out.println("Su saldo disponible es: " + cuenta.getSaldoCuenta() );
    }
    // f) 
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: " + cuenta.getSaldoCuenta());
    }
}
