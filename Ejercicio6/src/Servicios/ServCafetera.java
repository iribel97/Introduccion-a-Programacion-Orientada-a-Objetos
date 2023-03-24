/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServCafetera {
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    Scanner scaner = new Scanner(System.in);
    
    public Cafetera llenarCafetera(){
        Cafetera caf = new Cafetera();
        
        int capacidad;
        
        System.out.println("--------------------------------------------------");
        System.out.println("           LLENAR CAPACIDAD DE CAFETERA           ");
        System.out.println("--------------------------------------------------");
        System.out.print("   CAPACIDAD (Lts): ");
        capacidad = scaner.nextInt();
        caf.setCapacidadMax(capacidad);
        caf.setCantidadAct(capacidad);
        return caf;
    }
    
//    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//            tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//            cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//            método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//            cuanto quedó la taza.
    public void servirTaza(int capTaza, Cafetera x){
        System.out.println("--------------------------------------------------");
        System.out.println("              VAMOS A LLENAR LA TAZA              ");
        System.out.println("--------------------------------------------------");
        if (capTaza > x.getCantidadAct()) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i == 0 || i > 5 || j == 0 || j == 7) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
            capTaza = capTaza - x.getCantidadAct();
            System.out.println("--------------------------------------------------");
            System.out.println("OH NO!! LA TAZA NO SE ALCANZO A LLENAR FALTO " + capTaza + " Lts");
            System.out.println("--------------------------------------------------");
        }else{
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i == 0 || i > 2 || j == 0 || j == 7) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
            System.out.println("--------------------------------------------------");
            System.out.println("             LA TAZA LOGRO LLENARSE!!             ");
            System.out.println("--------------------------------------------------");
            
            
            capTaza = x.getCantidadAct() - capTaza;
            
            x.setCantidadAct(capTaza);
            System.out.println("      AUN QUEDA " + x.getCantidadAct() + " Lts");
        }
    }
    
    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera x){
        x.setCantidadAct(0);
        System.out.println("--------------------------------------------------");
        System.out.println("            SE HA VACIADO LA CAFETERA!            ");
        System.out.println("--------------------------------------------------");
    }
    
    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//            recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(Cafetera x){
        int cantCafe;
        
        System.out.println("--------------------------------------------------");
        System.out.println("               INGRESE LO SOGUIENTE               ");
        System.out.println("--------------------------------------------------");
        System.out.print("      CANTIDAD DE CAFE: ");
        cantCafe = scaner.nextInt();
        
        x.setCantidadAct((x.getCantidadAct()+cantCafe));
    }
}
