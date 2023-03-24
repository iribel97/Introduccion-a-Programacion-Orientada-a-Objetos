/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServRectangulo {
    public Scanner scaner = new Scanner(System.in);
    
    public Rectangulo crearRect(){
        Rectangulo x = new Rectangulo();
        System.out.println("--------------------------------------------------");
        System.out.println("    INGRESE LOS SIGUIENTES DATOS DEL RECTANGUALO  ");
        System.out.println("--------------------------------------------------");
        System.out.print("       BASE: ");
        x.setBase(scaner.nextInt());
        System.out.print("       AlTURA: ");
        x.setAltura(scaner.nextInt());
        return x;
    }
    
    public void area(Rectangulo y){
        int A;
        
        A = y.getAltura() * y.getBase();
        System.out.println("--------------------------------------------------");
        System.out.println("                       AREA                       ");
        System.out.println("--------------------------------------------------");
        System.out.println("      RESPUESTA: " + A);
    }
    
    public void perimetro(Rectangulo y){
        int P;
        
        P = (y.getAltura() + y.getBase())*2;
        System.out.println("--------------------------------------------------");
        System.out.println("                     PREIMETRO                    ");
        System.out.println("--------------------------------------------------");
        System.out.println("      RESPUESTA: " + P);
    }
    
    public void dibujarRect(Rectangulo y){
        
        System.out.println("--------------------------------------------------");
        System.out.println("               REPRESENTACION GRAFICA             ");
        System.out.println("--------------------------------------------------");
        System.out.println("");
        for (int i = 0; i < y.getAltura(); i++) {
            for (int j = 0; j < y.getBase(); j++) {
                if(i==0 || i == (y.getAltura()-1) || j == 0 || j == (y.getBase()-1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
