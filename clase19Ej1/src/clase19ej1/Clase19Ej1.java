/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase19ej1;

import clase19ej1.Entidades.CuentaBancaria;
import clase19ej1.Entidades.Servicios.CuentaBancariaServicio;

/**
 *
 * @author Miguel Ángel
 */
public class Clase19Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        // Crear una cuenta bancaria
        CuentaBancaria cuenta1 = servicio.crearCuenta();
        // Ingresar dinero a la cuenta
        servicio.ingresar(cuenta1, 0);
        // Retirar dinero de la cuenta
        servicio.retirar(cuenta1, 0);

        // Realizar extracción rápida
        servicio.extraccionRapida(cuenta1);

        // Consultar el saldo de la cuenta
        servicio.consultarSaldo(cuenta1);

        // Consultar los datos de la cuenta
        servicio.consultarDatos(cuenta1);
    }
    
}
