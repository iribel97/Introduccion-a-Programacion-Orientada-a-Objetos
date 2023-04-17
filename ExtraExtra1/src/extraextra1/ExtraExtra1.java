/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraextra1;

import Entidades.Fraccion;
import Servicio.ServFraccion;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ExtraExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
        fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
        fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
        */
        Scanner scaner = new Scanner(System.in);
        Fraccion fr = new Fraccion();
        ServFraccion serv = new ServFraccion();
        
        System.out.println("--------------------------------------------------");
        System.out.println("               INGRESE LOS SIGUIENTE              ");
        System.out.println("--------------------------------------------------");
        System.out.println(" - FRACCION 1");
        System.out.print("    * NUMERADOR : ");
        fr.setNume1(scaner.nextInt());
        System.out.print("    * DENOMINADOR : ");
        fr.setDenom1(scaner.nextInt());
        System.out.println(" - FRACCION 2");
        System.out.print("    * NUMERADOR : ");
        fr.setNume2(scaner.nextInt());
        System.out.print("    * DENOMINADOR : ");
        fr.setDenom2(scaner.nextInt());
        
        //Variable para el menu de opciones
        int opc;
        
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("                MENU DE OPERACIONES               ");
            System.out.println("--------------------------------------------------");
            System.out.println(" 1.- Sumar");
            System.out.println(" 2.- Restar");
            System.out.println(" 3.- Multiplicar");
            System.out.println(" 4.- Dividir");
            System.out.println(" 5.- Salir");
            System.out.println("--------------------------------------------------");
            System.out.print("   SELECCIONE UNA OPCION: ");
            opc = scaner.nextInt();
            switch (opc) {
                case 1:
                    serv.sumar(fr);
                    break;
                case 2:
                    serv.restar(fr);
                    break;
                case 3:
                    serv.multiplicar(fr);
                    break;
                case 4:
                    serv.dividir(fr);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("--------------------------------------------------");
                    System.out.println("      OPCION NO ENCONTRADA INTENTELO DE NUEVO     ");
            }
            scaner.nextLine();
        } while (opc != 5);
        
    }
    
}
