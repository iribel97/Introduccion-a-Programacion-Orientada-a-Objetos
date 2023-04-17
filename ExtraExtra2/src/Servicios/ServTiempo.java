/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Tiempo;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServTiempo {
    Tiempo time = new Tiempo();
    Scanner scaner = new Scanner(System.in);
    String formato = "";
    //Pedir datos al usuario
    public Tiempo pedirTiempo(){
        int opcFormato;
        
        System.out.println("--------------------------------------------------");
        System.out.println("                INGRESEMOS UNA HORA               ");
        System.out.println("--------------------------------------------------");
        System.out.println(" SELECCIONE UN FORMATO");
        System.out.println("    1. 12h");
        System.out.println("    2. 24h");
        System.out.print("  Opcion: ");
        do {
            opcFormato = scaner.nextInt();
            System.out.println(opcFormato > 2 || opcFormato < 1 ? " LA OPCION QUE SELECCIONO NO ES CORRECTA, "
                    + "INGRESE UN FORMATO CORRECTO" : "");
        } while (opcFormato > 2 || opcFormato < 1);
        switch (opcFormato) {
            case 1:
                System.out.println("--------------------------------------------------");
                
                do {
                    System.out.print("     HORA: ");
                    time.setHora(scaner.nextInt());
                    if (time.getHora() > 12 || time.getHora() < 1) {
                        System.out.println("--- HORA INGRESADA ES INVALIDA, INTENTELO NUEVAMENTE");
                    }
                } while (time.getHora() > 12 || time.getHora() < 1);
                
                
                do {
                    System.out.print("     MINUTOS: ");
                    time.setMin(scaner.nextInt());
                    if (time.getMin() > 60 || time.getMin() < 0) {
                        System.out.println("--- MINUTOS INGRESADOS SON INVALIDOS, INTENTELO NUEVAMENTE");
                    }
                } while (time.getMin() > 60 || time.getMin() < 0);
                
                
                do {
                    System.out.print("     SEGUNDOS: ");
                    time.setSeg(scaner.nextInt());
                    if (time.getSeg() > 60 || time.getSeg() < 0) {
                        System.out.println("--- SEGUNDOS INGRESADOS SON INVALIDOS, INTENTELO NUEVAMENTE");
                    }
                } while (time.getSeg() > 60 || time.getSeg() < 0);
                
                
                do {
                    scaner.nextLine();
                    System.out.print("     AM o PM: ");
                    formato = scaner.nextLine().toUpperCase();
                    if (!formato.equals("AM") && !formato.equals("PM")) {
                        System.out.println("--- JORNADA INGRESADA ES INVALIDA, INTENTELO NUEVAMENTE");
                    }
                } while (!formato.equals("AM") && !formato.equals("PM"));
                break;
                
            case 2:
                System.out.println("--------------------------------------------------");
                System.out.print("     HORA: ");
                do {
                    time.setHora(scaner.nextInt());
                    if (time.getHora() > 23 || time.getHora() < 0) {
                        System.out.println("--- HORA INGRESADA ES INVALIDA, INTENTELO NUEVAMENTE");
                    }
                } while (time.getHora() > 23 || time.getHora() < 0);
                
                System.out.print("     MINUTOS: ");
                do {
                    time.setMin(scaner.nextInt());
                    if (time.getMin() > 60 || time.getMin() < 0) {
                        System.out.println("--- MINUTOS INGRESADOS SON INVALIDOS, INTENTELO NUEVAMENTE");
                    }
                } while (time.getMin() > 60 || time.getMin() < 0);
                
                System.out.print("     SEGUNDOS: ");
                do {
                    time.setSeg(scaner.nextInt());
                    if (time.getSeg() > 60 || time.getSeg() < 0) {
                        System.out.println("--- SEGUNDOS INGRESADOS SON INVALIDOS, INTENTELO NUEVAMENTE");
                    }
                } while (time.getSeg() > 60 || time.getSeg() < 0);
                break;
            default:
                throw new AssertionError();
        }
        
        return time;
    }
    //el método imprimirHoraCompleta().
    public void imprimirHoraCompleta(){
        System.out.println("--------------------------------------------------");
        System.out.println("LA HORA INGRESADA POR EL USUARIO ES: ");
        if (formato.equals("")) {
            System.out.printf("     %02d:%02d:%02d", time.getHora(), time.getMin(), time.getSeg());
        }else{
            System.out.printf("     %02d:%02d:%02d  %s", time.getHora(), time.getMin(), time.getSeg(), formato);
        }
        System.out.println("");
    }
}
