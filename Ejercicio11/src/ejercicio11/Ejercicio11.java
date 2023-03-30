/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio11 {

    /*
    Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
    clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
    Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
    usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
    deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
    se puede conseguir instanciando un objeto Date con constructor vacío.
        Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
        Ejemplo fecha actual: Date fechaActual = new Date();
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int dia, mes, year;

        System.out.println("INGRESE UNA FECHA");
        System.out.print("   * dia : ");
        dia = leer.nextInt();
        System.out.print("   * mes : ");
        mes = leer.nextInt();
        System.out.print("   * año : ");
        year = leer.nextInt();
        
        LocalDate fecha =  LocalDate.of(year, mes, dia);
        
        //Fecha Acuat
        LocalDate fechaA = LocalDate.now();
        
        long diferencia = ChronoUnit.YEARS.between(fecha, fechaA);
        System.out.println("--------------------------------------------------");
        System.out.println("La diferencia es: " + diferencia);
        System.out.println("--------------------------------------------------");
        System.out.println("Fecha actual: " + fechaA);
        System.out.println("Fecha ingresada: " + fecha);

        
        
    }
    
}
