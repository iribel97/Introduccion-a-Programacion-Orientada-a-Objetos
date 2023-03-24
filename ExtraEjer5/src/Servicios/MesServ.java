/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Mes;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class MesServ {
    
    public void adivinarMes(Mes month){
        Scanner scaner = new Scanner(System.in);
        //Poner un mes random
        int posicion = (int)(Math.random()*13);
        month.setMes(month.getMeses()[posicion]);
        //variable que guarde lo ingresado por el usuario
        String uMes;
        //contar errores
        int contE=0;
        
        //Pedir al usuario el mes
        System.out.println(month.getMes());
        System.out.println("--------------------------------------------------");
        System.out.println("                  ADIVINAR EL MES                 ");
        System.out.println("--------------------------------------------------");
        do {
            if (contE != 0) {
                System.out.println("--------------------------------------------------");
                System.out.println("        NO HA ACERTADO, INTENTELO DE NUEVO        ");
                System.out.println("--------------------------------------------------");
            }
            System.out.print("    Ingrese un mes: ");
            uMes = scaner.nextLine().toLowerCase();
            contE++;
        } while (!uMes.equals(month.getMes()));
        if (uMes.equals(month.getMes())) {
            System.out.println("USTED A ACERTADO!! FELICIDADES");
        }
    }
    
}
