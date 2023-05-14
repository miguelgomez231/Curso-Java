/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class FechaService {

    public Scanner leer = new Scanner(System.in);

    //a)
//    public Date fechaNacimiento() {
//        System.out.println("Ingrese su día de nacimiento: ");
//        int dia = leer.nextInt();
//        System.out.println("Ingrese su mes de nacimiento: ");
//        int mes = leer.nextInt();
//        System.out.println("Ingrese su anio de nacimiento: ");
//        int anio = leer.nextInt();
//        
//
//        return new Date(anio-1900, mes-1, dia);
//    }
    public Date fechaNacimiento() {
        Date fechaNac;
        int dia, mes, anio;
        boolean band;

        System.out.println("Ingrese su fecha de nacimiento.");
        do {
            band = false;
            System.out.print("Día: ");
            dia = leer.nextInt();
            System.out.print("Mes: ");
            mes = leer.nextInt();
            System.out.print("Año: ");
            anio = leer.nextInt();

            fechaNac = new Date(anio - 1900, mes - 1, dia); // Cuando se carga una fecha hay que restarle 1900 al año y 1 al mes.

            // Valido si dia y mes son correctos. Y si la fecha ingresada es menor a la fecha actual.
            switch (mes) {
                case 2:
                    if (esBisiesto(anio)) {
                        band = 1 <= dia && dia <= 29 && fechaNac.before(fechaActual());
                    } else {
                        band = 1 <= dia && dia <= 28 && fechaNac.before(fechaActual());
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    band = 1 <= dia && dia <= 31 && fechaNac.before(fechaActual());
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    band = 1 <= dia && dia <= 30 && fechaNac.before(fechaActual());
                    break;
//                                default:
//                                        band = false;
            }
            if (!band) {
                System.out.println("Ingrese una fecha de nacimiento válida.");
            }
        } while (!band);
        return fechaNac;
    }

    /*
                              *Algoritmo para saber si el año es BISIESTO
                              =================================
        	Si anio MOD 100 == 0 Entonces
		Si anio MOD 400 == 0 Entonces
			Escribir "Es un año bisiesto."
		SiNo
			Escribir "NO es un año bisiesto."
		FinSi
	SiNo
		Si anio MOD 4 == 0 Entonces
			Escribir "Es un año bisiesto."
		SiNo
			Escribir "NO es un año bisiesto."
		FinSi
	FinSi
     */
    public boolean esBisiesto(int anio) {
        if (anio % 100 == 0) {
            return (anio % 400 == 0);
        } else {
            return (anio % 4 == 0);
        }
    }
    //b)

    public Date fechaActual() {
//        Date fechaActual = new Date();
//        int anioActual =fechaActual.getYear();
//        fechaActual.setYear(anioActual);
//        System.out.println("fecha actual " +  fechaActual.getYear());
        return new Date();
    }

    //c)
    //        c) Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
    public int diferencia(Date C, Date fechaActual) {
//                fecha.getTime()  devuelve un Long con la cantidad de milisegundos desde 1/1/1970.
//                return (int) ( (fechaActual.getTime() - C.getTime() ) / 86400000 / 365);
//                    int anioNacimiento = C.getYear() + 1900;
//                    int mesNacimiento = C.getMonth() + 1;
//                    int diaNacimiento = C.getDate();
//
//                    int anioActual = fechaActual.getYear() + 1900;
//                    int mesActual = fechaActual.getMonth() + 1;
//                    int diaActual = fechaActual.getDate();
//      
        
        int diferenciaAnios = fechaActual.getYear() - C.getYear();
        
        
        if (fechaActual.getMonth() < C.getMonth()|| fechaActual.getMonth() == C.getMonth() &&fechaActual.getDay() < C.getDay()) {
            
             diferenciaAnios--;
        }
       

        return diferenciaAnios;
    }

}
