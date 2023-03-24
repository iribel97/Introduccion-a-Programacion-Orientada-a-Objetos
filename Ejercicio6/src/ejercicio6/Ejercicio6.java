/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import Entidades.Cafetera;
import Servicios.ServCafetera;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio6 {
    /*
    Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
    (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
    cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
    métodos:
        . Constructor predeterminado o vacío
        . Constructor con la capacidad máxima y la cantidad actual
        . Métodos getters y setters.
        . Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
        . Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
            tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
            cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
            método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
            cuanto quedó la taza.
        . Método vaciarCafetera(): pone la cantidad de café actual en cero.
        . Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
            recibe y se añade a la cafetera la cantidad de café indicada.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc, lTaza;
        boolean bandera = true;
        // Instanciar el servidor
        ServCafetera serv = new ServCafetera();
        
        Cafetera cafe = new Cafetera();
        
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("                 MENU DE OPCIONES                 ");
            System.out.println("--------------------------------------------------");
            System.out.println("    1. Llenar Cafetera");
            System.out.println("    2. Servir Taza");
            System.out.println("    3. Vaciar Cafetera");
            System.out.println("    4. Agregar Cafe");
            System.out.println("    5. Salir");
            System.out.println("--------------------------------------------------");
            System.out.print("    Seleccione una opcion: ");
            opc = scan.nextInt();
            switch (opc) {
                case 1 -> //Instanciar el objeto
                    cafe = serv.llenarCafetera();
                case 2 -> {
                    System.out.println("--------------------------------------------------");
                    System.out.print(" INGRESE LA CAPACIDAD DE LA TAZA EN LITROS: ");
                    lTaza = scan.nextInt();
                    serv.servirTaza(lTaza, cafe);
                }
                case 3 ->
                    serv.vaciarCafetera(cafe);
                case 4 ->
                    serv.agregarCafe(cafe);
                case 5 ->
                    bandera = false;
                default ->
                    throw new AssertionError();
            }
        } while (bandera == true);
    }
    
}
