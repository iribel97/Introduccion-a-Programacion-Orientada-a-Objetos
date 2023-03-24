/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

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
        Date fechaActual = new Date(2023,3,21);
        
        int dia, mes, year;
        //Entero que muestre la diferencie de los años
        int diferencia;
        
        System.out.println("INGRESE UNA FECHA");
        System.out.print("   * dia : ");
        dia = leer.nextInt();
        System.out.print("   * mes : ");
        mes = leer.nextInt();
        System.out.print("   * año : ");
        year = leer.nextInt();
        
        Date fecha = new Date(year,mes,dia);
        
        diferencia = fecha.getYear() - fechaActual.getYear();
        System.out.println("--------------------------------------------------");
        System.out.println("La diferencia es: " + diferencia);
        System.out.println("--------------------------------------------------");
        System.out.println("Fecha actual");
        System.out.println(fechaActual.getDay() + " - " + fechaActual.getMonth() + " - " + fechaActual.getYear());
        
        
    }
    
}
