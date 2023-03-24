/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServCircunferencia {
    
    public Circunferencia CrearCircunferencia(){
        Scanner scaner = new Scanner(System.in);
        Circunferencia cir = new Circunferencia();
        
        System.out.println("--------------------------------------------------");
        System.out.println("---------INGRESE LA SIGUIENTE INFORMACION---------");
        System.out.println("--------------------------------------------------");
        System.out.print("               RADIO: ");
        cir.setRadio(scaner.nextDouble());
        return cir;
    }
    
    public void Area(Circunferencia x){
        double a;
        
        a = x.getRadio()*x.getRadio() + 3.14156;
        System.out.println("--------------------------------------------------");
        System.out.println("          EL AREA ES: " + a);
    }
    
    public void Perimetro(Circunferencia x){
        double p;
        
        p = 2 * 3.14156 * x.getRadio();
        System.out.println("--------------------------------------------------");
        System.out.println("     EL PREIMETRO ES: " + p);
    }
}
