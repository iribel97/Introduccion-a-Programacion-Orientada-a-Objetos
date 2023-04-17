/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Triangulo;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServicioTriangulo {

    //Instanciar los 5 objetos
    Triangulo[] triangle = new Triangulo[5];
    //Vector que guarde el perimetro de cada uno
    double[] perimetro = new double[5];
    //Vector que te guarde el area
    double[] area = new double[5];
    //Instanciar Scanner
    Scanner scaner = new Scanner(System.in);

    //Crear los objetos
    public Triangulo[] crearTriangulo() {
        System.out.println("--------------------------------------------------");
        System.out.println("           INGRESE LOS SIGUIENTES DATOS           ");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new Triangulo();
            System.out.println("--------------------------------------------------");
            System.out.println("                 TRIANGULO ISOSELES #" + (i+1));
            System.out.println("--------------------------------------------------");
            
        }

        return triangle;
    }
}
