/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una fecha en formato AAA-MM-DD: ");
        String fechaString = scanner.nextLine();

        LocalDate fecha = LocalDate.parse(fechaString);

        long diferenciaEnanio1s = calcularDiferenciaEnanios(fecha);
        
        System.out.println("la fecha actual es: "+ LocalDate.now());
        System.out.println("La diferencia entre la fecha ingresada y la fecha actual es de " + diferenciaEnanio1s + " años.");
    }

    public static long calcularDiferenciaEnanios(LocalDate fecha) {
        LocalDate fechaActual = LocalDate.now();
        return ChronoUnit.YEARS.between(fecha, fechaActual);
    }
}
