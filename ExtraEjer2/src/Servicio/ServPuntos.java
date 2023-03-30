/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Puntos;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServPuntos {
    Scanner scaner = new Scanner(System.in);
    
    //método crearPuntos() que le pide al usuario los dos números
    public Puntos crearPuntos(){
        Puntos points = new Puntos();
        System.out.println("--------------------------------------------------");
        System.out.println("          INGRESE EL VALOR DE LOS PUNTOS          ");
        System.out.println("--------------------------------------------------");
        System.out.print("   * X1: ");
        points.setX1(scaner.nextDouble());
        System.out.print("   * Y1: ");
        points.setY1(scaner.nextDouble());
        System.out.print("   * X2: ");
        points.setX2(scaner.nextDouble());
        System.out.print("   * Y2: ");
        points.setY2(scaner.nextDouble());
        
        
        return points;
    }
    
    //Metodo calcular la distancia entre los puntos
    public void calcularDistancia(Puntos punt){
        double restaX, restaY, distancia;
        
        DecimalFormat formato = new DecimalFormat("#.###");
        //d = raiz([X2 - X1]^2 + [Y2 - Y1]^2)
        restaX = Math.pow((punt.getX2() - punt.getX1()), 2) ;
        restaY = Math.pow((punt.getY2() - punt.getY1()), 2);
        
        distancia = Math.sqrt((restaX+restaY));
        System.out.println("--------------------------------------------------");
        System.out.println("     D(P1,P2) = " + formato.format(distancia));
    }
}
